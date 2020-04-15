package com.maxtrain.bootcamp.dotnet;

import java.util.ArrayList;

public class ConsoleTest {

	public static void main(String[] args) {
		
		Customer cust = new Customer("MAX Technical Training", true);
		//cust.setId(1);
		System.out.println(cust.getName() + ": $" + cust.getSales());
		
		try {
			cust.addSales(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(cust.getName() + ": $" + cust.getSales());
		
		try {
			cust.addSales(-1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			cust.addSales(0);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("GET SINGLE: " + cust.getId() + ": " + cust.getName() + " | " + "Sales total: " + "$" + cust.getSales());
		
		ArrayList<Customer> customers = new ArrayList<Customer>();	
		customers.add(cust);
		Customer cust2 = new Customer("Amazon");
		Customer cust3 = new Customer("Kroger");
		customers.add(cust2);
		customers.add(cust3);
		
		for(Customer c : customers) {
			String message = String.format("%d: %s | Sales: $%f | NtlAcct: %b", c.getId(), c.getName(), c.getSales(), c.isNationalAcct());
			System.out.println(message);
		}
		
	}

}
