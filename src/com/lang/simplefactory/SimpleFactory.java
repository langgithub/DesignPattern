package com.lang.simplefactory;


public class SimpleFactory {

	public static Car createAudi(){
		return new AuDi();
	}
	public static Car createBengci(){
		return new BengCi();
	}
}
