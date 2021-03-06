package com.proyecto.rest.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.proyecto.rest.model.Usuario;


@Repository
public interface usuarioServicio extends JpaRepository<Usuario, Long> {

}

