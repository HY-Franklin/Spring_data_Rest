package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienController {
    @Autowired
    private AlienRepo alienRepo;

    @RequestMapping("/test")
    public void test() {
        Alien alien = new Alien();
        alien.setAid(11);
        alien.setAname("huanyu");
        alien.setTech("blue");
        alienRepo.save(alien);
        System.out.println("DOne");
    }


}
