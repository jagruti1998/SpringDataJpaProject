package pack.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	/*@RequestMapping("/userlogin")
	public String userlogin() {
		return "userlogin";
	}
	@RequestMapping("/adminlogin")
	public String adminlogin() {
		return "adminlogin";
	}*/
	@RequestMapping("/pages/userpage")
	public String userpage() {
		return "userpage";
	}
	@RequestMapping("/pages/adminpage")
	public String adminpage() {
		return "adminpage";
	}
	@RequestMapping("/pages/view")
	public String view() {
		return "view";
	}
	@RequestMapping("/pages/viewaccount")
	public String viewaccount() {
		return "viewaccount";
	}
	@RequestMapping("/pages/remove")
	public String remove( @RequestParam("id") int id) {
		return "redirect:/deletedebtor?id="+id;
	}
	@RequestMapping("/pages/select")
	public String select() {
		return "authorizepage";
	}
	@RequestMapping("/pages/viewdetails")
	public String viewdetails() {
		return "viewdetails";
	}
	@RequestMapping("/pages/added")
	public String added() {
		return "added";
	}
	
}
