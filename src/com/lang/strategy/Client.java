package com.lang.strategy;

public class Client {

	public static void main(String[] args) {
		OldCustomerManyStrategy o=new OldCustomerManyStrategy();
		Context c=new Context(o);
		c.getMoney(800);
	}
}
