package com.lang.adapter;

public class Adapter implements Target{

	private ThreeKong threeK;
	/**
	 * 二转三孔
	 */
	public void virtual2To3() {
		// TODO Auto-generated method stub
		System.out.println("没有两孔的，只有三孔");
		System.out.println("有两孔转三孔适配器");
		threeK.getThreeKong();
	}
	public Adapter(ThreeKong threeK) {
		super();
		this.threeK = threeK;
	}
}
