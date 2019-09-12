FROM openjdk:8-jdk-alpine
ADD ./target/AlphaBoot-release/AlphaBoot /app
WORKDIR /app
ENTRYPOINT ["java","-Xverify:none","-cp","/app/config:/app/lib/*","com.bussanq.group.alpha.Application"]