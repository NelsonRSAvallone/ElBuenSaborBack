package com.utn.demo.entity;

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
public class DetallePlato {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private float cantidad;
	@OneToOne
	private UnidadMedida unidadMedida;
	@OneToOne
	private Plato plato;
	@OneToOne
	@JoinColumn(name = "fk_insumo")
	private Insumo insumo;
	@Column(name = "eliminado")
	private boolean eliminado;
	public DetallePlato() {
		super();
	}
	public DetallePlato(int id, float cantidad, UnidadMedida unidadMedida, Plato plato, Insumo insumo,
			boolean eliminado) {
		super();
		this.id = id;
		this.cantidad = cantidad;
		this.unidadMedida = unidadMedida;
		this.plato = plato;
		this.insumo = insumo;
		this.eliminado = eliminado;
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
	public UnidadMedida getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(UnidadMedida unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	public Plato getPlato() {
		return plato;
	}
	public void setPlato(Plato plato) {
		this.plato = plato;
	}
	public Insumo getInsumo() {
		return insumo;
	}
	public void setInsumo(Insumo insumo) {
		this.insumo = insumo;
	}
	public boolean isEliminado() {
		return eliminado;
	}
	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	
}