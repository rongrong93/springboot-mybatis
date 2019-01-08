package com.lirong.controll;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lirong.pojo.Users;
import com.lirong.service.UserService;

@Controller
public class IndexController {
	
	@Value("${local.username}")
	private String username ;
	@Autowired
	UserService service;
	
	@GetMapping("/indexController")
	public ResponseEntity<String> helloWorld(){
		return ResponseEntity.ok("hello world..." + "username:" + username);
	}
	@RequestMapping("/toIndex")
	public String toIndexPage(){
		System.out.println("toIndexPage...");
		return "index";
	}
	
	@RequestMapping(value="/login",method={RequestMethod.POST,RequestMethod.GET})
	public String loginCheck(HttpServletRequest request, HttpSession session){
		String un = request.getParameter("username");
		String pw = request.getParameter("password");
		List<Users> usersList = service.getUserList();
		for(Users user: usersList){
			System.out.println(user.toString());
		}
		return "index";
	}

}
