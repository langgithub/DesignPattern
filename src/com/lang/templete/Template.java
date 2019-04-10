package com.lang.templete;

public abstract class Template {

	private void order(){
		System.out.println("µ„≤Õ");
	}
	public abstract void eat();
	private void pay(){
		System.out.println("∏∂’À");
	}
	
	public final void process(){
		this.order();
		this.eat();
		this.pay();
	}
}
