FROM gradle:8-jdk23 AS build

COPY src /app/src
COPY settings.gradle /app
COPY build.gradle /app

WORKDIR /app
RUN gradle bootJar --no-daemon

FROM openjdk:23
VOLUME [ "/tmp" ]
COPY --from=build /app/build/libs/gndwrk.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]