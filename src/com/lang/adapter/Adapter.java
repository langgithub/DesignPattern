package com.lang.adapter;

public class Adapter implements Target{

	private ThreeKong threeK;
	/**
	 * ��ת����
	 */
	public void virtual2To3() {
		// TODO Auto-generated method stub
		System.out.println("û�����׵ģ�ֻ������");
		System.out.println("������ת����������");
		threeK.getThreeKong();
	}
	public Adapter(ThreeKong threeK) {
		super();
		this.threeK = threeK;
	}
}
