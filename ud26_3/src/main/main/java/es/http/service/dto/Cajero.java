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
@Table(name="cajero")//en caso que la tabala sea diferente
public class Cajero {

	//Atributos de entidad suministra
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "codigo")//no hace falta si se llama igual
	private int codigo;
	@Column(name = "nomApels")//no hace falta si se llama igual
	private String nomApels;

	
	@OneToMany
    @JoinColumn(name="codigo")
    private List<Cajero> codigo;

	@OneToMany
	@JoinColumn(name = "nomApels")
    private List<Cajero> nomApels;

	//Constructores
	
	public Cajero() {
	
	}

	/**
	 * @param codigo
	 * @param nomApels
	 */
	public Cajero(int codigo, String nomApels, List<Cajero> cajero) {
		super();
		this.codigo = codigo;
		this.nomApels = nomApels;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	 * @return the cajero
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Cajero")
	public List<Cajero> getCajero() {
		return cajero;
	}

	/**
	 * @param cajero the cajero to set
	 */
	public void setCajero(List<Cajero> cajero) {
		this.cajero = Cajero;
	}

	@Override
	public String toString() {
		return "Cajero [codigo=" + codigo + ", nomApels=" + nomApels + \"]\";]";
	}


	
	
	
}
