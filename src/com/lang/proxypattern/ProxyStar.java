package com.lang.proxypattern;

public class ProxyStar implements star {

	star star;
	public ProxyStar(com.lang.proxypattern.star star) {
		super();
		this.star = star;
	}

	public void confer() {
		// TODO Auto-generated method stub
		System.out.println("proxyStar.confer");
	}

	public void signContract() {
		// TODO Auto-generated method stub
		System.out.println("proxyStar.signContract");
	}

	public void bookTicket() {
		// TODO Auto-generated method stub
		System.out.println("proxyStar.bookTicket");
	}

	public void sing() {
		// TODO Auto-generated method stub
		star.sing();
	}

	public void collectMoney() {
		// TODO Auto-generated method stub
		System.out.println("proxyStar.collectMoney");
	}

}
