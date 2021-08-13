package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.LoanTracker;
import com.example.demo.layer2.LoanTrackerNotFoundException;
//import com.example.demo.layer2.Student;
//import com.example.demo.layer2.Student;
import com.example.demo.layer3.LoanTrackerRepositoryImpl;
import com.example.demo.layer4.LoanTrackerService;
import com.example.demo.layer4.LoanTrackerServiceImpl;

//import antlr.collections.List;

@SpringBootTest
@Transactional    

class HomeLoanApplicationTests {
	
	@Autowired
	LoanTrackerRepositoryImpl trackerRepo;
	
	@Autowired
	LoanTrackerServiceImpl trackerServiceRepo;

	@Test//1 SELECT LOANTRACKER
	void selectLoantracker() {
		System.out.println("loading one tracker");
		try {
			List<LoanTracker> track = trackerRepo.selectLoan(21,"+917506131167");
			System.out.println("track leng : " + track.size());
			for (LoanTracker lt : track) {
				System.out.println("loantracker id : "+ lt.getTrackerId());
				System.out.println("applicationId :" + lt.getLoaneees());
				System.out.println("debtorPhone :" + lt.getDebtorPhone());
				System.out.println("verification status :" + lt.getVerificationStatus());
				System.out.println("approval : " + lt.getFinalApproval());
				System.out.println("remark : " + lt.getRemark());
				//System.out.println("applicationId :" + lt.getLoaneees());*/
			}
		}catch (LoanTrackerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	@Test//2 SELECT LOANTRACKER via service
	void selectOne() {
		System.out.println("finding one tracker");
		try {
			List<LoanTracker> track = trackerServiceRepo.selectLoanService(21, "+917506131167");
			System.out.println("track leng : " + track.size());
			for (LoanTracker lt : track) {
				System.out.println("loantracker id : "+ lt.getTrackerId());
				System.out.println("applicationId :" + lt.getLoaneees());
				System.out.println("debtorPhone :" + lt.getDebtorPhone());
				System.out.println("verification status :" + lt.getVerificationStatus());
				System.out.println("approval : " + lt.getFinalApproval());
				System.out.println("remark : " + lt.getRemark());
				//System.out.println("applicationId :" + lt.getLoaneees());*/
			}
		}catch (LoanTrackerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
