package com.lonebapps.gestionproductos.backend.business.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.lonebapps.gestionproductos.backend.business.model.Product;
import com.lonebapps.gestionproductos.backend.business.services.ProductService;
import com.lonebapps.gestionproductos.backend.business.services.impl.ProductServiceImpl;

public class Test {

	private ProductService productservice = new ProductServiceImpl();

	/**
	 * Method to test our class ProductServiceImpl...
	 */
	private void run() {
		testGetAll();
		// testCreate();
		// testUpdate();
		// testRead();
		// testDelete();
		// testRead();
		testgetNumberOfProducts();
		testgetAveragePrice();
		testgetByPriceRange();
		testgetFromDate();
	}

	private void testCreate() {
		Product product = new Product(210, null, "NUEVO PRODUCTO", 99.99);
		productservice.create(product);
	}

	private void testUpdate() {
		Product p = productservice.read(180);
		p.setPrice(50);
		p.setName("PRODUCTO EDITADO");
		productservice.update(p);
		testGetAll();
	}

	private void testRead() {
		System.out.println("LEYENDO: " + productservice.read(110));
	}

	private void testDelete() {
		productservice.delete(110);
		System.out.println("Producto 110 borrado, compruebalo con READ ");
	}

	private void testGetAll() {
		List<Product> products = productservice.getAll();
		for (Product product : products) {
			System.out.println(product);
		}
	}

	@SuppressWarnings("unused")
	private void testgetFromDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = null;
		try {
			date = sdf.parse("02/10/2017");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(productservice.getFromDate(date));
	}

	private void testgetNumberOfProducts() {
		System.out.println("Numero de productos: " + productservice.getNumberOfProducts());
	}
	
	private void testgetAveragePrice(){
		System.out.println("El precio medio de los productos es de: "+productservice.getAveragePrice());
	}
	
	private void testgetByPriceRange(){
		double min = 15.0;
		double max = 60.0;
		System.out.println(productservice.getByPriceRange(min, max));
	}

	public static void main(String[] args) {

		new Test().run();

	}

}
