package com.nkxgen.spring.jdbc.model;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class TransactionsDAO implements TransactionsInterface {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void moneyDeposit(transactioninfo trans) {
		System.out.println("got into the moneydeposit function");
		TempAccounts account = entityManager.find(TempAccounts.class, trans.getAccountNumber());
		int balance = (int) (account.getBalance() + trans.getAmount());
		account.setBalance(balance);
	}

	@Override
	public void moneyWithdrawl(transactioninfo trans) {
		TempAccounts account = entityManager.find(TempAccounts.class, trans.getAccountNumber());
		if (account.getBalance() >= trans.getAmount()) {
			int balance = (int) (account.getBalance() - trans.getAmount());
			account.setBalance(balance);
		} else {
			System.out.println("no sufficient balance");
		}
	}

	@Override
	public void loanRepayment(tempRepayment trans) {
		LoanAccount account = entityManager.find(LoanAccount.class, trans.getLoanid());
		if (trans.getAmount() >= trans.getTotal()) {
			// update due balance

			int temp = (int) (account.getLoanAmount() / 2);
			account.setdeductionAmt(temp);
		} else {
			System.out.println("Entered Low amount");
		}

	}

	@Override
	public void loanWithdrawl(long id) {
		LoanAccount account = entityManager.find(LoanAccount.class, id);
		System.out.println("the value of loan amount in tdao is" + account.getLoanAmount());
		account.setdeductionAmt(account.getLoanAmount());
	}

	public TempAccounts getAccountById(int id) {
		System.out.println("trasnactions loki vachanu");
		TempAccounts account = entityManager.find(TempAccounts.class, id);
		return account;

	}

	public LoanAccount getLoanAccountById(long id) {
		LoanAccount account = entityManager.find(LoanAccount.class, id);
		return account;

	}

}