package com.lang.mediator;

public class Devlopment implements Department{

	private prisdent m;
	public Devlopment(prisdent m){
		this.m=m;
		m.register("Devlopment", this);
	}
	@Override
	public void outAction() {
		// TODO Auto-generated method stub
		System.out.println("�㱨��������Ŀ�з�ȱ�ʽ�");
		m.commend("Finacl");
	}

	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
		System.out.println("�з�����");
	}

}
