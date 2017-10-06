package com.lonebapps.gestionproductos.backend.business.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.lonebapps.gestionproductos.backend.business.model.Product;
import com.lonebapps.gestionproductos.backend.business.services.ProductService;
import com.lonebapps.gestionproductos.backend.integration.DummyWarehouse;

public class ProductServiceImpl implements ProductService {

	private DummyWarehouse db = new DummyWarehouse();

	public ProductServiceImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create(Product product) {
		db.getProductMap().put(product.getCode(), product);
	}

	@Override
	public Product read(int code) {
		return db.getProductMap().get(code);
	}

	@Override
	public void update(Product product) {
		create(product);

	}

	@Override
	public void delete(int code) {
		db.getProductMap().remove(code);

	}

	@Override
	public List<Product> getAll() {
		List<Product> products = new ArrayList<Product>(db.getProductMap().values());
		return products;
	}

	@Override
	public List<Product> getFromDate(Date joinDate) {

		List<Product> products = new ArrayList<Product>(db.getProductMap().values());
		List<Product> productsTemp = new ArrayList<Product>();
	
		for (Product product : products) {
			if(product.getJoinDate().after(joinDate)){
				productsTemp.add(product);
			}
		}
		
		return productsTemp;
	}

	@Override
	public List<Product> getBetweenDates(Date joinDate, Date endDate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getByPriceRange(double priceFrom, double priceUpTo) {
		List<Product> products = new ArrayList<Product>(db.getProductMap().values());
		List<Product> productsTemp = new ArrayList<Product>();
		
		//DESCARTADAS ESTAS OPCIONES POR QUE EL PRODUCTO NO IMPLEMENTA CLONABLE
		/*Iterator<Product> iterator = products.iterator();
		
		while(iterator.hasNext()){
			//System.out.println(iterator.next());
			productsTemp.add(iterator.next());
		}
		
		/*for (Product product : products) {
			productsTemp.add(product);
		}*/
		
		for (Product product : products) {
			if((product.getPrice() >= priceFrom && product.getPrice() <= priceUpTo)){
				productsTemp.add(product);
			}
		}
		
		return productsTemp;
	}

	@Override
	public int getNumberOfProducts() {
		return db.getProductMap().size();
	}

	@Override
	public double getAveragePrice() {

		List<Product> products = getAll();
		double size = products.size();
		double total = 0;
		for (Product product : products) {
			total += product.getPrice();
		}
		return total / size;
	}
	

}
