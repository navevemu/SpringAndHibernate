package com.royalBank.models;

public class CustomerDetails extends Customer{
	
	private long accountNo;
	private String bankIfsc;
	private long adharNo;
	private String panNo;
	private double savingsAmount;
	private double depositAmount;
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getBankIfsc() {
		return bankIfsc;
	}
	public void setBankIfsc(String bankIfsc) {
		this.bankIfsc = bankIfsc;
	}
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	@Override
	public String toString() {
		return "CustomerDetails [accountNo=" + accountNo + ", bankIfsc=" + bankIfsc + ", adharNo=" + adharNo
				+ ", panNo=" + panNo + ", savingsAmount=" + savingsAmount + ", depositAmount=" + depositAmount + "]";
	}
	public double getSavingsAmount() {
		return savingsAmount;
	}
	public void setSavingsAmount(double savingsAmount) {
		this.savingsAmount = savingsAmount;
	}
	public double getDepositAmount() {
		return depositAmount;
	}
	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}
	

}
