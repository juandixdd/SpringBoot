package com.juandi.Spring_crud.services;

import com.juandi.Spring_crud.models.UsuarioModel;
import com.juandi.Spring_crud.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    //? Trae a todos los usuarios
    public ArrayList<UsuarioModel> getUsuarios() {
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }

    //? Trae usuarios con respecto al id
    public Optional<UsuarioModel> getUsersById(Long id) {
        return usuarioRepository.findById(id);
    }

    //? Agrega usuarios, si se le pasa como parámetro el id de algún usuario ya existente lo edita
    public UsuarioModel addUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    //? Elimina usuarios
    public boolean eliminarUsuario(Long id) {
        try {
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception err) {
            return false;
        }
    }
}
