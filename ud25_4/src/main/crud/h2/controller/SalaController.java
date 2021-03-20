package com.example.demo;

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
import com.crud.h2.dto.Sala;
import com.crud.h2.service.SalaServideImpl;

@RestController
		@RequestMapping("/api")
		public class SalaController {
			
			@Autowired
			SalaServiceImpl SalaServideImpl;
			
			@GetMapping("/Sala")
			public List<Sala> listarSalas(){
				return SalaServideImpl.listarSalas();
			}
			
			@PostMapping("/Sala")
			public Sala salvarSala(@RequestBody Sala Salas) {
				
				return SalaServideImpl.guardarSala(Sala);
			}
			
			@GetMapping("/salas/{id}")
			public Sala SalaXID(@PathVariable(name="id") Long id) {
				
				Sala Sala_xid= new Sala();
				
				Sala_xid=SalaServideImpl.SalaXID(id);
				
				System.out.println("Sala XID: "+Sala_xid);
				
				return Sala_xid;
			}
			
			@PutMapping("/Sala/{id}")
			public Sala actualizarSala(@PathVariable(name="id")Long id,@RequestBody Sala Sala) {
				
				Sala Sala_seleccionado= new Sala();
				Sala Sala_actualizado= new Sala();
				
				Sala_seleccionado= SalaServideImpl.SalaXID(id);
				
				Sala_seleccionado.setCodigo(Sala.getCodigo());
				Sala_seleccionado.setNombre(Sala.getNombre());
				Sala_seleccionado.setPelicula(Sala.getPelicula());
				
				Sala_actualizado = SalaServideImpl.actualizarSala(Pelicula_seleccionado);
				
				System.out.println("La pelicula actualizado es: "+ Pelicula_actualizado);
				
				return Pelicula_actualizado;
			}
			
			@DeleteMapping("/Pelicula/{id}")
			public void eliminarPelicula(@PathVariable(name="id")Long id) {
				PeliculaServideImpl.eliminarPelicula(id);
			}
			
			
		}

}

}
