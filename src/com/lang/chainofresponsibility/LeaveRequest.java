package com.lang.chainofresponsibility;

public class LeaveRequest {

	private String empName;
	private int leaveDays;
	private String reason;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getLeaveDays() {
		return leaveDays;
	}
	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public LeaveRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LeaveRequest(String empName, int leaveDays, String reason) {
		super();
		this.empName = empName;
		this.leaveDays = leaveDays;
		this.reason = reason;
	}

	
}
