
package com.example.demo;

	
	import org.springframework.data.jpa.repository.JpaRepository;
	import com.crud.h2.dto.Sala;

	/**
	 * @author Emma
	 *
	 */
	public interface ISalaDAO extends JpaRepository<Sala, Long>{

	}

}

	
	
	
}
