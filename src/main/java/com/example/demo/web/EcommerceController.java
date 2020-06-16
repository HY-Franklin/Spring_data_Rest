package com.example.demo.web;

import com.example.demo.Alien;
import com.example.demo.AlienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class EcommerceController {
    @Autowired
    AlienRepo alienRepo;


    @RequestMapping("/e")   //output list to client
    public ModelAndView MainPage(Model model) {
        ModelAndView mv = new ModelAndView("Email.html");
        List<Alien> aliens = alienRepo.findAll();
        mv.addObject("aliens", aliens);
        return mv;
    }


}
