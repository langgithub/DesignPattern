package com.lang.observer;


public class ObserverA implements Observer{

	private int myStatus;
	
	
	public int getMyStatus() {
		return myStatus;
	}


	public void setMyStatus(int myStatus) {
		this.myStatus = myStatus;
	}


	@Override
	public void update(Subject subject) {
		// TODO Auto-generated method stub
		myStatus=((ConcreteSubject)subject).getStatus();
		System.out.println(myStatus);
	}

}
