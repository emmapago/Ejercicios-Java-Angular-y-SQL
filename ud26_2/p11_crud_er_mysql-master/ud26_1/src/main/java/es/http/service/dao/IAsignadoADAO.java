package es.http.service.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.AsignadoA;

/**
 * @author Emma
 *
 */
public interface IAsignadoADAO extends JpaRepository<AsignadoA, Integer>{
	
}
