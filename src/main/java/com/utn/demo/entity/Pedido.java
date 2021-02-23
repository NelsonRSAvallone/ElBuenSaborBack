package com.utn.demo.entity;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import org.hibernate.annotations.Where;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Where(clause = "eliminado=false")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private boolean envioDelivery;
	private int tiempoPreparacion;
	@OneToOne
	private Domicilio domicilio;
	@OneToOne(cascade = CascadeType.DETACH)
	private Estado estado;
	@Temporal(TemporalType.DATE)
	private Date fecha;
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "fk_usuario")
	private Usuario usuario;
	@Column(name = "eliminado")
	private boolean eliminado;
	public Pedido() {
		super();
	}
	public Pedido(int id, boolean envioDelivery, int tiempoPreparacion, Domicilio domicilio, Estado estado, Date fecha,
			Usuario usuario, boolean eliminado) {
		super();
		this.id = id;
		this.envioDelivery = envioDelivery;
		this.tiempoPreparacion = tiempoPreparacion;
		this.domicilio = domicilio;
		this.estado = estado;
		this.fecha = fecha;
		this.usuario = usuario;
		this.eliminado = eliminado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isEnvioDelivery() {
		return envioDelivery;
	}
	public void setEnvioDelivery(boolean envioDelivery) {
		this.envioDelivery = envioDelivery;
	}
	public int getTiempoPreparacion() {
		return tiempoPreparacion;
	}
	public void setTiempoPreparacion(int tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public boolean isEliminado() {
		return eliminado;
	}
	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	
}
