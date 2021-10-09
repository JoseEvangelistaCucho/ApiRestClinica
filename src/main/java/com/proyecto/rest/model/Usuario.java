package com.proyecto.rest.model;

import javax.persistence.*;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="Usuario")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)

@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(name = "login", procedureName = "login", parameters = {
    		@StoredProcedureParameter(mode = ParameterMode.IN,name = "usuario",type=String.class),
            @StoredProcedureParameter(mode = ParameterMode.IN,type = String.class,name = "password")} )})

public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idUsuario")
	private Long idUsuario;
	
//	@Column(name="usuario")
	public String usuario;
	
	//@Column(name="password")
	public String password;
	
	//@Column(name="tipo")
	public String tipo;
	
//	@Column(name="estado")
	public int estado;
	
	
	
	
	
	public Usuario() {
		super();
	}
	public Usuario(Long idUsuario, String usuario, String password, String tipo, int estado) {
		super();
		this.idUsuario = idUsuario;
		this.usuario = usuario;
		this.password = password;
		this.tipo = tipo;
		this.estado = estado;
	}
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
			
}
