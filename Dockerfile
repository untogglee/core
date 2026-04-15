FROM ghcr.io/graalvm/native-image-community:25 AS builder

WORKDIR /build

COPY . .

ENV LANG=C.UTF-8

RUN ./mvnw -DskipTests -Pnative package

FROM gcr.io/distroless/base

WORKDIR /app

COPY --from=builder /build/app/target/app .

ENTRYPOINT ["./app"]