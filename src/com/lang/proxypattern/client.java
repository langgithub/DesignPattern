package com.lang.proxypattern;

public class client {

	public static void main(String[] args) {
		
		RealStar realStar=new RealStar();
		ProxyStar proxyStar=new ProxyStar(realStar);
		
		proxyStar.confer();
		proxyStar.signContract();
		proxyStar.bookTicket();
		proxyStar.sing();
		proxyStar.collectMoney();
	}
}
