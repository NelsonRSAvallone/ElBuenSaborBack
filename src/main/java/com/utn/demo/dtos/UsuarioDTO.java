package com.utn.demo.dtos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {

	private int id;
	private int dni;
	private long telefono;
	private boolean esCliente;
	private Date fechaNacimiento;
	private String nombre;
	private String apellido;
	private String email;
	private String password;
	private String imagen;
	private String rol;
	private List<DomicilioDTO> domicilios = new ArrayList<DomicilioDTO>();
	private boolean eliminado;
	public UsuarioDTO() {
		super();
	}
	public UsuarioDTO(int id, int dni, long telefono, boolean esCliente, Date fechaNacimiento, String nombre,
			String apellido, String email, String password, String imagen, String rol, List<DomicilioDTO> domicilios,
			boolean eliminado) {
		super();
		this.id = id;
		this.dni = dni;
		this.telefono = telefono;
		this.esCliente = esCliente;
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
		this.imagen = imagen;
		this.rol = rol;
		this.domicilios = domicilios;
		this.eliminado = eliminado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public boolean isEsCliente() {
		return esCliente;
	}
	public void setEsCliente(boolean esCliente) {
		this.esCliente = esCliente;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public List<DomicilioDTO> getDomicilios() {
		return domicilios;
	}
	public void setDomicilios(List<DomicilioDTO> domicilios) {
		this.domicilios = domicilios;
	}
	public boolean isEliminado() {
		return eliminado;
	}
	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	
}
