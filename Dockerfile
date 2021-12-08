FROM gradle:7-jdk-alpine AS BUILD
COPY . .
RUN gradle bootJar

FROM openjdk:16-alpine
#RUN ls usr/lib
COPY --from=BUILD /home/gradle/build/libs/s*.jar ./app.jar
CMD ["/bin/sh", "-c", "java -jar app*.jar"]