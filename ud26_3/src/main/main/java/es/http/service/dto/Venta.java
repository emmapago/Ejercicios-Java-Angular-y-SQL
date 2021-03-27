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
@Table(name="venta")//en caso que la tabala sea diferente
public class Venta {

	//Atributos de entidad suministra
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "cajero")//no hace falta si se llama igual
	private int cajero;
	@Column(name = "maquina")//no hace falta si se llama igual
	private int maquina;
	@Column(name = "producto")//no hace falta si se llama igual
	private int producto;

	
	@ManyToOne
    @JoinColumn(name="cajero")
    private List<Venta> cajero;

	@ManyToOne
	@JoinColumn(name = "maquina")
    private List<Venta> maquina;

	@ManyToOne
	@JoinColumn(name = "producto")
    private List<Venta> producto;
	//Constructores
	
	public Venta() {
	
	}

	/**
	 * @param cajero
	 * @param maquina
	 * @param producto
	 */
	public Venta(int cajero, int maquina, int producto, List<Venta> venta) {
		super();
		this.cajero = cajero;
		this.maquina = maquina;
		this.producto = producto;
	}

	/**
	 * @return the cajero
	 */
	public int getCajero() {
		return cajero;
	}

	/**
	 * @param cajero the cajero to set
	 */
	public void setCajero(int cajero) {
		this.cajero = cajero;
	}

	/**
	 * @return the maquina
	 */
	public int getMaquina() {
		return maquina;
	}

	/**
	 * @param maquina the maquina to set
	 */
	public void setMaquina(int maquina) {
		this.maquina = maquina;
	}
	/**
	 * @return the prodcto
	 */
	public int getProduccto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(int producto) {
		this.producto = producto;
	}
	
	/**
	 * @return the venta
	 */
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY, mappedBy = "Venta")
	public List<Venta> getVenta() {
		return venta;
	}

	/**
	 * @param venta the venta to set
	 */
	public void setVenta(List<Venta> venta) {
		this.venta = Venta;
	}

	@Override
	public String toString() {
		return "Venta [cajero=" + cajero + ", maquina=" + maquina + ", producto=" + producto + \"]\";]";
	}


	
	
	
}
