package pack.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pack.model.Debtor;
import pack.service.DebtorService;

@Controller
public class DebtorController {
	
	final static Logger logger = LogManager.getLogger(DebtorController.class);
 
	 @Autowired 
	 DebtorService dd;
	
	
	 @RequestMapping("/pages/debtorform")  
     public String add(Model m)  {
		 logger.info("into adding debtor details");
         m.addAttribute("dbt", new  Debtor());
         return "debtorform";  
     }
	
	
	  @RequestMapping(value = "/pages/addDebtor", method = RequestMethod.POST) 
	  public String addDebtor(Debtor debtor) {
		   dd.save(debtor);
		   logger.info("debtor details added");
		   return "redirect:/pages/bankform?phno="+debtor.getPhno();
	   
	  }
	  
	  @RequestMapping("/pages/editdebtor")  

	    public String edit( @RequestParam("id") int id, Model m){    
		  
		logger.info("into editing debtor details");	
		  
		Debtor dbt=dd.getDebtor(id);
		m.addAttribute("edit",dbt);
			 
			System.out.println("id: "+id);
			return "editdebtor";
	  }
		
		
		@RequestMapping("/pages/updateDebtor")
		public String change(Debtor dbt)
		{
			dd.change(dbt);
			logger.info("debtor details changed");	
			return "view";
			  			 
		}
		
		@RequestMapping("/deletedebtor")
		public String delete(@RequestParam("id") int id){
			Debtor dbt=dd.getDebtor(id);
			dd.delete(dbt);
			logger.info("debtor details deleted");
			return "redirect:/pages/deletebank?id="+id;
		}
}

