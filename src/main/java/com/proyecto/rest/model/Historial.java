package com.proyecto.rest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name = "historial")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"},
        allowGetters = true)

@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(name = "historial", procedureName = "historial", parameters = {
    		@StoredProcedureParameter(mode = ParameterMode.IN,name = "Cod_Historial",type=String.class)}),

    @NamedStoredProcedureQuery(name = "uspActualizar_historial", procedureName = "uspActualizar_historial", parameters = {
    		@StoredProcedureParameter(mode = ParameterMode.IN,name = "Cod_Historial",type=String.class),
            @StoredProcedureParameter(mode = ParameterMode.IN,name ="Observaciones",type=String.class)})})

public class Historial {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	private String Cod_Historial;
	private String fecha;
	private String Observaciones;
	public Historial() {
		super();
	}
	public Historial(int id, String cod_Historial, String fecha, String observaciones) {
		super();
		this.id = id;
		Cod_Historial = cod_Historial;
		this.fecha = fecha;
		Observaciones = observaciones;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCod_Historial() {
		return Cod_Historial;
	}
	public void setCod_Historia(String cod_Historial) {
		Cod_Historial = cod_Historial;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getObservaciones() {
		return Observaciones;
	}
	public void setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}

	
	
	

}
