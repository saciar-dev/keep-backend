package com.eventGames.keepApp.repository;

import com.eventGames.keepApp.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {

    @Query("select c from Usuario c where c.nombre= ?1 or c.telefono= ?2")
    List<Usuario> getUsuarioByNameAndPhone(String nombre, String telefono);
}
