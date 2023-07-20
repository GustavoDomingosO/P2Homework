package br.ufal.ic.p2.supermarket;

import java.util.ArrayList;

public class ShoppingCart 
{
	private Customer customer;
	private ArrayList<Product> productList;
	
	
	public ShoppingCart(Customer customerCart){
		this.customer = customerCart;
		this.productList = new ArrayList<Product>();
	}
	
	public void addProduct(Product productObj) 
	{
		productList.add(productObj);
	}
	public void removeProduct(Product productObj) 
	{
		if (productList.contains(productObj)) 
		{
			System.out.println("The item " + productObj.getName() + " was removed from the shopping cart.");
			productList.remove(productObj);
			
		}
		else 
		{
			System.out.println("Error: " + productObj.getName() + " does not exits in the shopping cart.");
		}
		
	}
	public String getContents() {
		String allProductsinCart = "";
		for(int i = 0; i < this.productList.size(); i++) 
		{
			allProductsinCart += this.productList.get(i).getName();
			if (i != this.productList.size() - 1) 
			{
				allProductsinCart += " - ";				
			}
		}
			
		return allProductsinCart;
	}
	public int getCustomerID() 
	{
		return this.customer.getId();
	}
	public int getItemCount() 
	{
		return this.productList.size();
	}
	public double getTotalPrice() {
		double totalPrice = 0;
		for(int i = 0; i < this.productList.size(); i++) {
			totalPrice += this.productList.get(i).getPrice();
		}
		return totalPrice;
	}
	public String getCustomerAdress() 
	{
		return this.customer.getAdress();
	}
	public String getCustomerName() 
	{
		return this.customer.getName();
	}

}
