package com.jpa.pruebahibernate.service;

import com.jpa.pruebahibernate.model.Persona;
import java.util.List;

public interface IPersonaService {
	
	//Método para traer todas las personas
	
	public List<Persona> getPersona ();
	
	//Método para dar de alta una persona
	
	public void savePersona (Persona perso);
	
	//Método para borrar una persona
	
	public void deletePersona (Long id);
	
	//Método para encontrar una persona
	
	public Persona findPersona (Long id);

	
}
