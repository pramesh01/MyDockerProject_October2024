FROM bellsoft/liberica-openjdk-alpine:23
RUN apk add curl jq
WORKDIR /home/MyProject
ADD target/docker-resources ./
ADD runner.sh  runner.sh
ENTRYPOINT sh runner.sh