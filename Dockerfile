#image to build from
FROM openjdk:16-jdk-alpine

#Create user as its not advisable to run as root user
RUN addgroup -S spring && adduser -S springuser -G spring
USER springuser

#Create working dir spring user
WORKDIR /home/springuser

#copy file(s) from host to image
ARG JAR_FILE=build/libs/springrest-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

#configure  main process executable command
ENTRYPOINT ["java","-Xmx512m","-Xmx256m","-jar","app.jar"]