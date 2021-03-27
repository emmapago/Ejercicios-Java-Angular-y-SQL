package es.http.service.dto;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="equipo")//en caso que la tabala sea diferente
public class Equipo {

	//Atributos de entidad suministra
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "numSerie")//no hace falta si se llama igual
	private int numSerie;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "facultat")//no hace falta si se llama igual
	private int facultat;

	
	
	@OneToMany
    @JoinColumn(name="numSerie")
    private List<Equipo> numSerie;

	@OneToMany
	@JoinColumn(name = "nombre")
    private List<Equipo> nombre;

	@OneToMany
	@JoinColumn(name = "facultat")
    private List<Equipo> facultat;
	
	//Constructores
	
	public Equipo() {
	
	}

	/**
	 * @param numSerie
	 * @param nombre
	 * @param facultat
	 */
	public Equipo(int numSerie, String nombre, int facultat, List<Equipo> equipo) {
		super();
		this.numSerie = numSerie;
		this.nombre = nombre;
		this.facultat = facultat;
	}

	/**
	 * @return the numSerie
	 */
	public int getNumSerie() {
		return numSerie;
	}

	/**
	 * @param numSerie the numSerie to set
	 */
	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the facultat
	 */
	public int getFacultat() {
		return facultat;
	}

	/**
	 * @param facultat the facultat to set
	 */
	public void setFacultat(int facultat) {
		this.facultat = facultat;
	}

	
	/**
	 * @return the equipo
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Equipo")
	public List<Equipo> getEquipo() {
		return equipo;
	}

	/**
	 * @param equipo the equipo to set
	 */
	public void setEquipo(List<Equipo> equipo) {
		this.equipo = Equipo;
	}

	@Override
	public String toString() {
		return "Equipo [numSerie=" + numSerie + ", nombre=" + nombre + ", facultat=" + facultat +\"]\";]";
	}


	
	
	
}
