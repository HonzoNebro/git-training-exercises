package com.lonebapps.cajondesastre.model;

import java.io.Serializable;

public class Caña implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tipoCerveza;
	private Tapa tapa;

	public Caña() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Caña [tipoCerveza=" + tipoCerveza + ", tapa=" + tapa + "]";
	}

	public Tapa getTapa() {
		return tapa;
	}

	public void setTapa(Tapa tapa) {
		this.tapa = tapa;
	}

	public String getTipoCerveza() {
		return tipoCerveza;
	}

	public void setTipoCerveza(String tipoCerveza) {
		this.tipoCerveza = tipoCerveza;
	}

}
