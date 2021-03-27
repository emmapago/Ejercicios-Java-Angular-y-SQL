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

import es.http.service.dto.Facultat;
import es.http.service.service.FacultatServiceImpl;

@RestController
@RequestMapping("/api")
public class FacultatController {
	
	@Autowired
	FacultatServiceImpl facultatServiceImpl;
	
	@GetMapping("/facultades")
	public List<Facultat> listarFacultades(){
		return facultatServiceImpl.listarFacultades();
	}
	
	
	@PostMapping("/facultades")
	public Facultat salvarFacultat(@RequestBody Facultat facultat) {
		
		return facultatServiceImpl.guardarFacultat(facultat);
	}
	
	
	@GetMapping("/facultades/{id}")
	public Facultat facultadesXID(@PathVariable(name="id") int id) {
		
		Facultat Facultat_xid= new Facultat();
		
		Facultat_xid=facultatServiceImpl.facultatXID(id);
		
		System.out.println("Facultat XID: "+Facultat_xid);
		
		return Facultat_xid;
	}
	
	@PutMapping("/facultades/{id}")
	public Facultat actualizarFacultat(@PathVariable(name="id")int id,@RequestBody Facultat facultat) {
		
		Facultat Facultat_seleccionado= new Facultat();
		Facultat Facultat_actualizado= new Facultat();
		
		Facultat_seleccionado= facultatServiceImpl.facultatXID(id);
		
		Facultat_seleccionado.setCodigo(Facultat.getCodigo());
		Facultat_seleccionado.setNombre(Facultat.getNombre());

		
		Facultat_actualizado = facultatServiceImpl.actualizarFacultat(Facultat_seleccionado);
		
		System.out.println("La Facultat actualizado es: "+ Facultat_actualizado);
		
		return Facultat_actualizado;
	}
	
	@DeleteMapping("/facultades/{id}")
	public void eliminarFacultat(@PathVariable(name="id")int id) {
		facultatServiceImpl.eliminarFacultat(id);
	}
	
	
}
