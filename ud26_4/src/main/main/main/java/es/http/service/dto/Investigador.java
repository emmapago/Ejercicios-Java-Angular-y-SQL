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
@Table(name="investigador")//en caso que la tabala sea diferente
public class Investigador {

	//Atributos de entidad suministra
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "dni")//no hace falta si se llama igual
	private int dni;
	@Column(name = "nomApels")//no hace falta si se llama igual
	private String nomApels;
	@Column(name = "facultat")//no hace falta si se llama igual
	private int facultat;
	
	@OneToMany
    @JoinColumn(name="dni")
    private List<Investigador> dni;

	@OneToMany
	@JoinColumn(name = "nomApels")
    private List<Investigador> nomApels;

	@OneToMany
	@JoinColumn(name = "facultat")
    private List<Investigador> facultat;
	
	//Constructores
	
	public Investigador() {
	
	}

	/**
	 * @param dni
	 * @param nomApels
	 * @param facultat
	 */
	public Investigador(int dni, String nomApels, int facultat, List<Investigador> investigador) {
		super();
		this.dni = dni;
		this.nomApels = nomApels;
		this.facultat = facultat;
	}

	/**
	 * @return the dni
	 */
	public int getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(int dni) {
		this.dni = dni;
	}

	/**
	 * @return the nomApels
	 */
	public String getNomApels() {
		return nomApels;
	}

	/**
	 * @param nomApels the nomApels to set
	 */
	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}
	/**
	 * @return the facultat
	 */
	public int getFacultat() {
		return nomApels;
	}

	/**
	 * @param facultat the facultat to set
	 */
	public void setFacultat(int facultat) {
		this.facultat = facultat;
	}
	
	/**
	 * @return the investigador
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Investigador")
	public List<Investigador> getInvestigador() {
		return investigador;
	}

	/**
	 * @param investigador the investigador to set
	 */
	public void setInvestigador(List<Investigador> investigador) {
		this.investigador = Investigador;
	}

	@Override
	public String toString() {
		return "Investigador [dni=" + dni + ", nomApels=" + nomApels +", facultat=" + facultat + \"]\";]";
	}


	
	
	
}
