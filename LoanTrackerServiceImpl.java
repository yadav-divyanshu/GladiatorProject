package com.example.demo.layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.layer2.LoanTracker;
import com.example.demo.layer2.LoanTrackerNotFoundException;
import com.example.demo.layer3.LoanTrackerRepositoryImpl;
@Service
public class LoanTrackerServiceImpl implements LoanTrackerService {
	
	@Autowired
	LoanTrackerRepositoryImpl loanTrackerRepo;

	@Override
	public List<LoanTracker> selectLoanService(int trackerId, String debtorPhone) throws LoanTrackerNotFoundException {
		// TODO Auto-generated method stub
		return loanTrackerRepo.selectLoan(trackerId, debtorPhone);
	}

	@Override
	public List<LoanTracker>selectAllLoanService(){
		// TODO Auto-generated method stub
		return loanTrackerRepo.selectAllLoan();
	}

}
