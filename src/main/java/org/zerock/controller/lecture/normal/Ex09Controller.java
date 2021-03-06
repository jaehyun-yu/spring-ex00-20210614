package org.zerock.controller.lecture.normal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.controller.lecture.domain.User;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/ex09/*")
@Log4j
public class Ex09Controller {
	
	@RequestMapping("/sub01")
	public String method01(RedirectAttributes rttr) {
		log.info("ex09, sub01 method");
		
		rttr.addAttribute("name", "jin");
		rttr.addAttribute("id", 300);
		
		return ("redirect:sub02");
	}
	
	@RequestMapping("/sub02")
	public void method02() {
		log.info("ex09, sub02 method");
	}
	
	@RequestMapping("/sub03")
	public String method03(RedirectAttributes rttr) {
		log.info("ex09, sub03 method");
		
		rttr.addAttribute("user", new User());
		
		return "redirect:sub04";
	}
}
