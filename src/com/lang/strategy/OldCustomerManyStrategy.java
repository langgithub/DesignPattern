package com.lang.strategy;

public class OldCustomerManyStrategy implements Strategy{

	@Override
	public int getPrice(int standard) {
		// TODO Auto-generated method stub
		System.out.println("´ò°ËÕÛ");
		return (int) (standard*0.8);
	}

}
