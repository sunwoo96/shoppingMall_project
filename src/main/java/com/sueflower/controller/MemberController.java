package com.sueflower.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
    @GetMapping("/")
    public String index(){

        return "index";
    }

    @GetMapping("/login")
    public String loginForm(){
        System.out.println();
        return "login";
    }

    @GetMapping("/register")
    public String registerForm(){
        return "register";
    }


    // Login form with error
    @RequestMapping("/login-error")
    public String loginError(Model model) {
        model.addAttribute("loginError", true);
        return "login";
    }




}
