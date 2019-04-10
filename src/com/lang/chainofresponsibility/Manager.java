package com.lang.chainofresponsibility;

public class Manager extends Leader{

	


	public Manager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	public void handlRequest(LeaveRequest request) {
		// TODO Auto-generated method stub
		if(request.getLeaveDays()<10){
			System.out.println("员工："+request.getEmpName());
			System.out.println("经理："+this.name+",审批通过");
		}else{
			this.nexLeader.handlRequest(request);
		}
	}

}
