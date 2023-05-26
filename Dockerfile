# Utiliza una imagen base de Java
FROM openjdk:17

# Instala Nginx
RUN apt-get update && apt-get install -y nginx

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia los archivos de tu proyecto al contenedor
COPY . /app

# Compila el proyecto
RUN ./mvnw clean package

# Copia el archivo WAR al directorio de despliegue de Tomcat
RUN cp /app/target/Backend-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps

# Copia el archivo de configuración de Nginx
COPY nginx.conf /etc/nginx/conf.d/default.conf

# Expone los puertos 8080 y 80
EXPOSE 8080
EXPOSE 80

# Inicia el servidor Tomcat
CMD ["catalina.sh", "run"]
