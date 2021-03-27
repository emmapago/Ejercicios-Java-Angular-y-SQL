CREATE DATABASE grandes_almacenes;
USE grandes_almacenes;
CREATE TABLE cajeros (
codigo INT NOT NULL UNIQUE,
nomApels NVARCHAR (255) NOT NULL,
PRIMARY KEY (codigo)
)ENGINE=InnoDB;

CREATE TABLE productos (
codigo INT NOT NULL UNIQUE,
nombre NVARCHAR (100) NOT NULL,
precio INT NOT NULL,
PRIMARY KEY (codigo)
)ENGINE=InnoDB;

CREATE TABLE venta (
cajero INT NOT NULL,
maquina INT NOT NULL,
producto INT NOT NULL,
PRIMARY KEY (cajero, maquina, producto),
FOREIGN KEY (cajero) REFERENCES cajeros (codigo),
FOREIGN KEY (maquina) REFERENCES maquinas_registradoras (codigo),
FOREIGN KEY (producto) REFERENCES productos (codigo)
ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE=InnoDB;

CREATE TABLE maquinas_registradoras (
codigo INT NOT NULL UNIQUE,
piso INT NOT NULL,
PRIMARY KEY (codigo)
)ENGINE=InnoDB;

INSERT INTO cajeros VALUES (1,"nombre1");
INSERT INTO cajeros VALUES (2,"nombre2");
INSERT INTO cajeros VALUES (3,"nombre3");
INSERT INTO cajeros VALUES (4,"nombre4");
INSERT INTO cajeros VALUES (5,"nombre5");
INSERT INTO cajeros VALUES (6,"nombre6");
INSERT INTO cajeros VALUES (7,"nombre7");
INSERT INTO cajeros VALUES (8,"nombre8");
INSERT INTO cajeros VALUES (9,"nombre9");
INSERT INTO cajeros VALUES (10,"nombre10");

INSERT INTO productos VALUES (1,"nombre1",70);
INSERT INTO productos VALUES (2,"nombre2",40);
INSERT INTO productos VALUES (3,"nombre3",50);
INSERT INTO productos VALUES (4,"nombre4",70);
INSERT INTO productos VALUES (5,"nombre5",20);
INSERT INTO productos VALUES (6,"nombre6",10);
INSERT INTO productos VALUES (7,"nombre7",90);
INSERT INTO productos VALUES (8,"nombre8",10);
INSERT INTO productos VALUES (9,"nombre9",60);
INSERT INTO productos VALUES (10,"nombre10",30);

INSERT INTO venta VALUES ("cajero1","maquina1","producto1");
INSERT INTO venta VALUES ("cajero2","maquina2","producto2");
INSERT INTO venta VALUES ("cajero3","maquina3","producto3");
INSERT INTO venta VALUES ("cajero4","maquina4","producto4");
INSERT INTO venta VALUES ("cajero5","maquina5","producto5");
INSERT INTO venta VALUES ("cajero6","maquina6","producto6");
INSERT INTO venta VALUES ("cajero7","maquina7","producto7");
INSERT INTO venta VALUES ("cajero8","maquina8","producto8");
INSERT INTO venta VALUES ("cajero9","maquina9","producto9");
INSERT INTO venta VALUES ("cajero10","maquina10","producto10");

INSERT INTO maquinas_registradoras VALUES ("codigo1","piso1");
INSERT INTO maquinas_registradoras VALUES ("codigo2","piso2");
INSERT INTO maquinas_registradoras VALUES ("codigo3","piso3");
INSERT INTO maquinas_registradoras VALUES ("codigo4","piso4");
INSERT INTO maquinas_registradoras VALUES ("codigo5","piso5");
INSERT INTO maquinas_registradoras VALUES ("codigo6","piso6");
INSERT INTO maquinas_registradoras VALUES ("codigo7","piso7");
INSERT INTO maquinas_registradoras VALUES ("codigo8","piso8");
INSERT INTO maquinas_registradoras VALUES ("codigo9","piso9");
INSERT INTO maquinas_registradoras VALUES ("codigo10","piso10");