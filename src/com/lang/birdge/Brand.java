package com.lang.birdge;

public interface Brand {
	void sale();
}

class Lenovo implements Brand{

	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("�����������");
	}
	
}
class Apple implements Brand{

	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("����ƻ������");
	}
	
}
