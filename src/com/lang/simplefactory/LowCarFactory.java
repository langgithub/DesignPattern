package com.lang.simplefactory;

public class LowCarFactory implements AbstractFactory{

	public Engine creatEngine() {
		// TODO Auto-generated method stub
		return new lowEngine();
	}

	public Seat creatSeat() {
		// TODO Auto-generated method stub
		return new lowSeat();
	}

	public Tyre creatTyre() {
		// TODO Auto-generated method stub
		return new lowTyre();
	}

}
