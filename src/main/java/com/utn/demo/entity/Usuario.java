package com.utn.demo.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Where;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Where(clause = "eliminado=false")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int dni;
	private long telefono;
	private boolean esCliente;
	private String nombre;
	private String apellido;
	private String email;
	private String password;
	private String rol;
	private Date fechaNacimiento;
	@OneToMany(mappedBy = "propietario", cascade = CascadeType.ALL)
	private List<Domicilio> domicilios;
	@Column(name = "eliminado")
	private boolean eliminado;
	public Usuario() {
		super();
	}
	public Usuario(int id, int dni, long telefono, boolean esCliente, String nombre, String apellido, String email,
			String password, String rol, Date fechaNacimiento, List<Domicilio> domicilios, boolean eliminado) {
		super();
		this.id = id;
		this.dni = dni;
		this.telefono = telefono;
		this.esCliente = esCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
		this.rol = rol;
		this.fechaNacimiento = fechaNacimiento;
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
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public List<Domicilio> getDomicilios() {
		return domicilios;
	}
	public void setDomicilios(List<Domicilio> domicilios) {
		this.domicilios = domicilios;
	}
	public boolean isEliminado() {
		return eliminado;
	}
	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	
}
