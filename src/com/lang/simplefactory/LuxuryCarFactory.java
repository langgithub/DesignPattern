package com.lang.simplefactory;

public class LuxuryCarFactory implements AbstractFactory {

	public Engine creatEngine() {
		// TODO Auto-generated method stub
		return new LuxuryEngine();
	}

	public Seat creatSeat() {
		// TODO Auto-generated method stub
		return new luxurySeat();
	}

	public Tyre creatTyre() {
		// TODO Auto-generated method stub
		return new LuxuryTyre();
	}

}
