package com.jpa.pruebahibernate.repository;

import com.jpa.pruebahibernate.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository //mapeamos como repositorio
//la interface extiende de JpaRepository (que maneja repositorios JPA)
//en los parámetros <> deben ir: <clase a persistir, tipo de dato de su ID>
public interface PersonaRepository extends JpaRepository <Persona, Long>{

}
