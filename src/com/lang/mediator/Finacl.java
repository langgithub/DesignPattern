package com.lang.mediator;

public class Finacl implements Department{
	private prisdent m;
	public Finacl(prisdent m){
		this.m=m;
		m.register("Finacl", this);
	}
	@Override
	public void outAction() {
		// TODO Auto-generated method stub
		System.out.println("汇报工作！怎么花钱");
	}

	@Override
	public void selfAction() {
		// TODO Auto-generated method stub
		System.out.println("资金管理,数钱");
	}

}
