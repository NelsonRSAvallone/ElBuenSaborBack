package com.utn.demo.dtos;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FacturaDTO {
	private int id;
	private double subtotal;
	private double montoDescuento;
	private double total;
	private LocalDate fecha;
	private String tipoFactura;
	private String tipoPago;
	private String nroTarjeta;
	private int dniTitular;
	private UsuarioDTO usuario;
	private PedidoDTO pedido;
	private boolean eliminado;
	public FacturaDTO() {
		super();
	}
	public FacturaDTO(int id, double subtotal, double montoDescuento, double total, LocalDate fecha, String tipoFactura,
			String tipoPago, String nroTarjeta, int dniTitular, UsuarioDTO usuario, PedidoDTO pedido,
			boolean eliminado) {
		super();
		this.id = id;
		this.subtotal = subtotal;
		this.montoDescuento = montoDescuento;
		this.total = total;
		this.fecha = fecha;
		this.tipoFactura = tipoFactura;
		this.tipoPago = tipoPago;
		this.nroTarjeta = nroTarjeta;
		this.dniTitular = dniTitular;
		this.usuario = usuario;
		this.pedido = pedido;
		this.eliminado = eliminado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getMontoDescuento() {
		return montoDescuento;
	}
	public void setMontoDescuento(double montoDescuento) {
		this.montoDescuento = montoDescuento;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getTipoFactura() {
		return tipoFactura;
	}
	public void setTipoFactura(String tipoFactura) {
		this.tipoFactura = tipoFactura;
	}
	public String getTipoPago() {
		return tipoPago;
	}
	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}
	public String getNroTarjeta() {
		return nroTarjeta;
	}
	public void setNroTarjeta(String nroTarjeta) {
		this.nroTarjeta = nroTarjeta;
	}
	public int getDniTitular() {
		return dniTitular;
	}
	public void setDniTitular(int dniTitular) {
		this.dniTitular = dniTitular;
	}
	public UsuarioDTO getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
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
