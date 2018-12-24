package com.test2;

public class InitCustomer {
	public Customer[] init(){
		Customer[] cuss = new Customer[100];
		cuss[0] = new Customer(1001,123456,"Áõ±¸", 10000);
		cuss[1] = new Customer(1002,123456,"¹ØÓğ", 100);
		cuss[2] = new Customer(1003,123456,"ÕÅ·É", 10);
		cuss[3] = new Customer(1004,123456,"ÕÔÔÆ", 1000);
		cuss[4] = new Customer(1005,123456,"Öî¸ğÁÁ", 5000);
		cuss[5] = new Customer(1006,123456,"²Ü²Ù", 50000);
		return cuss;
	}
}
