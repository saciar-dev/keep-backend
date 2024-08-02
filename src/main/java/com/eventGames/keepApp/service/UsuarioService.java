package com.eventGames.keepApp.service;

import com.eventGames.keepApp.model.Usuario;
import com.eventGames.keepApp.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario getUsuarioByEmail(String nombre, String telefono){

        List<Usuario> usuarios = usuarioRepository.getUsuarioByNameAndPhone(nombre, telefono);
        if(usuarios.size() > 0){
            return usuarios.get(0);
        }
        else return null;
    }

    public Usuario createUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
