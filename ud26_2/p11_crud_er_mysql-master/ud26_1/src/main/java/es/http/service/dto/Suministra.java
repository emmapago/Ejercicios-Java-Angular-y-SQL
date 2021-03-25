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
@Table(name="suministra")//en caso que la tabala sea diferente
public class Suministra {

	//Atributos de entidad suministra
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "codigoPieza")//no hace falta si se llama igual
	private int codigoPieza;
	@Column(name = "idProveedor")//no hace falta si se llama igual
	private char idProveedor;
	@Column(name = "precio")//no hace falta si se llama igual
	private int precio;
	
	@ManyToOne
    @JoinColumn(name="codigoPieza")
    private List<Suministra> codigoPieza;

	@ManyToOne
	@JoinColumn(name = "idProveedor")
    private List<Suministra> idProveedor;

	@Column(name = "precio") 
    private List<Suministra> precio;
	
	
	//Constructores
	
	public Suministra() {
	
	}

	/**
	 * @param id
	 * @param codigoPieza
	 * @param idProveedor
	 * @param precio
	 */
	public Suministra(int id, int codigoPieza, char idProveedor, int precio, List<Suministra> suministra) {
		super();
		this.id = id;
		this.codigoPieza = codigoPieza;
		this.idProveedor = idProveedor;
		this.precio = precio;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the codigoPieza
	 */
	public int getCodigoPieza() {
		return codigoPieza;
	}

	/**
	 * @param codigoPieza the codigoPieza to set
	 */
	public void setCodigoPieza(int codigoPieza) {
		this.codigoPieza = codigoPieza;
	}

	/**
	 * @return the idProveedor
	 */
	public char getIdProveedor() {
		return idProveedor;
	}

	/**
	 * @param idProveedor the idProveedor to set
	 */
	public void setIdProveedor(char idProveedor) {
		this.idProveedor = idProveedor;
	}
	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	/**
	 * @return the suministra
	 */
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, mappedBy = "Suministra")
	public List<Suministra> getSuministra() {
		return suministra;
	}

	/**
	 * @param suministra the suministra to set
	 */
	public void setSuministra(List<Suministra> suministra) {
		this.suministra = suministra;
	}

	@Override
	public String toString() {
		return "Suministra [id=" + id + ", codigoPieza=" + codigoPieza + ", idProveedor=" + idProveedor + ", precio=\" + precio + \"]\";]";
	}


	
	
	
}
