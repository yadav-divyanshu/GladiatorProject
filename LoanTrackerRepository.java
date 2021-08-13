package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Loan;
import com.example.demo.layer2.LoanTracker;
import com.example.demo.layer2.LoanTrackerNotFoundException;
@Repository
public interface LoanTrackerRepository {
	List<LoanTracker> selectLoan(int trackerId, String debtorPhone) throws LoanTrackerNotFoundException;
	List<LoanTracker> selectAllLoan();
	

}