package com.xxw.entity;

import java.util.Date;

public class Activity {
	private int leaveId;
	private String employeeId;
	private String employeeName;
	private Date month;
	private int startTime;
	private int day;
	private int reason;
	private String approvePersion;
	public int getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Date getMonth() {
		return month;
	}
	public void setMonth(Date month) {
		this.month = month;
	}
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getReason() {
		return reason;
	}
	public void setReason(int reason) {
		this.reason = reason;
	}
	public String getApprovePersion() {
		return approvePersion;
	}
	public void setApprovePersion(String approvePersion) {
		this.approvePersion = approvePersion;
	}
	@Override
	public String toString() {
		return "Activity [leaveId=" + leaveId + ", employeeId=" + employeeId + ", employeeName=" + employeeName
				+ ", month=" + month + ", startTime=" + startTime + ", day=" + day + ", reason=" + reason
				+ ", approvePersion=" + approvePersion + "]";
	}

}
