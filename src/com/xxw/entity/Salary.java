package com.xxw.entity;

public class Salary {
	private int salaryId;
	private String employeeId;
	private String name;
	private int year;
	private int month;
	private String basicWage;
	private String overtimeWage;
	private String trafficWage;
	private String totalWage;
	private String kaoqinReduce;
	private String secureReduce;
	private String taxReduce;
	private String totalReduce;
	private String realWage;
	public int getSalaryId() {
		return salaryId;
	}
	public void setSalaryId(int salaryId) {
		this.salaryId = salaryId;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public String getBasicWage() {
		return basicWage;
	}
	public void setBasicWage(String basicWage) {
		this.basicWage = basicWage;
	}
	public String getOvertimeWage() {
		return overtimeWage;
	}
	public void setOvertimeWage(String overtimeWage) {
		this.overtimeWage = overtimeWage;
	}
	public String getTrafficWage() {
		return trafficWage;
	}
	public void setTrafficWage(String trafficWage) {
		this.trafficWage = trafficWage;
	}
	public String getTotalWage() {
		return totalWage;
	}
	public void setTotalWage(String totalWage) {
		this.totalWage = totalWage;
	}
	public String getKaoqinReduce() {
		return kaoqinReduce;
	}
	public void setKaoqinReduce(String kaoqinReduce) {
		this.kaoqinReduce = kaoqinReduce;
	}
	public String getSecureReduce() {
		return secureReduce;
	}
	public void setSecureReduce(String secureReduce) {
		this.secureReduce = secureReduce;
	}
	public String getTaxReduce() {
		return taxReduce;
	}
	public void setTaxReduce(String taxReduce) {
		this.taxReduce = taxReduce;
	}
	public String getTotalReduce() {
		return totalReduce;
	}
	public void setTotalReduce(String totalReduce) {
		this.totalReduce = totalReduce;
	}
	public String getRealWage() {
		return realWage;
	}
	public void setRealWage(String realWage) {
		this.realWage = realWage;
	}
	@Override
	public String toString() {
		return "Salary [salaryId=" + salaryId + ", employeeId=" + employeeId + ", name=" + name + ", year=" + year
				+ ", month=" + month + ", basicWage=" + basicWage + ", overtimeWage=" + overtimeWage + ", trafficWage="
				+ trafficWage + ", totalWage=" + totalWage + ", kaoqinReduce=" + kaoqinReduce + ", secureReduce="
				+ secureReduce + ", taxReduce=" + taxReduce + ", totalReduce=" + totalReduce + ", realWage=" + realWage
				+ "]";
	}
	
	
	
}
