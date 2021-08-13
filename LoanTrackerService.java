package com.example.demo.layer4;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.layer2.LoanTracker;
import com.example.demo.layer2.LoanTrackerNotFoundException;
@Service
public interface LoanTrackerService {
	List<LoanTracker> selectLoanService(int trackerId, String debtorPhone) throws LoanTrackerNotFoundException;
	List<LoanTracker> selectAllLoanService();
	
}
