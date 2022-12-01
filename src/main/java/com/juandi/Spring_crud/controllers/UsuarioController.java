package com.juandi.Spring_crud.controllers;

import com.juandi.Spring_crud.models.UsuarioModel;
import com.juandi.Spring_crud.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModel> getUsuarios() {
        return usuarioService.getUsuarios();
    }

    @PostMapping()
    public UsuarioModel addUsuario(@RequestBody UsuarioModel usuario) {
        return this.usuarioService.addUsuario(usuario);
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> GetUsetById(@PathVariable("id") Long id){
        return this.usuarioService.getUsersById(id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.usuarioService.eliminarUsuario(id);
        if(ok){
            return "Se eliminó el usuario con el id: " + id;
        }else{
            return "No se eliminó el usuario con el id: " + id;
        }
    }
}
