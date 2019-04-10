package com.lang.strategy;

public class NewCustomerSmallStrategy implements Strategy{

	@Override
	public int getPrice(int standard) {
		// TODO Auto-generated method stub
		System.out.println("≤ª¥Ú’€");
		return standard;
	}

}
