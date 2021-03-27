package es.http.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.http.service.dto.Producto;
import es.http.service.service.ProductoServiceImpl;

@RestController
@RequestMapping("/api")
public class ProductoController {
	
	@Autowired
	ProductoServiceImpl productoServiceImpl;
	
	@GetMapping("/productos")
	public List<Producto> listarProductos(){
		return ventaServiceImpl.listarProductos();
	}
	
	
	@PostMapping("/productos")
	public Producto salvarProducto(@RequestBody Producto producto) {
		
		return ventaServiceImpl.guardarVenta(venta);
	}
	
	
	@GetMapping("/ventas/{id}")
	public Venta ventaXID(@PathVariable(name="id") int id) {
		
		Venta Venta_xid= new Venta();
		
		Venta_xid=ventaServiceImpl.ventaXID(id);
		
		System.out.println("Venta XID: "+Venta_xid);
		
		return Venta_xid;
	}
	
	@PutMapping("/ventas/{id}")
	public Venta actualizarVenta(@PathVariable(name="id")int id,@RequestBody Venta venta) {
		
		Venta Venta_seleccionado= new Venta();
		Venta Venta_actualizado= new Venta();
		
		Venta_seleccionado= ventaServiceImpl.ventaXID(id);
		
		Venta_seleccionado.setCajero(Venta.getCajero());
		Venta_seleccionado.setMaquina(Venta.getMaquina());
		Venta_seleccionado.setProducto(Venta.getProducto());

		
		Venta_actualizado = ventaServiceImpl.actualizarVenta(Venta_seleccionado);
		
		System.out.println("La Venta actualizada es: "+ Venta_actualizado);
		
		return Venta_actualizado;
	}
	
	@DeleteMapping("/venta/{id}")
	public void eliminarVenta(@PathVariable(name="id")int id) {
		ventaServiceImpl.eliminarVenta(id);
	}
	
	
}
