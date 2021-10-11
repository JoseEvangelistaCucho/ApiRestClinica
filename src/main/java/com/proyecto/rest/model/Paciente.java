package com.proyecto.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "paciente")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)


public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	private String dni_P;
	private String nombre;
	private String apellido;
	private String fechanacimiento;
	private String observacion;
	private String direccion;
	private String telefono;
	private String estado;
	
	public Paciente() {
		super();
	}
	
	public Paciente(int idp, String dni_P, String nombre, String apellido, String fechanacimiento, String observacion,
			String direccion, String telefono, String estado) {
		super();
		this.id = idp;
		this.dni_P = dni_P;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechanacimiento = fechanacimiento;
		this.observacion = observacion;
		this.direccion = direccion;
		this.telefono = telefono;
		this.estado = estado;
	}
	public int getIdp() {
		return id;
	}
	public void setIdp(int idp) {
		this.id = idp;
	}
	public String getDni_P() {
		return dni_P;
	}
	public void setDni_P(String dni_P) {
		this.dni_P = dni_P;
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
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Paciente [idp=" + id + ", dni_P=" + dni_P + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechanacimiento=" + fechanacimiento + ", observacion=" + observacion + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", estado=" + estado + "]";
	}
	
	
	
	
}
