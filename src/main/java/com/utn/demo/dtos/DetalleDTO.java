package com.utn.demo.dtos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetalleDTO {
	private int id;
	private int cantidad;
	private LocalDate fecha;
	private PlatoDTO plato;
	private InsumoDTO insumo;
	private PedidoDTO pedido;
	private boolean eliminado;
	public DetalleDTO() {
		super();
	}
	public DetalleDTO(int id, int cantidad, LocalDate fecha, PlatoDTO plato, InsumoDTO insumo, PedidoDTO pedido,
			boolean eliminado) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.plato = plato;
		this.insumo = insumo;
		this.pedido = pedido;
		this.eliminado = eliminado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public PlatoDTO getPlato() {
		return plato;
	}
	public void setPlato(PlatoDTO plato) {
		this.plato = plato;
	}
	public InsumoDTO getInsumo() {
		return insumo;
	}
	public void setInsumo(InsumoDTO insumo) {
		this.insumo = insumo;
	}
	public PedidoDTO getPedido() {
		return pedido;
	}
	public void setPedido(PedidoDTO pedido) {
		this.pedido = pedido;
	}
	public boolean isEliminado() {
		return eliminado;
	}
	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	
}
