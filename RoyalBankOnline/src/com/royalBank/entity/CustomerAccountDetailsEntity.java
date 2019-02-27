package com.royalBank.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CUSTOMERACCOUNTDETAILS")
public class CustomerAccountDetailsEntity {
	@Id
	@Column(name="ACCOUNT_NUMBER")
	private long account_number;
	
	@Column(name="BANK_IFSC")
	private String bank_ifsc;
	@Column(name="ADHAR_NUMBER")
	private long adhar_number;
	
	@Column(name="PAN_NUMBER")
	private String pan_number;
	
	@Column(name="SAVINGS_AMOUNT")
	private double saving_amount;
	
	@Column(name="FIXED_AMOUNT")
	private double fixed_amount;

	public long getAccount_number() {
		return account_number;
	}

	public void setAccount_number(long account_number) {
		this.account_number = account_number;
	}

	public String getBank_ifsc() {
		return bank_ifsc;
	}

	public void setBank_ifsc(String bank_ifsc) {
		this.bank_ifsc = bank_ifsc;
	}

	public long getAdhar_number() {
		return adhar_number;
	}

	public void setAdhar_number(long adhar_number) {
		this.adhar_number = adhar_number;
	}

	public String getPan_number() {
		return pan_number;
	}

	public void setPan_number(String pan_number) {
		this.pan_number = pan_number;
	}

	public double getSaving_amount() {
		return saving_amount;
	}

	public void setSaving_amount(double saving_amount) {
		this.saving_amount = saving_amount;
	}

	public double getFixed_amount() {
		return fixed_amount;
	}

	public void setFixed_amount(double fixed_amount) {
		this.fixed_amount = fixed_amount;
	}

	@Override
	public String toString() {
		return "CustomerAccountDetailsEntity [account_number=" + account_number + ", bank_ifsc=" + bank_ifsc
				+ ", adhar_number=" + adhar_number + ", pan_number=" + pan_number + ", saving_amount=" + saving_amount
				+ ", fixed_amount=" + fixed_amount + "]";
	}
	
}
