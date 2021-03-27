package es.http.service.service;

import java.util.List;

import es.http.service.dto.Reserva;



public interface IReservaService {

	//Metodos del CRUD
		public List<Reserva> listarReservas(); //Listar All 
		
		public Reserva guardarReserva(Reserva reserva);	//Guarda un cajero CREATE
		
		public Reserva reservaXID(int id); //Leer datos de un cajero READ
		
		public Reserva actualizarReserva(Reserva reserva); //Actualiza datos del cajero UPDATE
		
		public void eliminarReserva(int id);// Elimina el cajero DELETE
	

}


