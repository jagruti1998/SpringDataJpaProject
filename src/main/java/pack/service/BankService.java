package pack.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pack.model.Bank;
import pack.model.Debtor;
import pack.repository.BankRepository;
import pack.repository.DebtorRepository;

@Service
public class BankService {
   
	@Autowired
	BankRepository bankRepository;
	
	@Autowired
	DebtorRepository debtorRepository;
	
	public void save(Bank b) {
		bankRepository.save(b);
	}
	
	public Debtor getDebtor(int id){
	    return debtorRepository.findById(id);	  
	}
	
	public Bank getBank(int id){
	    return bankRepository.findById(id);	  
	}
	public void change(Bank b,Debtor dbt) {
		Date date=new Date();
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String date2=format.format(date);
		dbt.setDate(date2);
		dbt.setStatus("Pending");
		dbt.setReason("Nil");
		bankRepository.save(b);
		debtorRepository.save(dbt);
	}
	public void delete(Bank b){ 
		  bankRepository.delete(b);
	}
}
