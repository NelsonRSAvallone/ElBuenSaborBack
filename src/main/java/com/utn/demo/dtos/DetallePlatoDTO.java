package com.utn.demo.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetallePlatoDTO {
	private int id;
	private float cantidad;
	private UnidadMedidaDTO unidadMedida;
	private InsumoDTO ingrediente;
	private boolean eliminado;
	private PlatoDTO plato;
	public DetallePlatoDTO() {
		super();
	}
	public DetallePlatoDTO(int id, float cantidad, UnidadMedidaDTO unidadMedida, InsumoDTO ingrediente,
			boolean eliminado, PlatoDTO plato) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.unidadMedida = unidadMedida;
		this.ingrediente = ingrediente;
		this.eliminado = eliminado;
		this.plato = plato;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getCantidad() {
		return cantidad;
	}
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	public UnidadMedidaDTO getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(UnidadMedidaDTO unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	public InsumoDTO getIngrediente() {
		return ingrediente;
	}
	public void setIngrediente(InsumoDTO ingrediente) {
		this.ingrediente = ingrediente;
	}
	public boolean isEliminado() {
		return eliminado;
	}
	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	public PlatoDTO getPlato() {
		return plato;
	}
	public void setPlato(PlatoDTO plato) {
		this.plato = plato;
	}
	
}
