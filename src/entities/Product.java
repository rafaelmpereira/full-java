package entities;

public class Product {
	private String name;
	private double value;
	private int quantity;
	private String status = "c";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("Name created.");
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
		System.out.println("Value created.");
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
		System.out.println("Quantity created.");
	}
	public double getTotal() {
		return quantity * value;
	}
	
	public void addProduct(int quantity) {
		this.quantity += quantity;
		this.status = "u";
	}
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
		this.status = "u";
	}
	

	public String getStock() {
		return String.format("Total in stock: %d unit(s), value: %.2f USD of %s.%n", getQuantity(), getTotal(), getName());
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
