package com.example.demo.web;

import com.example.demo.Alien;
import com.example.demo.AlienRepo;
import com.example.demo.Topics.Topic;
import com.example.demo.Topics.TopicRepository;
import com.example.demo.course.Course;
import com.example.demo.course.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class webController {

    @Autowired
    private TopicRepository topicRepository;

    @RequestMapping("/web")
    public ModelAndView web() {
        ModelAndView mv = new ModelAndView("main.html");
        return mv;
    }

    @RequestMapping(path = "/at")
    public ModelAndView addCourse(Topic topic) {
        topicRepository.save(topic);
        ModelAndView mv = new ModelAndView("addtopic.html");
        return mv;
    }

    @RequestMapping("/getcourse")
    public ModelAndView searchCourse(@RequestParam int id) {

        Topic topic = topicRepository.findById(id).orElse(new Topic());
        System.out.println(topic.getName());
        ModelAndView mv = new ModelAndView("show.jsp");
        mv.addObject(topic);

        return mv;
    }

}
