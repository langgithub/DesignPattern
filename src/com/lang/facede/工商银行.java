package com.lang.facede;

public interface 工商银行 {

	void openAccount();
}
class 海定工商银行 implements 工商银行{

	@Override
	public void openAccount() {
		// TODO Auto-generated method stub
		System.out.println("开银行账户");
	}
	
}