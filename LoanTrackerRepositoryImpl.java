package com.example.demo.layer3;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Loan;
import com.example.demo.layer2.LoanTracker;
import com.example.demo.layer2.LoanTrackerNotFoundException;

@Repository
public class LoanTrackerRepositoryImpl extends BaseRepository implements LoanTrackerRepository {

	@Transactional
	public List<LoanTracker> selectLoan(int trackerId, String debtorPhone) throws LoanTrackerNotFoundException {
		// TODO Auto-generated method stub
		EntityManager entityManager=getEntityManager();
		Query query = entityManager.createQuery("select lt from LoanTracker lt where lt.trackerId=:trackerId and lt.debtorPhone=:debtorPhone");
		query.setParameter("trackerId", trackerId);
		query.setParameter("debtorPhone", debtorPhone);
		List<LoanTracker> loan = query.getResultList();
		System.out.println("leng : " + loan.size());
		/*for (LoanTracker lt : loan) {
			System.out.println("loantracker id : "+ lt.getTrackerId());
			System.out.println("applicationId :" + lt.getLoaneees());
			System.out.println("debtorPhone :" + lt.getDebtorPhone());
			System.out.println("verification status :" + lt.getVerificationStatus());
			System.out.println("approval : " + lt.getFinalApproval());
			System.out.println("remark : " + lt.getRemark());
		}*/
		return loan;
	}

	@Transactional
	public List<LoanTracker> selectAllLoan() {
		// TODO Auto-generated method stub
		EntityManager entityManager=getEntityManager();
		Query query = entityManager.createQuery(" from LoanTracker");
		List<LoanTracker> allloan = query.getResultList();
		System.out.println("leng : " + allloan.size());
		return allloan;
	}

}
