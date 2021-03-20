CREATE DATABASE peliculas_y_salas;
USE peliculas_y_salas;
CREATE TABLE salas (
codigo INT,
nombre NVARCHAR (100),
pelicula INT,
PRIMARY KEY (codigo),
FOREIGN KEY (pelicula) REFERENCES peliculas (codigo)
ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE=InnoDB;

CREATE TABLE peliculas (
codigo INT,
nombre NVARCHAR (100),
calificacionEdad INT,
PRIMARY KEY (codigo)
)ENGINE=InnoDB;

INSERT INTO peliculas (codigo, nombre, calificacionEdad) VALUES (1,"Madagascar",8);
INSERT INTO peliculas (codigo, nombre, calificacionEdad) VALUES (2,"REC",16);
INSERT INTO peliculas (codigo, nombre, calificacionEdad) VALUES (3,"Imposible",12);
INSERT INTO peliculas (codigo, nombre, calificacionEdad) VALUES (4,"Inside out",8);
INSERT INTO peliculas (codigo, nombre, calificacionEdad) VALUES (5,"Gru: Mi villano favorito",4);
INSERT INTO peliculas (codigo, nombre, calificacionEdad) VALUES (6,"100 metros",12);
INSERT INTO peliculas (codigo, nombre, calificacionEdad) VALUES (7,"Infierno azul",12);
INSERT INTO peliculas (codigo, nombre, calificacionEdad) VALUES (8,"Hasta el cielo",16);
INSERT INTO peliculas (codigo, nombre, calificacionEdad) VALUES (9,"Los Simpson",8);
INSERT INTO peliculas (codigo, nombre, calificacionEdad) VALUES (10,"3 metros sobre el cielo",12);


INSERT INTO salas (codigo, nombre, pelicula) VALUES (1,"Sala1","001");
INSERT INTO salas (codigo, nombre, pelicula) VALUES (2,"Sala2","002");
INSERT INTO salas (codigo, nombre, pelicula) VALUES (3,"Sala3","003");
INSERT INTO salas (codigo, nombre, pelicula) VALUES (4,"Sala4","004");
INSERT INTO salas (codigo, nombre, pelicula) VALUES (5,"Sala5","005");
INSERT INTO salas (codigo, nombre, pelicula) VALUES (6,"Sala6","006");
INSERT INTO salas (codigo, nombre, pelicula) VALUES (7,"Sala7","007");
INSERT INTO salas (codigo, nombre, pelicula) VALUES (8,"Sala8","008");
INSERT INTO salas (codigo, nombre, pelicula) VALUES (9,"Sala9","009");
INSERT INTO salas (codigo, nombre, pelicula) VALUES (10,"Sala10","0010");


SELECT nombre FROM peliculas;
SELECT DISTINCT calificacionEdad FROM peliculas;
SELECT * FROM salas WHERE pelicula IS NULL;
SELECT * FROM peliculas WHERE calificacionEdad IS NULL;
SELECT * FROM salas RIGHT JOIN peliculas ON salas.pelicula=peliculas.codigo;
INSERT INTO peliculas (codigo ,nombre, calificacionEdad) VALUES (11,"Uno, dos y tres", 7);
SELECT * FROM salas LEFT JOIN peliculas ON salas.pelicula=peliculas.codigo;
UPDATE peliculas SET calificacionEdad=12 WHERE calificaionEdad IS NULL;
