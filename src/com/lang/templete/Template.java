package com.lang.templete;

public abstract class Template {

	private void order(){
		System.out.println("���");
	}
	public abstract void eat();
	private void pay(){
		System.out.println("����");
	}
	
	public final void process(){
		this.order();
		this.eat();
		this.pay();
	}
}
