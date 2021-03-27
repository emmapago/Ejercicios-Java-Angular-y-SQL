package es.http.service.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Facultat;

/**
 * @author Emma
 *
 */
public interface IFacultatDAO extends JpaRepository<Facultat, Integer>{
	
}
