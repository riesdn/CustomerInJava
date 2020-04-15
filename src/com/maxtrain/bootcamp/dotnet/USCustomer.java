package com.maxtrain.bootcamp.dotnet;

public class USCustomer extends Customer {

	public USCustomer(String name, double sales) {
		super(name, true, sales);
	}
	public USCustomer(String name) {
		this(name, 0);
	}
	public USCustomer() {
		this("US Customer");
	}
}
