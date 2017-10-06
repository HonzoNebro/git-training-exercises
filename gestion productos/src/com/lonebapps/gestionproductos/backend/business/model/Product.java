package com.lonebapps.gestionproductos.backend.business.model;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int code;
	private Date joinDate;
	private String name;
	private double price;

	public Product() {
		
	}

	public Product(int codigo, Date fechaAlta, String nombre, double precio) {
		this.code = codigo;
		this.joinDate = fechaAlta;
		this.name = nombre;
		this.price = precio;
	}

	@Override
	public String toString() {
		return "Product [code=" + code + ", joinDate=" + joinDate + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (code != other.code)
			return false;
		return true;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


}
