package com.utn.demo.dtos;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsumoCategoriaDTO {
	private int id;
	private String nombre;
	private String descripcion;
	private boolean eliminado;
	private boolean es_insumo;
	public InsumoCategoriaDTO() {
		super();
	}
	public InsumoCategoriaDTO(int id, String nombre, String descripcion, boolean eliminado, boolean es_insumo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.eliminado = eliminado;
		this.es_insumo = es_insumo;
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isEliminado() {
		return eliminado;
	}
	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	public boolean isEs_insumo() {
		return es_insumo;
	}
	public void setEs_insumo(boolean es_insumo) {
		this.es_insumo = es_insumo;
	}
	
}
