package es.http.service.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Suministra;

/**
 * @author Emma
 *
 */
public interface ISuministraDAO extends JpaRepository<Suministra, Integer>{
	
}
