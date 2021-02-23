package com.utn.demo.entity;

import java.time.LocalDate;
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

@Entity
@Where(clause = "eliminado=false")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Factura {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double montoDescuento;
	private double subtotal;
	private double total;
	private String tipoFactura;
	private String tipoPago;
	private String nroTarjeta;
	private int dniTitular;
	private LocalDate fecha;
	@OneToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "fk_usuario")
	private Usuario usuario;
	@OneToOne
	@JoinColumn(name = "fk_pedido")
	private Pedido pedido;
	@Column(name = "eliminado")
	private boolean eliminado;
	public Factura() {
		super();
	}
	public Factura(int id, double montoDescuento, double subtotal, double total, String tipoFactura, String tipoPago,
			String nroTarjeta, int dniTitular, LocalDate fecha, Usuario usuario, Pedido pedido, boolean eliminado) {
		super();
		this.id = id;
		this.montoDescuento = montoDescuento;
		this.subtotal = subtotal;
		this.total = total;
		this.tipoFactura = tipoFactura;
		this.tipoPago = tipoPago;
		this.nroTarjeta = nroTarjeta;
		this.dniTitular = dniTitular;
		this.fecha = fecha;
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
	public double getMontoDescuento() {
		return montoDescuento;
	}
	public void setMontoDescuento(double montoDescuento) {
		this.montoDescuento = montoDescuento;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
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
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public boolean isEliminado() {
		return eliminado;
	}
	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	
}
