package com.lang.strategy;

public class OldCustomerSmallStrategy implements Strategy {

	@Override
	public int getPrice(int standard) {
		// TODO Auto-generated method stub
		System.out.println("��8.5��");
		return (int) (standard*0.85);
	}

}
