package com.main;
import com.manfacturer.Manufacturer;

import com.product.Product;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Manufacturer manufacturer=Manufacturer.getmanufacturerobject("Bhumi","Adiveedhipalem","ABCDEFGHIJ");
		Product product=Product.getproductobject("bike","Honda",manufacturer,23500);
		if(manufacturer==null || product==null) {
			System.out.println("Invalid product/manufacturer information.");
		}
		else {
			System.out.println(product);
		}
			System.out.println(manufacturer);
		
		

	}

}
