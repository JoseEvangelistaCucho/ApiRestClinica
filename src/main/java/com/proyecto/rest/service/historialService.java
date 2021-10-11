package com.proyecto.rest.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.rest.model.Historial;
@Repository
public interface historialService extends JpaRepository<Historial, Long>  {

}
