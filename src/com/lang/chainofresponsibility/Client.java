package com.lang.chainofresponsibility;

public class Client {

	public static void main(String[] args) {
		Leader a=new Director("王二");
		Leader b=new GeneralManager("张三");
		Leader c=new Manager("李四");
		
		a.setNexLeader(c);
		c.setNexLeader(b);
		
		LeaveRequest re=new LeaveRequest("tom", 4, "结婚");
		a.handlRequest(re);
	}
}
