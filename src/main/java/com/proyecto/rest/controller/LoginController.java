package com.proyecto.rest.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import com.proyecto.rest.exception.ResourceNotFoundException;
import com.proyecto.rest.model.Usuario;
import com.proyecto.rest.service.usuarioServicio;
import com.proyecto.rest.service.usuarioServicioImpl;


import io.swagger.models.Model;


@RestController
//@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.PUT,RequestMethod.POST})
@RequestMapping(value="/api")
public class LoginController {
	
	@Autowired
	usuarioServicio usuarioServicio;
	@Autowired
	usuarioServicioImpl usuarioServicioImpl;
	
	@GetMapping("/usuario")
	    public List<Usuario> getAllUsuario(){	       
	        return usuarioServicio.findAll();
	    }
	    
	
	   @GetMapping(path = "/usuario/login")
	    public List<Usuario> getBlogsByTitle(@RequestParam("usuario") String usuario,@RequestParam("password") String password) {
	        return usuarioServicioImpl.getUsuarioById(usuario,password);
	    }
	   
	    
/*	  //Este metodo guardará al usuario enviado por una petición POST
	  @PostMapping("/usuario")
	    public Usuario addUser(@RequestBody Usuario usuario) {
		  usuario.setIdUsuario(0);
		  usuarioServicio.save(usuario);
	        return usuario;
	    }
	  
	  //este metodo actualizará al usuario enviado por una petición PUT 
	  @PutMapping("/usuario")
	    public Usuario updateUser(@RequestBody Usuario usuario) {
		  usuarioServicio.save(usuario);
	        return usuario;
	    }
	  
	  //Esto método, recibira el id de un usuario por URL y se borrará de la bd. por una petición DELETE
	  @DeleteMapping("usuario/{idUsuario}")
	    public String deteteUser(@PathVariable int idUsuario) {
		  Usuario usuario = usuarioServicio.findById(idUsuario);
	        if(usuario == null) {
	            throw new RuntimeException("User id not found -"+idUsuario);
	            }
	        usuarioServicio.deleteById(idUsuario);
	       
	        return "Deleted user id - "+idUsuario;
	    }
	    
	    */
}
