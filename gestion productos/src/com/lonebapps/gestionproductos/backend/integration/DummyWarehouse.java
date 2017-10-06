package com.lonebapps.gestionproductos.backend.integration;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import com.lonebapps.gestionproductos.backend.business.model.Product;

public class DummyWarehouse {
	
	private static final Map<Integer, Product> PRODUCTS;
	
	static {
		PRODUCTS = new HashMap<Integer, Product>();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Product p1 = new Product(110,null,"AKLAR",79.99);
		Product p2 = new Product(120,null,"NÖDEBO",279.99);
		Product p3 = new Product(130,null,"LÖBBO",0.99);
		Product p4 = new Product(140,null,"KNUBBIG",3.99);
		Product p5 = new Product(150,null,"VÄTE",49.99);
		Product p6 = new Product(160,null,"MICKE",29.99);
		Product p7 = new Product(170,null,"MICKE",39.99);
		Product p8 = new Product(180,null,"TALLVIK",9.99);
		Product p9 = new Product(190,null,"KRYSSBO",12.99);
		Product p10 = new Product(200,null,"BILD",3.99);
		
		try{
			p1.setJoinDate(sdf.parse("01/10/2017"));
			p2.setJoinDate(sdf.parse("02/10/2017"));
			p3.setJoinDate(sdf.parse("03/10/2017"));
			p4.setJoinDate(sdf.parse("01/10/2017"));
			p5.setJoinDate(sdf.parse("02/10/2017"));
			p6.setJoinDate(sdf.parse("03/10/2017"));
			p7.setJoinDate(sdf.parse("01/10/2017"));
			p8.setJoinDate(sdf.parse("02/10/2017"));
			p9.setJoinDate(sdf.parse("03/10/2017"));
			p10.setJoinDate(sdf.parse("04/10/2017"));
		} catch (Exception e){
			e.printStackTrace();
		}
		
		PRODUCTS.put(p1.getCode(), p1);
		PRODUCTS.put(p2.getCode(), p2);
		PRODUCTS.put(p3.getCode(), p3);
		PRODUCTS.put(p4.getCode(), p4);
		PRODUCTS.put(p5.getCode(), p5);
		
		PRODUCTS.put(p6.getCode(), p6);
		PRODUCTS.put(p7.getCode(), p7);
		PRODUCTS.put(p8.getCode(), p8);
		PRODUCTS.put(p9.getCode(), p9);
		PRODUCTS.put(p10.getCode(), p10);
	}
	
	public Map<Integer, Product> getProductMap(){
		return PRODUCTS;
		
	}

}
