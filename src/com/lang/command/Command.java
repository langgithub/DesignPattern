package com.lang.command;

public interface Command {
    //ʵ������¿���ƶ������
	void excute();
}
class ConcreteCommand implements Command{

	private Receiver receiver;
	public ConcreteCommand(Receiver receiver) {
		// TODO Auto-generated constructor stub
		this.receiver=receiver;
	}
	public void excute() {
		// ����ִ��ǰ���ִ����Ӧ�Ĵ���
		receiver.action();
	}
	
}