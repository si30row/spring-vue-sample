package jp.co.svs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
//	@RequestMapping(path = "/test", method = RequestMethod.GET)
//	public ModelAndView index(ModelAndView mav) {
//		mav.setViewName("test");
//		return mav;
//	}
	
	@RequestMapping("/")
	public String index(ModelAndView mav) {
		//mav.setViewName("test");
		System.out.println("testtest");
		return "index";
	}
}
