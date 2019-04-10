package com.lang.mediator;

public class Client {

	public static void main(String[] args) {
		prisdent m=new prisdent();
		Devlopment del=new Devlopment(m);
		Finacl finacl=new Finacl(m);
		del.outAction();
	}
}
