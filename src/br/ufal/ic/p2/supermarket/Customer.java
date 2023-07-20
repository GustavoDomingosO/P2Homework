package br.ufal.ic.p2.supermarket;

public class Customer 
{
	private int customerID;
	private String name;
	private String adress;
	
	public Customer(int ID, String customerName, String customerAdress) 
	{
		this.customerID = ID;
		this.name = customerName;
		this.adress = customerAdress;
	}
	public int getId() 
	{
		return this.customerID;
	}
	public String getName() 
	{
		return this.name;
	}
	public String getAdress() 
	{
		return this.adress;
	}
	
}
