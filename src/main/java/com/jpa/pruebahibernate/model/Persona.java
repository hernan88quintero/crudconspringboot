package com.jpa.pruebahibernate.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
@Column (length = 40)
	private String apellido;
	
@Column(length = 10)
	private int edad;
	
@Column(length = 40)
	private String nombre;	
	
	
	public Persona(){

	    };
	    
	public Persona (Long id, String apellido, int edad, String nombre) {
		this.id = id;
		this.apellido = apellido;
		this.edad = edad;
		this.nombre = nombre;
				
	};
	
	
public String getApellido(String apellido) {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	
	public String getNombre(String nombre) {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	public int getEdad(int edad) {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}


}
