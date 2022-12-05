package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Product p;
		p = new Product(); 
		System.out.print("Enter name of product: ");		
		p.name = sc.nextLine();
		System.out.print("Enter price (USD): ");
		p.value = sc.nextDouble();
		System.out.print("Enter quantity: ");
		p.quantity = sc.nextInt();
		
		System.out.printf("-- Product %s successfully created. --%n", p.name);
		System.out.printf("Total in stock: %.2f USD%n.", p.getTotal());
		sc.close();
	}
}
