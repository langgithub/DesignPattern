package com.lang.chainofresponsibility;

public class Director extends Leader{

	public Director(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void handlRequest(LeaveRequest request) {
		// TODO Auto-generated method stub
		if(request.getLeaveDays()<3){
			System.out.println("Ա����"+request.getEmpName());
			System.out.println("���Σ�"+this.name+",����ͨ��");
		}else{
			this.nexLeader.handlRequest(request);
		}
	}

}
