package com.lang.facede;

public interface 税务局 {

	void taxCertificate();
}

class 海定税务局 implements 税务局{

	@Override
	public void taxCertificate() {
		// TODO Auto-generated method stub
		System.out.println("在海定税务局办理税务登记");
	}
	
} 
