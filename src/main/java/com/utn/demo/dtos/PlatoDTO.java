package com.utn.demo.dtos;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlatoDTO {
	private int id;
	private String nombre;
	private float precioVenta;
	private float precioCosto;
	private int tiempoPreparacion;
	private String descripcion;
	private String imagen;
	private int cantidadVendida;
	private List<DetallePlatoDTO> detalle = new ArrayList<DetallePlatoDTO>();
	private PlatoCategoriaDTO categoria;
	private boolean eliminado;
	public PlatoDTO() {
		super();
	}
	public PlatoDTO(int id, String nombre, float precioVenta, float precioCosto, int tiempoPreparacion,
			String descripcion, String imagen, int cantidadVendida, List<DetallePlatoDTO> detalle,
			PlatoCategoriaDTO categoria, boolean eliminado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precioVenta = precioVenta;
		this.precioCosto = precioCosto;
		this.tiempoPreparacion = tiempoPreparacion;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.cantidadVendida = cantidadVendida;
		this.detalle = detalle;
		this.categoria = categoria;
		this.eliminado = eliminado;
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
	public float getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	public float getPrecioCosto() {
		return precioCosto;
	}
	public void setPrecioCosto(float precioCosto) {
		this.precioCosto = precioCosto;
	}
	public int getTiempoPreparacion() {
		return tiempoPreparacion;
	}
	public void setTiempoPreparacion(int tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
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
	public int getCantidadVendida() {
		return cantidadVendida;
	}
	public void setCantidadVendida(int cantidadVendida) {
		this.cantidadVendida = cantidadVendida;
	}
	public List<DetallePlatoDTO> getDetalle() {
		return detalle;
	}
	public void setDetalle(List<DetallePlatoDTO> detalle) {
		this.detalle = detalle;
	}
	public PlatoCategoriaDTO getCategoria() {
		return categoria;
	}
	public void setCategoria(PlatoCategoriaDTO categoria) {
		this.categoria = categoria;
	}
	public boolean isEliminado() {
		return eliminado;
	}
	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	
}
