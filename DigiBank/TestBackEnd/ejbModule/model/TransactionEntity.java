package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="transaction_tbl")
public class TransactionEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long    transactionCode;
	
	private String name;
	private String sourcePassport;
	private String destinationPassport;
	private String destinationBank;  
	private String destinationCountry;
	private long   accountNumber;
	private double amount;
	
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
	
}
