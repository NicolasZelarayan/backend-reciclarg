# Utiliza una imagen base de Java
FROM openjdk:17

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia los archivos de tu proyecto al contenedor
COPY . /app

# Compila el proyecto
RUN ./mvnw clean package

# Copia el archivo WAR al directorio de despliegue de Tomcat
RUN cp /app/target/Backend-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps

# Expone el puerto 8080 para acceder a la aplicación
EXPOSE 8080

# Inicia el servidor Tomcat
CMD ["catalina.sh", "run"]
