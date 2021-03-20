
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
	@Table(name="pelicula")//en caso que la tabla sea diferente
	public class Pelicula  {
	 
		//Atributos de entidad departamentos
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		private Long id;
		@Column(name = "codigo")//no hace falta si se llama igual
		private int codigo;
		@Column(name = "nombre")//no hace falta si se llama igual
		private String nombre;
		@Column(name = "calificacionEdad")//no hace falta si se llama igual
		private int calificacionEdad;
		@Temporal(TemporalType.TIMESTAMP)
		
	    @OneToMany
	    @JoinColumn(name="id")
	    private List<Pelicula> pelicula;
		
		//Constructores
		
		public Pelicula() {
		
		}

		/**
		 * @param codigo
		 * @param nombre
		 * @param calificacionEdad
		 */
		public Pelicula(int codigo, String nombre, int calificacionEdad) {
			//super();
			this.codigo = codigo;
			this.nombre = nombre;
			this.calificacionEdad = calificacionEdad;
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
		 * @return the calificacionEdad
		 */
		public int getCalificacionEdad() {
			return calificacionEdad;
		}

		/**
		 * @param calificacionEdad the calificacionEdad to set
		 */
		public void setCalificacionEdad(int calificacionEdad) {
			this.calificacionEdad = calificacionEdad;
		}
		
		@JsonIgnore
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "Pelicula")
		public List<Pelicula> getPelicula() {
			return pelicula;
		}

		/**
		 * @param pelicula the pelicula to set
		 */
		public void setPelicula(List<Pelicula> pelicula) {
			this.pelicula = pelicula;
		}

		//Metodo impresion de datos por consola
		@Override
		public String toString() {
			return "Pelicula [codigo=" + codigo + ", nombre=" + nombre + ", calificacionEdad=" + calificacionEdad + "]";
		}
		
		
		
		
		
	}

}

}
