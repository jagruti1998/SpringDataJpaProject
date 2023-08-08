package pack.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pack.model.Bank;
import pack.model.Debtor;
import pack.service.BankService;

@Controller
public class BankController {
	
	final static Logger logger = LogManager.getLogger(BankController.class);
	
	@Autowired 
	BankService bd;


 @RequestMapping("/pages/bankform")  
 public String add(Model m)  {
	 logger.info("into adding bank details");
     m.addAttribute("bk",new Bank());
     return "bankform";  
 }


  @RequestMapping(value = "/pages/addBank") 
  public String addDebtor(Bank bank) {
	 bd.save(bank);
	 logger.info("bank details added");
	 return "review";
  }
  
  @RequestMapping("/pages/editbank")  

  public String edit( @RequestParam("id") int id, Model m){    
	logger.info("into editing bank details");		 
	Bank b=bd.getBank(id);
	m.addAttribute("edit",b);
	System.out.println("id: "+id);
		return "editbank";
}
	
	
	@RequestMapping("/updateBank")
	public String change(Bank b)
	{
		Debtor dbt=bd.getDebtor(b.getId());
		bd.change(b,dbt);
		logger.info("bank details changed");
		return "view";
	}
	@RequestMapping("/pages/deletebank")
	public String delete( @RequestParam("id") int id){
		Bank b=bd.getBank(id);
		    bd.delete(b);
		    logger.info("bank details deleted");
			return "view";
			
	}
}
