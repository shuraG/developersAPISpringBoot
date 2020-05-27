create table developer(
  codigo serial,
  nombres_completos varchar(70),
  link_github varchar(70),
  primary key (codigo)
 );

create table tecnologia_conocida(
    codigo serial,
    nombre varchar(15),
    codigo_developer smallint references developer(codigo),
    primary key (codigo)
 );

 INSERT INTO developer(nombres_completos, link_github) 
 VALUES ('Juan Cordova Fetucci', 'https://github.com/shuraG');

 

INSERT INTO tecnologia_conocida(nombre, codigo_developer) 
VALUES ('Java EE', 10);
INSERT INTO tecnologia_conocida(nombre, codigo_developer) 
VALUES ('Scala', 1);


export PORT=8080
export SPRING_DATASOURCE_URL=jdbc:postgresql://ec2-35-169-254-43.compute-1.amazonaws.com:5432/dejvr1s90onumd
export SPRING_DATASOURCE_USERNAME=jndadgiufdxnzf
export SPRING_DATASOURCE_PASSWORD=f58c32f24649d8321c90869f0612137be57417d7cf797a76a490d9d350884224

ENTRYPOINT ["java","-jar $JAVA_OPTS","/app.jar"]