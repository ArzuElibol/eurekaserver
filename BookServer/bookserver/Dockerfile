FROM openjdk:17
COPY target/bookserver-0.0.1-SNAPSHOT.jar bookserver.jar
EXPOSE 9090
ENTRYPOINT exec java $JAVA_OPTS -jar bookserver.jar
