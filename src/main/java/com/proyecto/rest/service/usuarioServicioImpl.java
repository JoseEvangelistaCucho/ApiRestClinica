package com.proyecto.rest.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.proyecto.rest.model.Usuario;

@Service
public class usuarioServicioImpl {
	
		@Autowired
	    private usuarioServicio usuarioServicio;
	   	@Autowired
	    @PersistenceContext
	    private EntityManager em;
	 
	   		public List<Usuario> getUsuarioById(String usuario,String password) {
	        return em.createNamedStoredProcedureQuery("login").setParameter("usuario",usuario).setParameter("password",password).getResultList();
	    }
}
