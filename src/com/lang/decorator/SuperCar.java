package com.lang.decorator;

public class SuperCar implements ICar{

	protected ICar car;
	 
	public SuperCar(ICar car) {
		super();
		this.car = car;
	}

	public void move() {
		// TODO Auto-generated method stub
		car.move();
	}
}
