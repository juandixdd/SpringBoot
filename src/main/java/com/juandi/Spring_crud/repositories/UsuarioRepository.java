package com.juandi.Spring_crud.repositories;

import com.juandi.Spring_crud.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

//? Crud repository es el método que implementa la mayoría de funcionalidades que vamos a requerir para la base de datos,
//? se le pasa el parámetro del modelo que se quiere implementar y el tipo de dato del identificador.
@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
}
