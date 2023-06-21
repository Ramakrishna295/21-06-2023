package com.nkxgen.spring.jdbc.model;

public class tempRepayment {
	private int loanid;
	private int emi;
	private int interest;
	private int total;
	private int amount;

	public tempRepayment() {

	}

	public int getLoanid() {
		return loanid;
	}

	public void setLoanid(int loanid) {
		this.loanid = loanid;
	}

	public int getEMI() {
		return emi;
	}

	public void setEMI(int emi) {
		this.emi = emi;
	}

	public int getInterest() {
		return interest;
	}

	public void setInterset(int interest) {
		this.interest = interest;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
