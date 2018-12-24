package com.test2;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankOperation bo = new BankOperation();
		InitCustomer ic = new InitCustomer();
		bo.interface1(ic.init());
	}
}
