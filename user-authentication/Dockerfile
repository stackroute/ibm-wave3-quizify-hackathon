FROM openjdk:11.0-jdk
ADD ./target/user-authentication-0.0.1-SNAPSHOT.jar /muzix/app/user-authentication-0.0.1-SNAPSHOT.jar
WORKDIR muzix/app
ENTRYPOINT ["java", "-jar", "user-authentication-0.0.1-SNAPSHOT.jar"]
