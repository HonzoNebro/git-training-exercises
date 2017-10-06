package com.lonebapps.gestionproductos.backend.business.services;

import java.util.Date;
import java.util.List;

import com.lonebapps.gestionproductos.backend.business.model.Product;

public interface ProductService {

	// Operaciones CRUD

	public void create(Product product);

	public Product read(int code);

	public void update(Product product);

	public void delete(int code);

	// Obtención de listas

	public List<Product> getAll();

	public List<Product> getFromDate(Date joinDate);

	public List<Product> getBetweenDates(Date joinDate, Date endDate);

	public List<Product> getByPriceRange(double priceFrom, double priceUpTo);
	
	//Obtención de datos
	
	public int getNumberOfProducts();
	public double getAveragePrice();
}
