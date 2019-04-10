package com.lang.decorator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car=new Car();
		//car.move();
		

		
		FlyCar fly=new FlyCar(car);
	//	fly.move();
		
		SwimCar swim=new SwimCar(fly);
		swim.move();
	}

}
