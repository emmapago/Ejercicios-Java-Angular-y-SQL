CREATE DATABASE investigadores;
USE investigadores;
CREATE TABLE investigadores (
	DNI VARCHAR(8) NOT NULL,
	nomApels NVARCHAR (255) NOT NULL,
	facultat INT NOT NULL,
	CONSTRAINT PRIMARY KEY (DNI),
	FOREIGN KEY (facultat) REFERENCES equipos (facultat)
    ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE=InnoDB;

CREATE TABLE reserva (
	DNI VARCHAR(8) NOT NULL,
	numSerie CHAR(4) NOT NULL,
	comienzo DATETIME NOT NULL,
	fin DATETIME NOT NULL,
	CONSTRAINT PRIMARY KEY (DNI, numSerie),
    FOREIGN KEY (DNI) REFERENCES investigadores (DNI),
    FOREIGN KEY (numSerie) REFERENCES equipos (numSerie)
    ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE=InnoDB;

CREATE TABLE equipos (
	numSerie CHAR(4) NOT NULL,
	nombre NVARCHAR(100) NOT NULL,
	facultat INT NOT NULL,
	CONSTRAINT PRIMARY KEY (numSerie),
    FOREIGN KEY (facultat) REFERENCES investigadores (facultat)
    ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE=InnoDB;

INSERT INTO investigadores VALUES (39922711,"Emma",1);
INSERT INTO investigadores VALUES (22914711,"Sara",2);
INSERT INTO investigadores VALUES (11996711,"David",3);
INSERT INTO investigadores VALUES (33918711,"Victor",4);
INSERT INTO investigadores VALUES (56915511,"Jose",5);
INSERT INTO investigadores VALUES (40912711,"Noelia",6);
INSERT INTO investigadores VALUES (30916711,"Ingrid",7);
INSERT INTO investigadores VALUES (72913711,"Albert",8);
INSERT INTO investigadores VALUES (82915711,"Nicol",9);
INSERT INTO investigadores VALUES (33919711,"Sergio",10);

INSERT INTO reserva VALUES (39919711,"numSerie1",30/05,12/12);
INSERT INTO reserva VALUES (39919411,"numSerie2",20/05,12/12);
INSERT INTO reserva VALUES (39919811,"numSerie3",10/05,12/12);
INSERT INTO reserva VALUES (39919211,"numSerie4",30/05,12/12);
INSERT INTO reserva VALUES (39919111,"numSerie5",5/05,12/12);
INSERT INTO reserva VALUES (39916611,"numSerie6",3/05,12/12);
INSERT INTO reserva VALUES (39919311,"numSerie7",2/05,12/12);
INSERT INTO reserva VALUES (39919511,"numSerie8",20/05,12/12);
INSERT INTO reserva VALUES (39912211,"numSerie9",30/05,12/12);
INSERT INTO reserva VALUES (39915111,"numSerie10",10/05,12/12);

INSERT INTO equipos VALUES ("numSerie1","nombre1","facultat1");
INSERT INTO equipos VALUES ("numSerie2","nombre2","facultat2");
INSERT INTO equipos VALUES ("numSerie3","nombre3","facultat3");
INSERT INTO equipos VALUES ("numSerie4","nombre4","facultat4");
INSERT INTO equipos VALUES ("numSerie5","nombre5","facultat5");
INSERT INTO equipos VALUES ("numSerie6","nombre6","facultat6");
INSERT INTO equipos VALUES ("numSerie7","nombre7","facultat7");
INSERT INTO equipos VALUES ("numSerie8","nombre8","facultat8");
INSERT INTO equipos VALUES ("numSerie9","nombre9","facultat9");
INSERT INTO equipos VALUES ("numSerie10","nombre10","facultat10");
