package com.lang.state;

public class HomeContext {

	private State state;
	
	public void setState(State state){
		this.state=state;
	}
	
	public void showState(){
		System.out.println("ÐÞ¸Ä×´Ì¬");
		state.handle();
	}
}
