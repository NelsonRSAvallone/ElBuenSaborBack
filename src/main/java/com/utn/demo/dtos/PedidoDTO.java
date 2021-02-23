package com.utn.demo.dtos;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PedidoDTO {
	private int id;
	private boolean envioDelivery;
	private float monto;
	private Date fecha;
	private int tiempoPreparacion;
	private EstadoDTO estado;
	private UsuarioDTO usuario;
	private DomicilioDTO domicilio;
	private boolean eliminado;
	
	public PedidoDTO() {
		super();
	}
	public PedidoDTO(int id, boolean envioDelivery, float monto, Date fecha, int tiempoPreparacion, EstadoDTO estado,
			UsuarioDTO usuario, DomicilioDTO domicilio, boolean eliminado) {
		super();
		this.id = id;
		this.envioDelivery = envioDelivery;
		this.monto = monto;
		this.fecha = fecha;
		this.tiempoPreparacion = tiempoPreparacion;
		this.estado = estado;
		this.usuario = usuario;
		this.domicilio = domicilio;
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
	public float getMonto() {
		return monto;
	}
	public void setMonto(float monto) {
		this.monto = monto;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getTiempoPreparacion() {
		return tiempoPreparacion;
	}
	public void setTiempoPreparacion(int tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}
	public EstadoDTO getEstado() {
		return estado;
	}
	public void setEstado(EstadoDTO estado) {
		this.estado = estado;
	}
	public UsuarioDTO getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}
	public DomicilioDTO getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(DomicilioDTO domicilio) {
		this.domicilio = domicilio;
	}
	public boolean isEliminado() {
		return eliminado;
	}
	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}

}
