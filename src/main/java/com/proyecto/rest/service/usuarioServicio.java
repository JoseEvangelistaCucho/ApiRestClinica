package com.proyecto.rest.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.proyecto.rest.model.Usuario;


@Repository
public interface usuarioServicio extends JpaRepository<Usuario, Long> {


}

/*
	public List<usuarioModel> findAll();

    public usuarioModel findById(int idUsuario);

    public void save(usuarioModel usuarioModel);

    public void deleteById(int idUsuario);
}
*/