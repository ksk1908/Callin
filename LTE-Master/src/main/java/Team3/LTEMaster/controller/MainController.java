package Team3.LTEMaster.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MainController {
	
	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("title", "3팀 팀프로젝트");
		return "main";
	}
}
