package com.lang.decorator;

public class AutoCar extends SuperCar{

	public AutoCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	private void auto() {
		// TODO Auto-generated method stub

		System.out.println("Œﬁ»Àº› ª");
	}
	
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		auto();
	}

}
