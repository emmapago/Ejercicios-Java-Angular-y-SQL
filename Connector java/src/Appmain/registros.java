package Appmain;

import ud18_ejercicio1.articulos;
import ud18_ejercicio1.fabricantes;
import ud18_ejercicio2.departamentos;
import ud18_ejercicio2.empleados;
import ud18_ejercicio3.almacenes;
import ud18_ejercicio3.cajas;
import ud18_ejercicio4.peliculas;
import ud18_ejercicio4.salas;
import ud18_ejercicio5.despachos;
import ud18_ejercicio5.directores;
import ud18_ejercicio6.piezas;
import ud18_ejercicio6.proveedores;
import ud18_ejercicio6.suministra;
import ud18_ejercicio7.cajeros;
import ud18_ejercicio7.maquinas_registradoras;
import ud18_ejercicio7.productos;
import ud18_ejercicio7.venta;
import ud18_ejercicio8.equipos;
import ud18_ejercicio8.facultat;
import ud18_ejercicio8.investigadores;
import ud18_ejercicio8.reserva;
import ud18_ejercicio9.asignado_a;
import ud18_ejercicio9.cientificos;
import ud18_ejercicio9.proyecto;

public class registros {

	public static void main(String[] args) {
		
		// Añadir 5 registros a las tablas de los ejercicios//
		conector.openConnection();
		conector.createDB("ud18_ejercicio1");
		
		articulos.createTable("ud18_ejercicio1", "articulos");
		articulos.insertData("ud18_ejercicio1", "articulos", "articulo1", 10, "fabricante1");
		articulos.insertData("ud18_ejercicio1", "articulos", "articulo2", 20, "fabricante2");
		articulos.insertData("ud18_ejercicio1", "articulos", "articulo3", 22, "fabricante3");
		articulos.insertData("ud18_ejercicio1", "articulos", "articulo4", 45, "fabricante4");
		articulos.insertData("ud18_ejercicio1", "articulos", "articulo5", 50, "fabricante5");
		articulos.getValues("ud18_ejercicio1", "articulos");

		articulos.createTable("ud18_ejercicio1", "fabricantes");
		fabricantes.insertData("ud18_ejercicio1", "fabricantes", "fabricante1");
		fabricantes.insertData("ud18_ejercicio1", "fabricantes", "fabricante2");
		fabricantes.insertData("ud18_ejercicio1", "fabricantes", "fabricante3");
		fabricantes.insertData("ud18_ejercicio1", "fabricantes", "fabricante4");
		fabricantes.insertData("ud18_ejercicio1", "fabricantes", "fabricante5");
		fabricantes.getValues("ud18_ejercicio1", "fabricantes");
		
		conector.createDB("ud18_ejercicio2");
		departamentos.createTable("ud18_ejercicio2", "departamentos");
		departamentos.insertData("ud18_ejercicio2", "departamentos", "departamento1", 100);
		departamentos.insertData("ud18_ejercicio2", "departamentos", "departamento2", 520);
		departamentos.insertData("ud18_ejercicio2", "departamentos", "departamento3", 200);
		departamentos.insertData("ud18_ejercicio2", "departamentos", "departamento4", 50);
		departamentos.insertData("ud18_ejercicio2", "departamentos", "departamento5", 800);
		departamentos.getValues("ud18_ejercicio2", "departamentos");
		
		empleados.createTable("ud18_ejercicio2", "empleados");
		empleados.insertData("ud18_ejercicio2", "empleados", "Emma", "Pareja", 1);
		empleados.insertData("ud18_ejercicio2", "empleados", "Victor", "Lozano", 2);
		empleados.insertData("ud18_ejercicio2", "empleados", "David", "Lascorz", 3);
		empleados.insertData("ud18_ejercicio2", "empleados", "Jose", "Marín", 4);
		empleados.insertData("ud18_ejercicio2", "empleados", "Estefania", "Colombo", 5);
		empleados.getValues("ud18_ejercicio2", "empleados");
		
		conector.createDB("ud18_ejercicio3");
		almacenes.createTable("ud18_ejercicio3", "almacenes");
		almacenes.insertData("ud18_ejercicio3", "almacenes", "almacen1", "Cambrils", 10);
		almacenes.insertData("ud18_ejercicio3", "almacenes", "almacen2", "Reus", 20);
		almacenes.insertData("ud18_ejercicio3", "almacenes", "almacen3", "Tarragona", 5);
		almacenes.insertData("ud18_ejercicio3", "almacenes", "almacen4", "Vilaseca", 22);
		almacenes.insertData("ud18_ejercicio3", "almacenes", "almacen5", "Salou", 40);
		almacenes.getValues("ud18_ejercicio3", "almacenes");
		
		cajas.createTable("ud18_ejercicio3", "cajas");
		cajas.insertData("ud18_ejercicio3", "cajas", "almacen1", "Camisetas", 50, 1);
		cajas.insertData("ud18_ejercicio3", "cajas", "almacen2", "Estuches", 20, 2);
		cajas.insertData("ud18_ejercicio3", "cajas", "almacen3", "Pantallas", 70, 3);
		cajas.insertData("ud18_ejercicio3", "cajas", "almacen4", "Libretas", 50, 4);
		cajas.insertData("ud18_ejercicio3", "cajas", "almacen5", "Teclados", 100, 5);
		cajas.getValues("ud18_ejercicio3", "cajas");
		
		conector.createDB("ud18_ejercicio4");
		peliculas.createTable("ud18_ejercicio4", "peliculas");
		peliculas.insertData("ud18_ejercicio4", "peliculas", "codigo1", "Buscando a nemo", 6);
		peliculas.insertData("ud18_ejercicio4", "peliculas", "codigo2", "REC", 14);
		peliculas.insertData("ud18_ejercicio4", "peliculas", "codigo3", "Megalodon", 8);
		peliculas.insertData("ud18_ejercicio4", "peliculas", "codigo4", "Gru: mi villano favorito", 6);
		peliculas.insertData("ud18_ejercicio4", "peliculas", "codigo5", "Inside out", 12);
		peliculas.getValues("ud18_ejercicio4", "peliculas");

		salas.createTable("ud18_ejercicio4", "salas");
		salas.insertData("ud18_ejercicio4", "salas", 1, "sala1", 1);
		salas.insertData("ud18_ejercicio4", "salas", 2, "sala2", 2);
		salas.insertData("ud18_ejercicio4", "salas", 3, "sala3", 3);
		salas.insertData("ud18_ejercicio4", "salas", 4, "sala4", 4);
		salas.insertData("ud18_ejercicio4", "salas", 5, "sala5", 5);
		salas.getValues("ud18_ejercicio4", "salas");
	
		conector.createDB("ud18_ejercicio5");
		despachos.insertData("ud18_ejercicio5", "despachos", 1, 10);
		despachos.insertData("ud18_ejercicio5", "despachos", 2, 5);
		despachos.insertData("ud18_ejercicio5", "despachos", 3, 20);
		despachos.insertData("ud18_ejercicio5", "despachos", 4, 10);
		despachos.insertData("ud18_ejercicio5", "despachos", 5, 15);
		despachos.getValues("ud18_ejercicio5", "despachos");
		
		directores.createTable("ud18_ejercicio5", "directores");
		directores.insertData("ud18_ejercicio5", "directores", 39945722, "Emma Pareja", 12365478, 1);
		directores.insertData("ud18_ejercicio5", "directores", 12365485, "David Lascorz", 44120354, 2);
		directores.insertData("ud18_ejercicio5", "directores", 20136520, "Christian Rivas", 03214521, 3);
		directores.insertData("ud18_ejercicio5", "directores", 98564785, "Jose Marín", 12321232, 4);
		directores.insertData("ud18_ejercicio5", "directores", 66458932, "Victor Lozano", 36985201, 5);
		directores.getValues("ud18_ejercicio5", "directores");

		conector.createDB("ud18_ejercicio6");
		piezas.createTable("ud18_ejercicio6", "piezas");
		piezas.insertData("ud18_ejercicio6", "piezas", 1, "pieza1");
		piezas.insertData("ud18_ejercicio6", "piezas", 2, "pieza2");
		piezas.insertData("ud18_ejercicio6", "piezas", 3, "pieza3");
		piezas.insertData("ud18_ejercicio6", "piezas", 4, "pieza4");
		piezas.insertData("ud18_ejercicio6", "piezas", 5, "pieza5");
		piezas.getValues("ud18_ejercicio6", "piezas");
		
		proveedores.createTable("ud18_ejercicio6", "proveedores");
		proveedores.insertData("ud18_ejercicio6", "proveedores", 1, "proveedor1");
		proveedores.insertData("ud18_ejercicio6", "proveedores", 2, "proveedor2");
		proveedores.insertData("ud18_ejercicio6", "proveedores", 3, "proveedor3");
		proveedores.insertData("ud18_ejercicio6", "proveedores", 4, "proveedor4");
		proveedores.insertData("ud18_ejercicio6", "proveedores", 5, "proveedor5");
		proveedores.getValues("ud18_ejercicio6", "proveedores");
		
		suministra.createTable("ud18_ejercicio6", "suministra");
		suministra.insertData("ud18_ejercicio6", "suministra", 1, "idproveedor", 10);
		suministra.insertData("ud18_ejercicio6", "suministra", 2, "idproveedor", 20);
		suministra.insertData("ud18_ejercicio6", "suministra", 3, "idproveedor", 5);
		suministra.insertData("ud18_ejercicio6", "suministra", 4, "idproveedor", 30);
		suministra.insertData("ud18_ejercicio6", "suministra", 5, "idproveedor", 10);
		suministra.getValues("ud18_ejercicio6", "suministra");
		
		conector.createDB("ud18_ejercicio7");
		cajeros.createTable("ud18_ejercicio7", "cajeros");
		cajeros.insertData("ud18_ejercicio7", "cajeros", 1, "Emma Pareja");
		cajeros.insertData("ud18_ejercicio7", "cajeros", 2, "Christian Rivas");
		cajeros.insertData("ud18_ejercicio7", "cajeros", 3, "David Lascorz");
		cajeros.insertData("ud18_ejercicio7", "cajeros", 4, "Jose Marín");
		cajeros.insertData("ud18_ejercicio7", "cajeros", 5, "Victor Lozano");
		cajeros.getValues("ud18_ejercicio7", "cajeros");
		
		maquinas_registradoras.createTable("ud18_ejercicio7", "maquinas_registradoras");
		maquinas_registradoras.insertData("ud18_ejercicio7", "maquinas_registradoras", 111, 1);
		maquinas_registradoras.insertData("ud18_ejercicio7", "maquinas_registradoras", 222, 2);
		maquinas_registradoras.insertData("ud18_ejercicio7", "maquinas_registradoras", 333, 3);
		maquinas_registradoras.insertData("ud18_ejercicio7", "maquinas_registradoras", 444, 4);
		maquinas_registradoras.insertData("ud18_ejercicio7", "maquinas_registradoras", 555, 5);
		maquinas_registradoras.getValues("ud18_ejercicio7", "maquinas_registradoras");
		
		productos.createTable("ud18_ejercicio7", "productos");
		productos.insertData("ud18_ejercicio7", "productos", 1, "aspiradora", 70);
		productos.insertData("ud18_ejercicio7", "productos", 2, "boligrafo", 2);
		productos.insertData("ud18_ejercicio7", "productos", 3, "ordenador", 500);
		productos.insertData("ud18_ejercicio7", "productos", 4, "pantalla", 200);
		productos.insertData("ud18_ejercicio7", "productos", 5, "estuche", 8);
		productos.getValues("ud18_ejercicio7", "productos");
		
		venta.createTable("ud18_ejercicio7", "venta");
		venta.insertData("ud18_ejercicio7", "productos", 111, 1, 1);
		venta.insertData("ud18_ejercicio7", "productos", 222, 2, 1);
		venta.insertData("ud18_ejercicio7", "productos", 333, 3, 3);
		venta.insertData("ud18_ejercicio7", "productos", 444, 4, 1);
		venta.insertData("ud18_ejercicio7", "productos", 555, 5, 1);
		venta.getValues("ud18_ejercicio7", "productos");
		

		conector.createDB("ud18_ejercicio8");
		equipos.createTable("ud18_ejercicio8", "equipos");
		equipos.insertData("ud18_ejercicio8", "equipos", 123, "Equipo1", 1);
		equipos.insertData("ud18_ejercicio8", "equipos", 235, "Equipo2", 2);
		equipos.insertData("ud18_ejercicio8", "equipos", 111, "Equipo3", 3);
		equipos.insertData("ud18_ejercicio8", "equipos", 856, "Equipo4", 4);
		equipos.insertData("ud18_ejercicio8", "equipos", 002, "Equipo5", 5);
		equipos.getValues("ud18_ejercicio8", "equipos");
		
		facultat.createTable("ud18_ejercicio8", "facultat");
		facultat.insertData("ud18_ejercicio8", "equipos", 1, "URV");
		facultat.insertData("ud18_ejercicio8", "equipos", 2, "Complutense");
		facultat.insertData("ud18_ejercicio8", "equipos", 3, "Laboral");
		facultat.insertData("ud18_ejercicio8", "equipos", 4, "URV");
		facultat.insertData("ud18_ejercicio8", "equipos", 5, "Harvard");
		facultat.getValues("ud18_ejercicio8", "equipos");
		
		investigadores.createTable("ud18_ejercicio8", "investigadores");
		investigadores.insertData("ud18_ejercicio8", "investigadores", 12365478, "Emma Pareja", 1);
		investigadores.insertData("ud18_ejercicio8", "investigadores", 36520123, "Christian Rivas", 2);
		investigadores.insertData("ud18_ejercicio8", "investigadores", 96325874, "David Lascorz", 3);
		investigadores.insertData("ud18_ejercicio8", "investigadores", 11223365, "Jose Marín", 4);
		investigadores.insertData("ud18_ejercicio8", "investigadores", 45214563, "Victor Lozano", 5);
		investigadores.getValues("ud18_ejercicio8", "investigadores");
		
		reserva.createTable("ud18_ejercicio8", "reserva");
		reserva.insertData("ud18_ejercicio8", "reserva", 12365478, 1, 25/05/2002, 25/05/2012);
		reserva.insertData("ud18_ejercicio8", "reserva", 20236548, 2, 18/02/2020, 02/10/2021);
		reserva.insertData("ud18_ejercicio8", "reserva", 02145632, 3, 30/9/2013, 16/02/2005);
		reserva.insertData("ud18_ejercicio8", "reserva", 33665520, 4, 04/04/2015, 04/01/2021);
		reserva.insertData("ud18_ejercicio8", "reserva", 99856321, 5, 15/01/200, 18/02/2020);
		reserva.getValues("ud18_ejercicio8", "reserva");
		
		conector.createDB("ud18_ejercicio9");
		asignado_a.createTable("ud18_ejercicio9", "asignado_a");
		asignado_a.insertData("ud18_ejercicio9", "asignado_a", "cientifico1", "proyecto1");
		asignado_a.insertData("ud18_ejercicio9", "asignado_a", "cientifico2", "proyecto2");
		asignado_a.insertData("ud18_ejercicio9", "asignado_a", "cientifico3", "proyecto3");
		asignado_a.insertData("ud18_ejercicio9", "asignado_a", "cientifico4", "proyecto4");
		asignado_a.insertData("ud18_ejercicio9", "asignado_a", "cientifico5", "proyecto5");
		asignado_a.getValues("ud18_ejercicio9", "asignado_a");
		
		cientificos.createTable("ud18_ejercicio9", "cientificos");
		cientificos.insertData("ud18_ejercicio9", "cientificos", 12396548, "Emma Pareja");
		cientificos.insertData("ud18_ejercicio9", "cientificos", 12301230, "David Lascorz");
		cientificos.insertData("ud18_ejercicio9", "cientificos", 36963696, "Christian Rivas");
		cientificos.insertData("ud18_ejercicio9", "cientificos", 25852580, "Jose Marín");
		cientificos.insertData("ud18_ejercicio9", "cientificos", 14741474, "Victor Lozano");
		cientificos.getValues("ud18_ejercicio9", "cientificos");
		
		proyecto.createTable("ud18_ejercicio9", "proyecto");
		proyecto.insertData("ud18_ejercicio9", "cientificos", 1, "proyecto1", 300);
		proyecto.insertData("ud18_ejercicio9", "cientificos", 2, "proyecto2", 250);
		proyecto.insertData("ud18_ejercicio9", "cientificos", 3, "proyecto3", 300);
		proyecto.insertData("ud18_ejercicio9", "cientificos", 4, "proyecto4", 150);
		proyecto.insertData("ud18_ejercicio9", "cientificos", 5, "proyecto5", 350);
		proyecto.getValues("ud18_ejercicio9", "cientificos");









		
		
		
		
		
		
	}
}
