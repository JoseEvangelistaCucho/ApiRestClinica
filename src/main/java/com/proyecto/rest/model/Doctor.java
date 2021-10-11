package com.proyecto.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;





@Entity
@Table(name = "doctor")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)
public class Doctor {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	private String dni_D;
	private String nombre;
	private String apellido;
	private String especialidad;
	private String estado;
	public Doctor() {
		super();
	}
	public Doctor(int id, String dni_D, String nombre, String apellido, String especialidad, String estado) {
		super();
		this.id = id;
		this.dni_D = dni_D;
		this.nombre = nombre;
		this.apellido = apellido;
		this.especialidad = especialidad;
		this.estado = estado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDni_D() {
		return dni_D;
	}
	public void setDni_D(String dni_D) {
		this.dni_D = dni_D;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", dni_D=" + dni_D + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", especialidad=" + especialidad + ", estado=" + estado + "]";
	}
	
	
	
	
}

