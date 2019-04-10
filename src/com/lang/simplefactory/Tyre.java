package com.lang.simplefactory;

public interface Tyre {

	void revolve();
}
class LuxuryTyre implements Tyre{

	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("ºÃÂÖÌ¥");
	}
	
}
class lowTyre implements Tyre{

	public void revolve() {
		// TODO Auto-generated method stub
		System.out.println("Ò»°ãÂÖÌ¥");
	}
	
}