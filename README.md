# developersAPISpringBoot
REST API for CRUD Developers, developed with SpringBoot framework.

Ejecucion construccion y ejecucion del contenedor.

docker build -t developerapp .

docker run -p 8080:8080 -t developerapp --env PORT='8080' \
SPRING_DATASOURCE_URL='jdbc:postgresql://ec2-35-169-254-43.compute-1.amazonaws.com:5432/dejvr1s90onumd' \
SPRING_DATASOURCE_USERNAME='jndadgiufdxnzf' \
SPRING_DATASOURCE_PASSWORD='f58c32f24649d8321c90869f0612137be57417d7cf797a76a490d9d350884224'

El comando de arriba tiene configurado, la base de datos en Heroku, y el puerto 8080.

BASE DE DATOS
El schema y codigo SQL se encuentra ubicado en: /src/test/java/com/example/developer