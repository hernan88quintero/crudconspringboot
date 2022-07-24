package com.jpa.pruebahibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.pruebahibernate.model.Persona;
import com.jpa.pruebahibernate.service.IPersonaService;

@RestController
public class PersonaController {
	
	@Autowired
	private IPersonaService interPersona;
	
	
	@GetMapping ("/personas/traer")
	@ResponseBody
	public List<Persona> getPersona() {
		System.out.print("Esta es la lista de Personas " + interPersona.getPersona());
		return interPersona.getPersona();
	}
	
	@PostMapping ("/personas/crear")
	public String createPersona(@RequestBody Persona perso) {
		
		interPersona.savePersona(perso);
		//Devuelve un string avisando si creó correctamente
		return "La persona fue creada correctamente";
	}
	
	@DeleteMapping ("/personas/borrar/{id}")
	public String deletePersona(@PathVariable Long id) {
		interPersona.deletePersona(id);
		//Devuelve un string avisando si eliminó correctamente
		return "La persona fue eliminada correctamente";
		
	}
	
	
	@PutMapping ("/personas/editar/{id}")
	public Persona editPersona (@PathVariable ("id") Long id,
								@RequestParam ("apellido") String nuevoApellido,
								@RequestParam("edad") int nuevaEdad,
								@RequestParam("nombre") String nuevoNombre){
		// Busco la persona en cuestión
		Persona perso = interPersona.findPersona(id);
		
		//Esto también puede ir en service
		//Para desacoplar mejor aún el código en un nuevo método
		perso.setApellido(nuevoApellido);
		perso.setEdad(nuevaEdad);
		perso.setNombre(nuevoNombre);
		
		
		interPersona.savePersona(perso);
		// Retorna la nueva persona
		return perso;
	}

}
