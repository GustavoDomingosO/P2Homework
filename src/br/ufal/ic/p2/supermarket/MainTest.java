package br.ufal.ic.p2.supermarket;

public class MainTest {
	
	// Funtion to print relevant information.
	public static void printTest(ShoppingCart shoppingCartVar) 
	{
		System.out.println("--------------------------------------------------------");
		System.out.println("Costumer's name is " + shoppingCartVar.getCustomerName() + ".");
		System.out.println(shoppingCartVar.getCustomerName() +  "'s ID is " + shoppingCartVar.getCustomerID() + ".");	
		System.out.println(shoppingCartVar.getCustomerName() + " lives in " + shoppingCartVar.getCustomerAdress() + ".");	
		System.out.println(" ");
		System.out.println("There are " + shoppingCartVar.getItemCount() + " products in " + shoppingCartVar.getCustomerName() + "'s cart.");	
		System.out.println("Products are: " + shoppingCartVar.getContents() + ".");	
		System.out.println("Total Price is " + shoppingCartVar.getTotalPrice() + ".");	
		System.out.println("--------------------------------------------------------");
	}
	
	public static void main(String[] args) 
	{
		Product LSShirt = new Product("Long Sleeve Shirt", 35.85);
		Product SShirt = new Product("Sweatshirt", 65.37);
		Product Beanie = new Product("Beanie", 13.22);
		Product JPants = new Product("Jeans", 30.35);	
		Product BBUnderwear = new Product("Boxer Briefs", 15.99);
		Product Socks = new Product("White Socks", 9.18);
		
		Customer Reed = new Customer(98,"Reed Richards", "15 Maple Street");
		Customer Susan = new Customer(58,"Susan Storm", "Main Street");
		
		ShoppingCart FirstCart = new ShoppingCart(Reed);
		ShoppingCart SecondCart = new ShoppingCart(Susan);
		
		FirstCart.addProduct(LSShirt);
		FirstCart.addProduct(JPants);
		FirstCart.addProduct(BBUnderwear);
		
		SecondCart.addProduct(SShirt);
		SecondCart.addProduct(JPants);
		SecondCart.addProduct(Beanie);
		SecondCart.addProduct(Socks);
		
		printTest(FirstCart);
		// Testing the "remove product" warning.
		FirstCart.removeProduct(JPants);
		FirstCart.removeProduct(Socks);
		
		printTest(SecondCart);
		
	}
}
