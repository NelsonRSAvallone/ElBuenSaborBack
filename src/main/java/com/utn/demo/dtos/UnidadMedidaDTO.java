package com.utn.demo.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnidadMedidaDTO {
	private int id;
	private String nombre;
	private String abreviatura;
	private boolean eliminado;
	public UnidadMedidaDTO() {
		super();
	}
	public UnidadMedidaDTO(int id, String nombre, String abreviatura, boolean eliminado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.abreviatura = abreviatura;
		this.eliminado = eliminado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAbreviatura() {
		return abreviatura;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	public boolean isEliminado() {
		return eliminado;
	}
	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	
	
	
}
