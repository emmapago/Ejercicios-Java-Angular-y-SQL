package es.http.service.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import es.http.service.dto.Producto;

/**
 * @author Emma
 *
 */
public interface IProductoDAO extends JpaRepository<Producto, Integer>{
	
}
