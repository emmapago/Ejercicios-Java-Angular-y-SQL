
package com.example.demo;

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
	@Table(name="sala")//en caso que la tabla sea diferente
	public class Sala  {
	 
		//Atributos de entidad departamentos
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		private Long id;
		@Column(name = "codigo")//no hace falta si se llama igual
		private int codigo;
		@Column(name = "nombre")//no hace falta si se llama igual
		private String nombre;
		@Column(name = "pelicula")//no hace falta si se llama igual
		private int pelicula;
		@Temporal(TemporalType.TIMESTAMP)
		
	    @OneToMany
	    @JoinColumn(name="id")
	    private List<Sala> sala;
		
		//Constructores
		
		public Sala() {
		
		}

		/**
		 * @param codigo
		 * @param nombre
		 * @param pelicula
		 */
		public Pelicula(int codigo, String nombre, int pelicula) {
			//super();
			this.codigo = codigo;
			this.nombre = nombre;
			this.pelicula = pelicula;
		}

		
		//Getters y Setters
		
		/**
		 * @return the codigo
		 */
		public Long getCodigo() {
			return codigo;
		}

		/**
		 * @param codigo the codigo to set
		 */
		public void setCodigo(Long codigo) {
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
		 * @return the pelicula
		 */
		public int getPelicula() {
			return pelicula;
		}

		/**
		 * @param pelicula the pelicula to set
		 */
		public void setPelicula(int pelicula) {
			this.pelicula = pelicula;
		}
		
		@JsonIgnore
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "Sala")
		public List<Sala> getSala() {
			return sala;
		}

		/**
		 * @param sala the sala to set
		 */
		public void setSala(List<Sala> sala) {
			this.sala = sala;
		}

		//Metodo impresion de datos por consola
		@Override
		public String toString() {
			return "Sala [codigo=" + codigo + ", nombre=" + nombre + ", pelicula=" + pelicula + "]";
		}
		
		
		
		
		
	}

}

}
