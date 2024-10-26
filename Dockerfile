#Utilizar imagen de jdk 21
FROM eclipse-temurin:21-jdk-alpine

#Crear directorio para la aplicación
VOLUME /tmp

ARG JAR_FILE=target/app-docker-mysql-pena-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar

#Exponer el puerto que utiliza la aplicación en el contenedor
EXPOSE 8080

#Ejecutar el archivo JAR cuando inicie el contenedor
ENTRYPOINT ["java","-jar","/app.jar"]