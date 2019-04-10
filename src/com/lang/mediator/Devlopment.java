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
		System.out.println("汇报工作！项目研发缺资金");
		m.commend("Finacl");
	}

	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
		System.out.println("研发工作");
	}

}
