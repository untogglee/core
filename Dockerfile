FROM ghcr.io/graalvm/native-image-community:25 AS builder

WORKDIR /build
ENV LANG=C.UTF-8

COPY mvnw .
COPY .mvn .mvn

COPY pom.xml .
COPY app/pom.xml app/pom.xml

RUN ./mvnw -B -q -DskipTests dependency:go-offline

COPY . .

RUN ./mvnw -DskipTests -Pnative package

FROM gcr.io/distroless/base

WORKDIR /app

COPY --from=builder /build/app/target/app .

ENTRYPOINT ["./app"]