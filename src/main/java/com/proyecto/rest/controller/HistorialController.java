package com.proyecto.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.rest.model.Historial;
import com.proyecto.rest.service.historialServiceImpl;

@RestController
/*CORS*/
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.PUT,RequestMethod.POST})
@RequestMapping(value="/historial")
public class HistorialController {
	
	
	@Autowired
	historialServiceImpl historialServiceImpl;
	
	  @GetMapping(path = "/historia/Lista")
	    public List<Historial> getHistorilById(@RequestParam("Cod_Historial") String Cod_Historial) {
	        return historialServiceImpl.getHistorialById(Cod_Historial);
	    }
}
