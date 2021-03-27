package es.http.service.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Cajero;

/**
 * @author Emma
 *
 */
public interface ICajeroDAO extends JpaRepository<Cajero, Integer>{
	
}
