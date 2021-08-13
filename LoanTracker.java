package com.example.demo.layer2;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "LOANTRACKER")
public class LoanTracker {
	/*
	 * 
	 * Application_Id Number(4) Not Null, DEBTOR_PHONE VARCHAR2(13) NOT NULL UNIQUE,
	 * VERIFICATIONSTATUS VARCHAR2(20) Not Null, FinalApproval VARCHAR2(20) Not
	 * Null, Remark VARCHAR2(50), ACCOUNTNUM VARCHAR2(16) UNIQUE, BALANCE
	 * NUMBER(10), CONSTRAINT LOANTRACKER_FOREIGN_KEY FOREIGN KEY (Application_Id)
	 * REFERENCES LOAN (Application_Id)
	 */
	@Id
	@GeneratedValue
	@Column(name = "TRACKERID")
	@PrimaryKeyJoinColumn
	private int trackerId;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "loanTrackers")
	@JoinColumn(name = "APPLICATIONID")
	private Loan loaneees;


	@Column(name = "DEBTORPHONE")
	private String debtorPhone;

	@Column(name = "VERIFICATIONSTATUS")
	private String verificationStatus;

	@Column(name = "FINALAPPROVAL")
	private String finalApproval;

	@Column(name = "REMARK")
	private String remark;

	@Column(name = "ACCOUNTNUM")
	private String accountNum;

	@Column(name = "BALANCE")
	private int balance;
	
	

	public LoanTracker(int trackerId, Loan loaneees, String debtorPhone, String verificationStatus,
			String finalApproval, String remark, String accountNum, int balance) {
		super();
		this.trackerId = trackerId;
		this.loaneees = loaneees;
		this.debtorPhone = debtorPhone;
		this.verificationStatus = verificationStatus;
		this.finalApproval = finalApproval;
		this.remark = remark;
		this.accountNum = accountNum;
		this.balance = balance;
	}

	public LoanTracker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTrackerId() {
		return trackerId;
	}

	public void setTrackerId(int trackerId) {
		this.trackerId = trackerId;
	}
	@JsonIgnore
	public Loan getLoaneees() {
		return loaneees;
	}

	public void setLoaneees(Loan loaneees) {
		this.loaneees = loaneees;
	}

	public String getDebtorPhone() {
		return debtorPhone;
	}

	public void setDebtorPhone(String debtorPhone) {
		this.debtorPhone = debtorPhone;
	}

	public String getVerificationStatus() {
		return verificationStatus;
	}

	public void setVerificationStatus(String verificationStatus) {
		this.verificationStatus = verificationStatus;
	}

	public String getFinalApproval() {
		return finalApproval;
	}

	public void setFinalApproval(String finalApproval) {
		this.finalApproval = finalApproval;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	/*@Override
	public String toString() {
		return "LoanTracker [trackerId=" + trackerId + ", loaneees=" + loaneees + ", debtorPhone=" + debtorPhone
				+ ", verificationStatus=" + verificationStatus + ", finalApproval=" + finalApproval + ", remark="
				+ remark + ", accountNum=" + accountNum + ", balance=" + balance + "]";
	}*/
	
	

}
