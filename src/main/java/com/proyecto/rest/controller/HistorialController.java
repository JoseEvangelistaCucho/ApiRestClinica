package com.proyecto.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.rest.model.Historial;
import com.proyecto.rest.model.Usuario;
import com.proyecto.rest.service.historialServiceImpl;
import com.proyecto.rest.service.historialService;

@RestController
/*CORS*/
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.PUT,RequestMethod.POST})
@RequestMapping(value="/historial")
public class HistorialController {
	@Autowired
	historialService historialService;
	
	@Autowired
	historialServiceImpl historialServiceImpl;
	
	@GetMapping("/Historial")
    public List<Historial> getAllUsuario(){	       
        return historialService.findAll();
    }
	
	 @GetMapping(path = "/historia/Lista")
	    public List<Historial> getHistorilById(@RequestParam("Cod_Historial") String Cod_Historial) {
	        return historialServiceImpl.getHistorialById(Cod_Historial);
	    }
	 @PutMapping(path = "/historia/ActualizarObservacion")
	  public List<Historial> putHistorialById(@RequestParam("Cod_Historial") String Cod_Historial,@RequestParam("Observaciones") String Observaciones) {
	        return historialServiceImpl.putHistorialById(Cod_Historial,Observaciones);
	    }
}
