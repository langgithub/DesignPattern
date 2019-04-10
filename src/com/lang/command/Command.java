package com.lang.command;

public interface Command {
    //实际情况下可设计多个方法
	void excute();
}
class ConcreteCommand implements Command{

	private Receiver receiver;
	public ConcreteCommand(Receiver receiver) {
		// TODO Auto-generated constructor stub
		this.receiver=receiver;
	}
	public void excute() {
		// 命令执行前或后执行相应的处理
		receiver.action();
	}
	
}