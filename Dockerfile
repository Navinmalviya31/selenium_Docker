FROM openjdk:8u191-jre-alpine3.8

RUN apk add curl jq

#create workspace
WORKDIR /USERS/malvi/docker
#add .jar files from target to image
ADD target/selenium-docker.jar selenium-docker.jar
ADD target/selenium-docker-tests.jar selenium-docker-tests.jar
ADD target/libs  libs

# add suite files
ADD searchModule.xml  searchModule.xml

#add healthcheck
ADD healthCheck.sh  healthCheck.sh

#Browser
#HUB_HOST
#Module
ENTRYPOINT sh healthCheck.sh