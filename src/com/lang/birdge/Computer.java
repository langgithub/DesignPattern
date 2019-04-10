package com.lang.birdge;

public class Computer {

	public Brand brand;
	public Computer(Brand brand){
		this.brand=brand;
	}
	public void sale() {
		// TODO Auto-generated method stub
       brand.sale();
	}
	
}

class desktop extends Computer{

	public desktop(Brand brand) {
		super(brand);
	}
	
	@Override
	public void sale() {
		// TODO Auto-generated method stub
		super.sale();
		System.out.println("销售桌面笔记本");
	}
	
}

class LapTop extends Computer{

	public LapTop(Brand brand) {
		super(brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sale() {
		// TODO Auto-generated method stub
		super.sale();
		System.out.println("销售桌面笔记本");
	}
	
}
