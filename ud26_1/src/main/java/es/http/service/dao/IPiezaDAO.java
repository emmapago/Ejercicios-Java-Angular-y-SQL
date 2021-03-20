package es.http.service.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Pieza;

/**
 * @author Emma
 *
 */
public interface IPiezaDAO extends JpaRepository<Pieza, Integer>{
	
}
