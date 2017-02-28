package com.javastud.springmvcweb;

import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javastud.springmvcweb.dao.UserDao;
import com.javastud.springmvcweb.model.User;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private UserDao userDao;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale) {
		logger.info("Welcome home! The client locale is {}.", locale);
		return "login";
	}
	
	@RequestMapping(value="/profile", method=RequestMethod.POST)
	public String profilePOST(@ModelAttribute User user, Model model, HttpSession session){
		
		// validate use with database
		if(userDao.validateUser(user)){
			
			session.setAttribute("activeUser", user.getUsername());
			session.setMaxInactiveInterval(3*60);
			return "profile";
			
		}else{
			// show error message with login page
			model.addAttribute("loginError", "Sorry User/Password invalid! Please re-login.");
			return "login";
			
		}
		
		//return "";
	}
	
	@RequestMapping(value="/logout" , method = RequestMethod.GET)
	public String logout(HttpSession session){
		session.invalidate();
		return "login";
	}
	
}
