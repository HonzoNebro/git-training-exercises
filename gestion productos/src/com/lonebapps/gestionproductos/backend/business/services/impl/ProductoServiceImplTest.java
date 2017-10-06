package com.lonebapps.gestionproductos.backend.business.services.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lonebapps.gestionproductos.backend.business.model.Product;
import com.lonebapps.gestionproductos.backend.business.services.ProductService;

public class ProductoServiceImplTest {

	ProductService productoService = new ProductServiceImpl();
	
	
	@Test
	public void read() {
		
		Product product = productoService.read(150);
		
		assertNotNull(product);
		assertEquals(product.getCode(),154);
		
	}
	
	
	
	
	

}
