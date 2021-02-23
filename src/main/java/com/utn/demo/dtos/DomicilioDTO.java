package com.utn.demo.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DomicilioDTO {
	private int id;
	private int numero;
	private String calle;
	private String departamento;
	private String piso;
	private UsuarioDTO propietario;
	private LocalidadDTO localidad;
	private boolean eliminado;
	public DomicilioDTO() {
		super();
	}
	public DomicilioDTO(int id, int numero, String calle, String departamento, String piso, UsuarioDTO propietario,
			LocalidadDTO localidad, boolean eliminado) {
		super();
		this.id = id;
		this.numero = numero;
		this.calle = calle;
		this.departamento = departamento;
		this.piso = piso;
		this.propietario = propietario;
		this.localidad = localidad;
		this.eliminado = eliminado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getPiso() {
		return piso;
	}
	public void setPiso(String piso) {
		this.piso = piso;
	}
	public UsuarioDTO getPropietario() {
		return propietario;
	}
	public void setPropietario(UsuarioDTO propietario) {
		this.propietario = propietario;
	}
	public LocalidadDTO getLocalidad() {
		return localidad;
	}
	public void setLocalidad(LocalidadDTO localidad) {
		this.localidad = localidad;
	}
	public boolean isEliminado() {
		return eliminado;
	}
	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	
}
