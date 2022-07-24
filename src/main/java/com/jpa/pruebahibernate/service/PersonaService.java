package com.jpa.pruebahibernate.service;

import com.jpa.pruebahibernate.model.Persona;
import com.jpa.pruebahibernate.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class PersonaService implements IPersonaService{
	
	@Autowired
	public PersonaRepository persoRepository;
	
	@Override
	public List<Persona> getPersona() {
		return persoRepository.findAll();
		//List<Persona> listaPersonas = persoRepository.findAll();
		//System.out.println(listaPersonas);
		//return listaPersonas;
	}
	
	@Override
	public void savePersona(Persona perso) {
		persoRepository.save(perso);
	}
	
	@Override
	public void deletePersona(Long id) {
		persoRepository.deleteById(id);
	}
	
	@Override
	public Persona findPersona(Long id) {
		
		//Acá si no encuentro la persona, devuelvo null por eso va el orElse
		
		Persona perso = persoRepository.findById(id).orElse(null);
		return perso;
	}
	
		
}
