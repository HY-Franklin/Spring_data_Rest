package com.example.demo.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class loginController {

//    @RequestMapping(value = "/login",method = RequestMethod.GET)
//    public ModelAndView getLoginForm(){
//        ModelAndView mv=new ModelAndView("login.html");
//        return mv;
//
//    }

    //checking for login credentials
    @RequestMapping("/login")
    public ModelAndView login(LoginForm loginForm, Model model) {
        ModelAndView mv = new ModelAndView("login.html");
        ModelAndView mv2 = new ModelAndView("homeLogin.html");
        String username = loginForm.getUsername();
        String password = loginForm.getPassword();
        System.out.println(username + " " + password);
        if ("admin".equals(username) && "admin".equals(password)) {
            System.out.println("Match");
            return mv2;
        }
        //if username or password is wrong
//        model.addAttribute("invalid",true);

        return mv;
    }


//    public ModelAndView login(@ModelAttribute("loginForm") LoginForm loginForm, Model model){
//        ModelAndView mv=new ModelAndView("homeLogin.html");
//        String username=loginForm.getUsername();
//        String password=loginForm.getPassword();
//        if ("admin".equals(username)&&"admin".equals(password)){
//            return mv;
//        }
//
//        //if username or password is wrong
//        model.addAttribute("invalid",true);
//        return  mv;
//
//    }


}
