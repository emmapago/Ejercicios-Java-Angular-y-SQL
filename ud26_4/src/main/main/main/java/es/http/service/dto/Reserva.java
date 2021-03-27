package es.http.service.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "reserva") // en caso que la tabala sea diferente
public class Reserva {

	// Atributos de entidad suministra
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "dni") // no hace falta si se llama igual
	private int dni;
	@Column(name = "numSerie") // no hace falta si se llama igual
	private String numSerie;
	@Column(name = "comienzo") // no hace falta si se llama igual
	private int comienzo;
	@Column(name = "fin") // no hace falta si se llama igual
	private int fin;

	@ManyToOne
	@JoinColumn(name = "dni")
	private List<Reserva> dni;

	@ManyToOne
	@JoinColumn(name = "numSerie")
	private List<Reserva> numSerie;

	@ManyToOne
	@JoinColumn(name = "comienzo")
	private List<Reserva> comienzo;

	@ManyToOne
	@JoinColumn(name = "fin")
	private List<Reserva> fin;

	// Constructores

	public Reserva() {

	}

	/**
	 * @param dni
	 * @param numSerie
	 * @param comiezo
	 * @param fin
	 * 
	 */
	public Reserva(int dni, String numSerie, int comiezo, int fin, List<Reserva> reserva) {
		super();
		this.dni = dni;
		this.numSerie = numSerie;
		this.comienzo = comienzo;
		this.fin = fin;

	}

	/**
	 * @return the dni
	 */
	public int getDNI() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDNI(int dni) {
		this.dni = dni;
	}

	/**
	 * @return the numSerie
	 */
	public String getNumSerie() {
		return numSerie;
	}

	/**
	 * @param numSerie the numSerie to set
	 */
	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	/**
	 * @return the comienzo
	 */
	public int getComienzo() {
		return comienzo;
	}

	/**
	 * @param comienzo the comienzo to set
	 */
	public void setComienzo(int comienzo) {
		this.comienzo = comienzo;
	}

	/**
	 * @return the fin
	 */
	public int getFin() {
		return fin;
	}

	/**
	 * @param fin the fin to set
	 */
	public void setFin(int fin) {
		this.fin = fin;
	}

	/**
	 * @return the reserva
	 */
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, mappedBy = "Reserva")
	public List<Reserva> getReserva() {
		return reserva;
	}

	/**
	 * @param reserva the reserva to set
	 */
	public void setReserva(List<Reserva> reserva) {
		this.reserva = Reserva;
	}

	@Override
	public String toString() {
		return "Reserva [dni=" + dni + ", numSerie=" + numSerie + ", comienzo=" + comienzo + ", fin=" + fin + \"]\";]";
	}

}
