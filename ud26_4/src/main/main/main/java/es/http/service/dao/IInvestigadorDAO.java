package es.http.service.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Investigador;

/**
 * @author Emma
 *
 */
public interface IInvestigadorDAO extends JpaRepository<Investigador, Integer>{
	
}
