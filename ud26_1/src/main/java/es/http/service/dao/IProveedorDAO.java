package es.http.service.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Proveedor;

/**
 * @author Emma
 *
 */
public interface IProveedorDAO extends JpaRepository<Proveedor, Integer>{
	
}
