package br.ufal.ic.p2.supermarket;

public class Product {

	private String name;
	private double price;
	
	public String getName(){
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public Product(String productName, double productPrice){
		this.name = productName;
		this.price = productPrice;
		
	}
}
