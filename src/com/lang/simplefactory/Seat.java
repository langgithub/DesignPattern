package com.lang.simplefactory;

public interface Seat {

	void message();
}
class luxurySeat implements Seat{

	public void message() {
		// TODO Auto-generated method stub
		System.out.println("������");
	}
	
}
class lowSeat implements Seat{

	public void message() {
		// TODO Auto-generated method stub
	    System.out.println("һ������");
	}
	
}