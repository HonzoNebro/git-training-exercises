package com.lonebapps.cajondesastre.model;

import java.io.Serializable;

public class Tapa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Tapa [nombre=" + nombre + "]";
	}

	public Tapa() {
		// TODO Auto-generated constructor stub
	}

}
