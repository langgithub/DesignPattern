package com.lang.chainofresponsibility;

public class GeneralManager extends Leader{

	


	public GeneralManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	public void handlRequest(LeaveRequest request) {
		// TODO Auto-generated method stub
		if(request.getLeaveDays()>10){
			System.out.println("员工："+request.getEmpName());
			System.out.println("总经理："+this.name+",审批通过");
		}else{
			System.out.println("这人想辞职，想辞职？");
		}
	}

}
