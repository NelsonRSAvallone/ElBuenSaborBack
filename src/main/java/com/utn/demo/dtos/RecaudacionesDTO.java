package com.utn.demo.dtos;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecaudacionesDTO {
	private Date fechaDesde;
	private Date fechaHasta;
	private double montoNeto;
	private double gastos;
	private double ganancias;
	private boolean eliminado;
	public RecaudacionesDTO() {
		super();
	}
	public RecaudacionesDTO(Date fechaDesde, Date fechaHasta, double montoNeto, double gastos, double ganancias,
			boolean eliminado) {
		super();
		this.fechaDesde = fechaDesde;
		this.fechaHasta = fechaHasta;
		this.montoNeto = montoNeto;
		this.gastos = gastos;
		this.ganancias = ganancias;
		this.eliminado = eliminado;
	}
	public Date getFechaDesde() {
		return fechaDesde;
	}
	public void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = fechaDesde;
	}
	public Date getFechaHasta() {
		return fechaHasta;
	}
	public void setFechaHasta(Date fechaHasta) {
		this.fechaHasta = fechaHasta;
	}
	public double getMontoNeto() {
		return montoNeto;
	}
	public void setMontoNeto(double montoNeto) {
		this.montoNeto = montoNeto;
	}
	public double getGastos() {
		return gastos;
	}
	public void setGastos(double gastos) {
		this.gastos = gastos;
	}
	public double getGanancias() {
		return ganancias;
	}
	public void setGanancias(double ganancias) {
		this.ganancias = ganancias;
	}
	public boolean isEliminado() {
		return eliminado;
	}
	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	
	
}
