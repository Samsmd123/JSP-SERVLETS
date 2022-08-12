package com.policywebdb.model;

public class Policy {
	private Integer policyNumber;
	private String policyName;
	private double premium;
	private String type;
	private int duration;
	private String coverage;
	private String cateogry;
	private double sumAssured;
	private String brand;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(Integer policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getCoverage() {
		return coverage;
	}
	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}
	public String getCateogry() {
		return cateogry;
	}
	public void setCateogry(String cateogry) {
		this.cateogry = cateogry;
	}
	public double getSumAssured() {
		return sumAssured;
	}
	public void setSumAssured(double sumAssured) {
		this.sumAssured = sumAssured;
	}
	@Override
	public String toString() {
		return "Policy [policyNumber=" + policyNumber + ", policyName=" + policyName + ", premium=" + premium
				+ ", type=" + type + ", duration=" + duration + ", coverage=" + coverage + ", cateogry=" + cateogry
				+ ", sumAssured=" + sumAssured + ", brand=" + brand + "]";
	}

}
