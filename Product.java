package com.product;
import com.manfacturer.Manufacturer;

public class Product {
	private String productName;
	private String category;
	private Manufacturer manufacturer;
	private double price;
	private Product(String productName,String category,Manufacturer manufacturer,double price) {
		this.productName=productName;
		this.category=category;
		this.manufacturer=manufacturer;
		this.price=price;
	}
	public String getproductName() {
		return productName;
	}
	public String getcategory() {
		return category;
	}
	public Manufacturer getmanufacturer() {
		return manufacturer;
	}
	public double getprice() {
		return price;
	}
	public void setproductName(String productName) {
		this.productName=productName;
	}
	public void setcategory(String category) {
		this.category=category;
	}
	public void setmanufacturer(Manufacturer manufacturer){
		this.manufacturer=manufacturer;
	}
	public void setprice(double price) {
		this.price=price;
	}
	public String tostring() {
		return "Manufacturer[Product Name:"+productName+",Category:"+category+",manufacturer:"+manufacturer+",Price:"+price+"]";
	}
	public static Product getproductobject(String productName,String category,Manufacturer manufacturer,double price) {
		if(price>0||manufacturer==null) {
			return null;
		}
	   return new Product(productName,category,manufacturer,price);
	}
}
