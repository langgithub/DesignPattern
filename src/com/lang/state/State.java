package com.lang.state;

public interface State {

	void handle();
}
class bookState implements State{

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("�˷����Ѿ���Ԥ��");
	}
	
}
class freeState implements State{

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("�˷��䴦�ڿ���״̬");
	}
	
}
class liveState implements State{

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("�˷��䴦����ס״̬");
	}
	
}