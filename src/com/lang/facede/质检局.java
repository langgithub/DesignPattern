package com.lang.facede;

public interface 质检局 {

	void orgCodeCertificate();
}
class 海定质检局 implements 质检局{

	@Override
	public void orgCodeCertificate() {
		// TODO Auto-generated method stub
		System.out.println("办理组织机构代码证");
	}
	
}
