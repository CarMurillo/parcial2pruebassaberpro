FROM openjdk:23
COPY "./target/proyectosaberprocarlos-1.jar" "app.jar"
EXPOSE 9090
ENTRYPOINT [ "java", "-jar", "app.jar" ]
