package com.maxtrain.bootcamp.dotnet;

public class Customer {

	// PROPERTIES
	private static int _nextId = 1;
	private int _id;
	private String _name;
	private boolean _isNationalAcct;
	private double _sales;
	
	// METHODS
	public void addSales(double amt) throws ArithmeticException, Exception {
		if (amt == 0) { throw new ArithmeticException("Amount cannot be 0."); }
		if (amt < 0) { throw new Exception("Amount must be greater than 0."); }
		setSales(getSales() + amt);
	}

	// GETTERS AND SETTERS
	public int getId() {
		return _id;
	}
	public void setId(int id) {
		_id = id;
	}
	
	public String getName() {
		return _name;
	}
	public void setName(String _name) {
		this._name = _name;
	}
	
	public boolean isNationalAcct() {
		return _isNationalAcct;
	}
	public void setNationalAcct(boolean isNationalAcct) {
		this._isNationalAcct = isNationalAcct;
	}
	
	public double getSales() {
		return _sales;
	}
	public void setSales(double sales) {
		this._sales = sales;
	}
	
	// CONSTRUCTORS
	public Customer(String name, boolean isNationalAcct, double sales) {
		this.setId(_nextId++);
		this.setName(name);
		this.setNationalAcct(isNationalAcct);
		this.setSales(sales);
	}
	public Customer(String name, boolean isNationalAcct) {
		this(name, isNationalAcct, 0);
	}
	public Customer(String name) {
		this(name, false);
	}
	public Customer() {
		this(null);
	}
	
}
