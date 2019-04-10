package com.lang.facede;

public class RegisterFace {

	public void register(){
		工商局 g =new  海定工商局();
		g.chekName();
		质检局 z=new 海定质检局();
		z.orgCodeCertificate();
		税务局 s=new 海定税务局();
		s.taxCertificate();
		工商银行 y=new  海定工商银行();
		y.openAccount();
	}
}
