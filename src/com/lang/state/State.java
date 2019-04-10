package com.lang.state;

public interface State {

	void handle();
}
class bookState implements State{

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("此房间已经被预定");
	}
	
}
class freeState implements State{

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("此房间处于空闲状态");
	}
	
}
class liveState implements State{

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("此房间处于入住状态");
	}
	
}