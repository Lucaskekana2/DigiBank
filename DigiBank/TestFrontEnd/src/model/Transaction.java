package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="transaction")
@SessionScoped 
public class Transaction {
	
	private String name;
	private String sourcePassport;
	private String destinationPassport;
	private String destinationBank;
	private String destinationCountry;
	private long   accountNumber;
	private double amount;
	private long   transactionCode;
	
	public String getName() {
		return name;
	}
	public String getSourcePassport() {
		return sourcePassport;
	}
	public String getDestinationPassport() {
		return destinationPassport;
	}
	public String getDestinationBank() {
		return destinationBank;
	}
	public String getDestinationCountry() {
		return destinationCountry;
	}
	public long getAccountNumber() {
		return accountNumber;
	}
	public double getAmount() {
		return amount;
	}
	public long getTransactionCode() {
		return transactionCode;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSourcePassport(String sourcePassport) {
		this.sourcePassport = sourcePassport;
	}
	public void setDestinationPassport(String destinationPassport) {
		this.destinationPassport = destinationPassport;
	}
	public void setDestinationBank(String destinationBank) {
		this.destinationBank = destinationBank;
	}
	public void setDestinationCountry(String destinationCountry) {
		this.destinationCountry = destinationCountry;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void setTransactionCode(long transactionCode) {
		this.transactionCode = transactionCode;
	}
	
	public TransactionEntity getEntity()
	{
		TransactionEntity transactionentity = new TransactionEntity();
		
		transactionentity.setName(name);
		transactionentity.setSourcePassport(sourcePassport);
		transactionentity.setDestinationPassport(destinationPassport);
		transactionentity.setDestinationBank(destinationBank);
		transactionentity.setDestinationCountry(destinationCountry);
		transactionentity.setAccountNumber(accountNumber);
		transactionentity.setAmount(amount);
		transactionentity.setTransactionCode(transactionCode);
		
		return transactionentity;
	}
		
}
