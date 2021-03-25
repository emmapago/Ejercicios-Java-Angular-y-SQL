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
@Table(name="pieza")//en caso que la tabala sea diferente
public class Pieza {

	//Atributos de entidad suministra
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "codigo")//no hace falta si se llama igual
	private int codigo;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;

	
	@OneToMany
    @JoinColumn(name="codigo")
    private List<Pieza> codigo;

	@OneToMany
	@JoinColumn(name = "nombre")
    private List<Pieza> nombre;

	//Constructores
	
	public Pieza() {
	
	}

	/**
	 * @param codigo
	 * @param nombre
	 */
	public Pieza(int codigo, String nombre, List<Pieza> pieza) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
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
	 * @return the pieza
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Pieza")
	public List<Pieza> getPieza() {
		return pieza;
	}

	/**
	 * @param pieza the pieza to set
	 */
	public void setPieza(List<Pieza> pieza) {
		this.pieza = pieza;
	}

	@Override
	public String toString() {
		return "Pieza [codigo=" + codigo + ", nombre=" + nombre + \"]\";]";
	}


	
	
	
}
