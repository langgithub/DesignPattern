package com.lang.chainofresponsibility;

public class Client {

	public static void main(String[] args) {
		Leader a=new Director("����");
		Leader b=new GeneralManager("����");
		Leader c=new Manager("����");
		
		a.setNexLeader(c);
		c.setNexLeader(b);
		
		LeaveRequest re=new LeaveRequest("tom", 4, "���");
		a.handlRequest(re);
	}
}
