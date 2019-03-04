FROM openjdk:8-jdk-alpine
MAINTAINER Adilson
LABEL version="1.0"
LABEL description="Micro-serviço Autenticacao." 
VOLUME /tmp
CMD ["/bin/sh"]
ARG JAR_FILE
ARG CERTIFIED
COPY ${JAR_FILE} autenticacao-0.0.1-SNAPSHOT.jar
#COPY ${CERTIFIED} certificado.der
#RUN keytool -importcert -noprompt -keystore $JAVA_HOME/jre/lib/security/cacerts -storepass changeit -file certificado.der
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/autenticacao-0.0.1-SNAPSHOT.jar"]
