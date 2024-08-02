package com.eventGames.keepApp.controller;

import com.eventGames.keepApp.model.Usuario;
import com.eventGames.keepApp.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @CrossOrigin
    @PostMapping
    public Usuario createUsuario(@RequestBody Usuario usuario){
        return usuarioService.createUsuario(usuario);
    }

    @GetMapping
    @CrossOrigin
    public ResponseEntity<Usuario> getSportByEmail(@RequestParam String nombre, @RequestParam String telefono){
        ResponseEntity<Usuario> response =  null;
        Usuario usuario = usuarioService.getUsuarioByEmail(nombre, telefono);
        if(usuario == null){
            response = new ResponseEntity<Usuario>( HttpStatus.NO_CONTENT);
        }
        else response = new ResponseEntity<Usuario>(usuario, HttpStatus.OK);
        return response;
    }

}
