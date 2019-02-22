FROM openjdk:11

ADD ./target/signle-player-engine-0.0.1-SNAPSHOT.jar /event/src/signle-player-engine-0.0.1-SNAPSHOT.jar
EXPOSE 8095
WORKDIR event/src
ENTRYPOINT ["java","-jar","signle-player-engine-0.0.1-SNAPSHOT.jar"]

