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

import es.http.service.dto.Investigador;
import es.http.service.service.InvestigadorServiceImpl;

@RestController
@RequestMapping("/api")
public class InvestigadorController {
	
	@Autowired
	InvestigadorServiceImpl investigadorServiceImpl;
	
	@GetMapping("/investigadores")
	public List<Investigador> listarInvestigadores(){
		return investigadorServiceImpl.listarInvestigadores();
	}
	
	
	@PostMapping("/investigadores")
	public Investigador salvarInvestigador(@RequestBody Investigador investigador) {
		
		return investigadorServiceImpl.guardarInvestigador(investigador);
	}
	
	
	@GetMapping("/investigadores/{id}")
	public Investigador investigadoresXID(@PathVariable(name="id") int id) {
		
		Investigador Investigador_xid= new Investigador();
		
		Investigador_xid=investigadoresServiceImpl.investigadorestXID(id);
		
		System.out.println("Investigador XID: "+Investigador_xid);
		
		return Investigador_xid;
	}
	
	@PutMapping("/investigadores/{id}")
	public Investigador actualizarInvestigador(@PathVariable(name="id")int id,@RequestBody Investigador investigador) {
		
		Investigador Investigador_seleccionado= new Investigador();
		Investigador Investigador_actualizado= new Investigador();
		
		Investigador_seleccionado= investigadorServiceImpl.investigadorXID(id);
		
		Investigador_seleccionado.setDNI(Investigador.getDNI());
		Investigador_seleccionado.setNomApels(Investigador.getNomApels());
		Investigador_seleccionado.setFacultat(Investigador.getFacultat());

		
		Investigador_actualizado = investigadorServiceImpl.actualizarInvestigador(Investigador_seleccionado);
		
		System.out.println("La Investigador actualizado es: "+ Investigador_actualizado);
		
		return Investigador_actualizado;
	}
	
	@DeleteMapping("/investigadores/{id}")
	public void eliminarInvestigador(@PathVariable(name="id")int id) {
		investigadorServiceImpl.eliminarInvestigador(id);
	}
	
	
}
