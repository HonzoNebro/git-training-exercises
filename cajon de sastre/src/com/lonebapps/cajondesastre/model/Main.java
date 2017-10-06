package com.lonebapps.cajondesastre.model;

public class Main {

	public static void main(String[] args) {
		Producto producto1 = new Producto(100, "Plátano", "Canarias", 1.20, false);
		/*
			producto1.id = 100;
			producto1.nombre = "Plátano";
			producto1.origen = "Canarias";
			producto1.precio = 1.20;
			producto1.descatalogado = false;
		 */
		
		Producto producto2 = new Producto(120, "Naranja", "Valencia", 1.7, true);
		
		System.out.println(producto1.toString());
		System.out.println(producto2);
		
		Persona cliente = new Cliente();
		cliente.setApellido1("Lorenzo"); 
		System.out.println(cliente);
	}

}
