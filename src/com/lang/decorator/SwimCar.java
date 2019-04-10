package com.lang.decorator;

public class SwimCar extends SuperCar{

	public SwimCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	public void swim(){
		System.out.println("к╝обсн");
	}
	
	public void move() {
		// TODO Auto-generated method stub
		super.move();
		swim();
	}
}
