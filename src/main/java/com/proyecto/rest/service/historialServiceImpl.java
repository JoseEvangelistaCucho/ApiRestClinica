package com.proyecto.rest.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.rest.model.Historial;
import com.proyecto.rest.model.Usuario;

@Service
public class historialServiceImpl {

	@Autowired
    private historialService historialService;
   	@Autowired
    @PersistenceContext
    private EntityManager em;
 
   	public List<Historial> getHistorialById(String Cod_Historial) {
        return em.createNamedStoredProcedureQuery("historial").setParameter("Cod_Historial",Cod_Historial).getResultList();
    }
   	public List<Historial> putHistorialById(String Cod_Historial,String Observaciones) {
        return em.createNamedStoredProcedureQuery("uspActualizar_historial").setParameter("Cod_Historial",Cod_Historial)
        		.setParameter("Observaciones",Observaciones).getResultList();
    }
}
