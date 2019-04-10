package com.lang.strategy;

public class NewCustomerManyStrategy implements Strategy{

	@Override
	public int getPrice(int standard) {
		// TODO Auto-generated method stuby
		System.out.println("´ò¾ÅÕÛ");
		return (int) (standard*0.9);
	}

}
