package iss.sa.team2.test2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {
    
    @GetMapping("/login")
    public String showLoginForm() {     
    	return "login";       
    }
   
}
