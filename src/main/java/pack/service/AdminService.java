package pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pack.model.Debtor;
import pack.repository.DebtorRepository;

@Service
public class AdminService {
	@Autowired
	DebtorRepository debtorRepository;
	
	public void authorize(Debtor dbt) {
		 dbt.setStatus("Authorized");
		 dbt.setReason("Nil");
		debtorRepository.save(dbt);
	}
	public Debtor getDebtor(int id){
	    return debtorRepository.findById(id);	  
	}
	public void reject(Debtor dbt,String reason) {
		dbt.setStatus("Rejected");
		dbt.setReason(reason);
	    debtorRepository.save(dbt);
	}
}
