package entities;

public class Product {
	public String name;
	public double value;
	public int quantity;
	public double total;
	public String status = "c";
	
	public double getTotal() {
		return quantity * value;
	}
	public void addProduct(int quantity) {
		this.status = "u";
		this.quantity += quantity;
	}
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	public int getQuantity() {
		return quantity;
	}		
	public String getStock() {
		return String.format("Total in stock: %d unit(s), value: %.2f USD%n.", this.quantity, this.getTotal());
	}
	// sucesso
	public String msg() {
		String r = null;
		if (this.status == "c") {
			r = "created";
		} else if (this.status == "u") {
			r = "updated";
		}
		return String.format("-- Product %s successfully %s. --%n", this.name, r);
	}
}
