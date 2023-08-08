package pack.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import pack.model.Debtor;
import pack.service.AdminService;

@Controller
public class AdminController {
	
	final static Logger logger = LogManager.getLogger(AdminController.class);
	
	  @Autowired
      AdminService ad;
	  
	  @RequestMapping("/pages/authorize")  
	     public String authorize(@RequestParam("id") int id)  {
		 logger.info("into authorizing debtor");
		 Debtor dbt=ad.getDebtor(id);
		 ad.authorize(dbt);
		 logger.info("Debtor was updated as authorized");
		 return "adminpage";
			 
	     }
	  
	  @RequestMapping("/pages/reject")  
	     public String reject()  {
		  logger.info("into rejecting debtor");
		     return "reject";
	     }
	  @RequestMapping("/pages/reason")  
	     public String reason(@RequestParam("id") int id,@RequestParam("reason") String reason)  {
		     Debtor dbt=ad.getDebtor(id);
		     ad.reject(dbt,reason);
		     logger.info("Debtor was updated as rejected with reason");
		     return "adminpage";
	     }
}
