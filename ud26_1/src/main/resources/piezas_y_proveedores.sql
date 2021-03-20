CREATE DATABASE piezas_y_proveedores;
USE piezas_y_proveedores;
CREATE TABLE piezas (
codigo INT UNSIGNED,
nombre NVARCHAR (100) NOT NULL,
CONSTRAINT PRIMARY KEY (codigo)
)ENGINE=InnoDB;

CREATE TABLE suministra (
codigoPieza INT UNSIGNED,
idProveedor CHAR(4) NOT NULL,
precio INT NOT NULL,
CONSTRAINT PRIMARY KEY (codigoPieza, idProveedor),
FOREIGN KEY (codigoPieza) REFERENCES piezas (codigo),
FOREIGN KEY (idProveedor) REFERENCES proveedores (id)
ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE=InnoDB;

CREATE TABLE proveedores (
id CHAR(4) NOT NULL UNIQUE,
nombre NVARCHAR(100) NOT NULL,
CONSTRAINT PRIMARY KEY (id)
) ENGINE=InnoDB;

INSERT INTO piezas VALUES (1,"nombre1");
INSERT INTO piezas VALUES (2,"nombre2");
INSERT INTO piezas VALUES (3,"nombre3");
INSERT INTO piezas VALUES (4,"nombre4");
INSERT INTO piezas VALUES (5,"nombre5");
INSERT INTO piezas VALUES (6,"nombre6");
INSERT INTO piezas VALUES (7,"nombre7");
INSERT INTO piezas VALUES (8,"nombre8");
INSERT INTO piezas VALUES (9,"nombre9");
INSERT INTO piezas VALUES (10,"nombre10");

INSERT INTO suministra VALUES (1,"idproveedor1",50);
INSERT INTO suministra VALUES (2,"idproveedor2",20);
INSERT INTO suministra VALUES (3,"idproveedor3",10);
INSERT INTO suministra VALUES (4,"idproveedor4",80);
INSERT INTO suministra VALUES (5,"idproveedor5",20);
INSERT INTO suministra VALUES (6,"idproveedor6",10);
INSERT INTO suministra VALUES (7,"idproveedor7",5);
INSERT INTO suministra VALUES (8,"idproveedor8",80);
INSERT INTO suministra VALUES (9,"idproveedor9",10);
INSERT INTO suministra VALUES (10,"idproveedor10",50);

INSERT INTO proveedores VALUES ("id1","nombre1");
INSERT INTO proveedores VALUES ("id2","nombre2");
INSERT INTO proveedores VALUES ("id3","nombre3");
INSERT INTO proveedores VALUES ("id4","nombre4");
INSERT INTO proveedores VALUES ("id5","nombre5");
INSERT INTO proveedores VALUES ("id6","nombre6");
INSERT INTO proveedores VALUES ("id7","nombre7");
INSERT INTO proveedores VALUES ("id8","nombre8");
INSERT INTO proveedores VALUES ("id9","nombre9");
INSERT INTO proveedores VALUES ("id10","nombre10");
