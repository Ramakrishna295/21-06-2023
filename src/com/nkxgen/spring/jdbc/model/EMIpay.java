package com.nkxgen.spring.jdbc.model;

import java.math.BigDecimal;

public class EMIpay {
	private long loanid;
	private int accountNumber;
	private String accountHolder;
	private String loanType;
	private int loanamount;
	private int NOI;
	private int loan_pending;
	private int remainMonths;
	private int emi;
	private int interest;
	private int total;

	private BigDecimal interestRate;

	public EMIpay() {

	}

	public int getLoanId() {
		return (int) loanid;
	}

	public void setLoanId(long loanid) {
		this.loanid = loanid;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public int getLoanamount() {
		return loanamount;
	}

	public void setLoanamount(int loanamount) {
		this.loanamount = loanamount;
	}

	public int getNOI() {
		return NOI;
	}

	public void setNOI(int NOI) {
		this.NOI = NOI;
	}

	public int getLoan_pending() {
		return loan_pending;
	}

	public void setLoan_pending(int loan_pending) {
		this.loan_pending = loan_pending;
	}

	public int getRemainMonths() {
		return remainMonths;
	}

	public void setRemainMonths(int remainMonths) {
		this.remainMonths = remainMonths;
	}

	public int getEmi() {
		return emi;
	}

	public void setEmi(int emi) {
		this.emi = emi;
	}

	public int getInterest() {
		return interest;
	}

	public void setInterest(int interest) {
		this.interest = interest;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public BigDecimal getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}
}