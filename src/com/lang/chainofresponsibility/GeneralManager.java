package com.lang.chainofresponsibility;

public class GeneralManager extends Leader{

	


	public GeneralManager(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	public void handlRequest(LeaveRequest request) {
		// TODO Auto-generated method stub
		if(request.getLeaveDays()>10){
			System.out.println("Ա����"+request.getEmpName());
			System.out.println("�ܾ���"+this.name+",����ͨ��");
		}else{
			System.out.println("�������ְ�����ְ��");
		}
	}

}
