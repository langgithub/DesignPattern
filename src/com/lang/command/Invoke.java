package com.lang.command;
/**
 * 命令的调用者和发起者
 * @author lang
 *
 */
public class Invoke {

	private Command command;//也可以通过容器list《command》一堆命令，数据库事务底层实现
	public Invoke(Command command) {
		// TODO Auto-generated constructor stub
		this.command=command;
	}
	
	public void call(){
		command.excute();
	}
}
