package com.lang.command;
/**
 * ����ĵ����ߺͷ�����
 * @author lang
 *
 */
public class Invoke {

	private Command command;//Ҳ����ͨ������list��command��һ��������ݿ�����ײ�ʵ��
	public Invoke(Command command) {
		// TODO Auto-generated constructor stub
		this.command=command;
	}
	
	public void call(){
		command.excute();
	}
}
