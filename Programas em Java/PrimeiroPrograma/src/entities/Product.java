package entities;

public class Product {
	
	private String name;
	public double price;
	public int quantity;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addProducts(int quantity){	
		if(quantity > 0)
			this.quantity += quantity;
	}
	
	public void removeProducts(int quantity){
		if(quantity > 0)
			this.quantity -= quantity;
	}
	
	public double totalValueStock() {
		return quantity * price;
	}
	
	public String toString() {
		return  name + ',' + ' '
				+ String.format("%.2f", price) + ','
				+ " " + quantity + ','
				+ String.format(" Total: %.2f", totalValueStock());
					
	}
}
