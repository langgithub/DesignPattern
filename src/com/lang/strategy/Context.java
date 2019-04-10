package com.lang.strategy;

public class Context {

	private Strategy strategy;
	public Context(Strategy st) {
		// TODO Auto-generated constructor stub
		this.strategy=st;
	}
	public void getMoney(int money){
		System.out.println(strategy.getPrice(money));
	}
}
