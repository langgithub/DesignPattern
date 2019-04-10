package com.lang.chainofresponsibility;

public abstract class Leader {

	protected String name;
	protected Leader nexLeader;

	public Leader(String name) {
		super();
		this.name = name;
	}

	public void setNexLeader(Leader nexLeader) {
		this.nexLeader = nexLeader;
	}

	public abstract void handlRequest(LeaveRequest request);
	
}
