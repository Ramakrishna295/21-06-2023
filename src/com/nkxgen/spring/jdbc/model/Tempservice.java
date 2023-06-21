package com.nkxgen.spring.jdbc.model;

public class Tempservice {
	public static EMIpay dotheservice(LoanAccount la) {
		EMIpay customer = new EMIpay();

		customer.setLoanId(la.getLoanId());
		customer.setLoanType(la.getLoanType());
		// customer.setCust_caddress(la.getCustomerId());
		customer.setLoanamount(la.getLoanAmount());
		customer.setInterestRate(la.getInterestRate());
		customer.setNOI(la.getLoanDuration());
		customer.setLoan_pending(la.getdeductionAmt());

		return customer;
	}

}
