package com.hss.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hss.entity.User;
import com.hss.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private IUserService userService;

//	@ResponseBody
	@RequestMapping("userShow")
	public String toIndex(HttpServletRequest request, Model model) {
		User user = userService.queryUser("张翠山");
		model.addAttribute("user", user);
		return "showUser";
	}

	@RequestMapping("test")
	public String test(HttpServletRequest request, Model model) {
//		User user = userService.queryUser("张翠山");
//		model.addAttribute("user", user);
		return "test";
	}

}
