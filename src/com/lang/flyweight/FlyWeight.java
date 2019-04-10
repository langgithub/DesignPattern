package com.lang.flyweight;


public interface FlyWeight {

	void setColor(String color);
	String getColor();
	void movie(ZuoBiao zb);
}

class qizhi implements FlyWeight{

	private String color;
	public qizhi(String color) {
		this.color=color;
	}
	@Override
	public void setColor(String color) {
		// TODO Auto-generated method stub
		this.color=color;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public void movie(ZuoBiao zb) {
		// TODO Auto-generated method stub
		System.out.println("ÑÕÉ«£º"+color);
		System.out.println("×ø±ê£º"+zb.getX()+","+zb.getY());
	}
	
}
