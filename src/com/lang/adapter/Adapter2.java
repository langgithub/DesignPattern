package com.lang.adapter;

public class Adapter2 extends ThreeKong implements Target{

	public void virtual2To3() {
		// TODO Auto-generated method stub
		System.out.println("没有两孔的，只有三孔");
		System.out.println("有两孔转三孔适配器");
		super.getThreeKong();
	}
}
