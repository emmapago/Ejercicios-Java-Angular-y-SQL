
package com.example.demo;

	
	import org.springframework.data.jpa.repository.JpaRepository;
	import com.crud.h2.dto.Pelicula;

	/**
	 * @author Emma
	 *
	 */
	public interface IPeliculaDAO extends JpaRepository<Pelicula, Long>{

	}

}

	
	
	
}
