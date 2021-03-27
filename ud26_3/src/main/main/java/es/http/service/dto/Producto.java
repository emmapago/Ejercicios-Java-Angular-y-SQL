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
@Table(name="producto")//en caso que la tabala sea diferente
public class Producto {

	//Atributos de entidad suministra
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "codigo")//no hace falta si se llama igual
	private int codigo;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "precio")//no hace falta si se llama igual
	private int precio;

	
	@OneToMany
    @JoinColumn(name="codigo")
    private List<Producto> codigo;

	@OneToMany
	@JoinColumn(name = "nombre")
    private List<Producto> nombre;

	@OneToMany
	@JoinColumn(name = "precio")
    private List<Producto> precio;
	//Constructores
	
	public Producto() {
	
	}

	/**
	 * @param codigo
	 * @param nombre
	 * @param precio
	 */
	public Producto(int codigo, String nombre, int precio, List<Producto> producto) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
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
	 * @return the producto
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Producto")
	public List<Producto> getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(List<Producto> producto) {
		this.producto = Producto;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + \"]\";]";
	}


	
	
	
}
