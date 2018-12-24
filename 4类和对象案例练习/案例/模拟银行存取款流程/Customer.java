package com.test2;

public class Customer {
	public Customer() {
		super();
	}
	public Customer(int number, int password, String name, int money) {
		super();
		this.number = number;
		this.password = password;
		this.name = name;
		this.money = money;
	}
	private int number;
	private int password;
	private String name;
	private int money;
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
}
