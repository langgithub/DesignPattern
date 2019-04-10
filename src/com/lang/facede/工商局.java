package com.lang.facede;

public interface 工商局 {

	void chekName();
}
class 海定工商局   implements 工商局{

	@Override
	public void chekName() {
		// TODO Auto-generated method stub
		System.out.println("海定工商局检查名字是否冲突");
	}
	
} 