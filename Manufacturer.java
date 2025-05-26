package com.manfacturer;

public class Manufacturer {
	private String manufacturerName;
	private String manufacturerAddress;
	private String registrationNumber;
	private Manufacturer(String manufacturerName,String manufacturerAddress,String registrationNumber) {
		this.manufacturerName=manufacturerName;
		this.manufacturerAddress=manufacturerAddress;
		this.registrationNumber=registrationNumber;
	}
	public String getmanufacturerName() {
		return manufacturerName;
	}
	public String getmanufacturerAddress() {
		return manufacturerAddress;
	}
	public String registrationNumber() {
		return registrationNumber;
	}
	public void setmanufacturerName(String manufacturerName) {
		this.manufacturerName=manufacturerName;
	}
	public void setmanufacturerAddress(String manufacturerAddress) {
		this.manufacturerAddress=manufacturerAddress;
		
	}
	public void setregistrationNumber(String registrationNumber) {
		this.registrationNumber=registrationNumber;
	}
	public  String toString() {
		
			return "Manufacturer:[Manufacturer Name:"+manufacturerName+",Manufacture Address:"+manufacturerAddress+",RegNo:"+registrationNumber+"]";	
	}
	public static Manufacturer getmanufacturerobject(String manufacturerName,String manufacturerAddress,String registrationNumber) {
		if(registrationNumber.length()!=10||registrationNumber==null) {
			return null;
		}
		return new Manufacturer(manufacturerName,manufacturerAddress,registrationNumber);
	}
}
