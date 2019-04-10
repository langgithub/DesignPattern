package com.lang.birdge;

public interface Brand {
	void sale();
}

class Lenovo implements Brand{

	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("销售联想电脑");
	}
	
}
class Apple implements Brand{

	@Override
	public void sale() {
		// TODO Auto-generated method stub
		System.out.println("销售苹果电脑");
	}
	
}
