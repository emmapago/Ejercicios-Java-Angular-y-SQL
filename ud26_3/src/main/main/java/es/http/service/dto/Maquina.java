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
@Table(name="maquina")//en caso que la tabala sea diferente
public class Maquina {

	//Atributos de entidad suministra
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	@Column(name = "codigo")//no hace falta si se llama igual
	private int codigo;
	@Column(name = "piso")//no hace falta si se llama igual
	private int piso;

	
	@OneToMany
    @JoinColumn(name="codigo")
    private List<Maquina> codigo;

	@OneToMany
	@JoinColumn(name = "piso")
    private List<Maquina> piso;

	//Constructores
	
	public Maquina() {
	
	}

	/**
	 * @param codigo
	 * @param piso
	 */
	public Maquina(int codigo, int piso, List<Maquina> maquina) {
		super();
		this.codigo = codigo;
		this.piso = piso;
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
	 * @return the piso
	 */
	public int getPiso() {
		return piso;
	}

	/**
	 * @param piso the piso to set
	 */
	public void setPiso(int piso) {
		this.piso = piso;
	}
	
	
	/**
	 * @return the maquina
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Maquina")
	public List<Maquina> getMaquina() {
		return maquina;
	}

	/**
	 * @param maquina the maquina to set
	 */
	public void setProducto(List<Maquina> maquina) {
		this.maquina = Maquina;
	}

	@Override
	public String toString() {
		return "Maquina [codigo=" + codigo + ", piso=" + piso + " \"]\";]";
	}


	
	
	
}
