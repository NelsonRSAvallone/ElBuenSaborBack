package com.utn.demo.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class InsumoDTO {
	private int id;
	private double precioCompra;
	private double precioVenta;
	private double stockActual;
	private double stockMaximo;
	private double stockMinimo;
	private boolean esInsumo;
	private String nombre;
	private String descripcion;
	private String imagen;
	private InsumoCategoriaDTO categoria;
	private UnidadMedidaDTO unidadMedida;
	private boolean eliminado;
	public InsumoDTO() {
		super();
	}
	public InsumoDTO(int id, double precioCompra, double precioVenta, double stockActual, double stockMaximo,
			double stockMinimo, boolean esInsumo, String nombre, String descripcion, String imagen,
			InsumoCategoriaDTO categoria, UnidadMedidaDTO unidadMedida, boolean eliminado) {
		super();
		this.id = id;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stockActual = stockActual;
		this.stockMaximo = stockMaximo;
		this.stockMinimo = stockMinimo;
		this.esInsumo = esInsumo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.categoria = categoria;
		this.unidadMedida = unidadMedida;
		this.eliminado = eliminado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public double getStockActual() {
		return stockActual;
	}
	public void setStockActual(double stockActual) {
		this.stockActual = stockActual;
	}
	public double getStockMaximo() {
		return stockMaximo;
	}
	public void setStockMaximo(double stockMaximo) {
		this.stockMaximo = stockMaximo;
	}
	public double getStockMinimo() {
		return stockMinimo;
	}
	public void setStockMinimo(double stockMinimo) {
		this.stockMinimo = stockMinimo;
	}
	public boolean isEsInsumo() {
		return esInsumo;
	}
	public void setEsInsumo(boolean esInsumo) {
		this.esInsumo = esInsumo;
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
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public InsumoCategoriaDTO getCategoria() {
		return categoria;
	}
	public void setCategoria(InsumoCategoriaDTO categoria) {
		this.categoria = categoria;
	}
	public UnidadMedidaDTO getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(UnidadMedidaDTO unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	public boolean isEliminado() {
		return eliminado;
	}
	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	
}
