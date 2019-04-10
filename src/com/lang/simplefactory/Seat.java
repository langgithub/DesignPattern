package com.lang.simplefactory;

public interface Seat {

	void message();
}
class luxurySeat implements Seat{

	public void message() {
		// TODO Auto-generated method stub
		System.out.println("ºÃ×ùÒÎ");
	}
	
}
class lowSeat implements Seat{

	public void message() {
		// TODO Auto-generated method stub
	    System.out.println("Ò»°ã×ùÒÎ");
	}
	
}