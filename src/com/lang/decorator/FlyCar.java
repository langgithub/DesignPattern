package com.lang.decorator;

public class FlyCar extends SuperCar{

	public FlyCar(ICar car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	public void fly(){
		System.out.println("ÃÏ…œ∑…");
	}

	public void move() {
		// TODO Auto-generated method stub
		super.move();
		fly();	
	}
}
