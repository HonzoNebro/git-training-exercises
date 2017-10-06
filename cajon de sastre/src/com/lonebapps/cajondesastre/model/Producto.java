package com.lonebapps.cajondesastre.model;

import java.io.Serializable;

public class Producto implements Serializable{
	private static final long serialVersionUID = 1L;

	// variables de instancia
	// las variables instancias se inicializan de forma implicita
	private int id; // 0
	private String origen, nombre; // null
	private double precio; // 0.0
	private boolean descatalogado; // false
	
	public Producto(int id, String origen, String nombre, double precio, boolean descatalogado) {
			super();
			this.id = id;
			this.origen = origen;
			this.nombre = nombre;
			this.precio = precio;
			this.descatalogado = descatalogado;
	}

	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isDescatalogado() {
		return descatalogado;
	}

	public void setDescatalogado(boolean descatalogado) {
		this.descatalogado = descatalogado;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", origen=" + origen + ", nombre=" + nombre + ", precio=" + precio
				+ ", descatalogado=" + descatalogado + "]";
	}
	
	
	
}
