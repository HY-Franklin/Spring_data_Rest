package com.example.demo.Topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class TopicController {

    @Autowired
    private TopicService topicService;

    //    @RequestMapping(path = "/t",produces = "application/json")
    @RequestMapping(method = RequestMethod.GET, value = "/t", produces = "application/json")
    public List<Topic> getAlltopics() {

        return topicService.getAllTopics();      //xml format
    }

    @RequestMapping("/t/{id}")
    public Topic getTopic(@PathVariable int id) {
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/t")
    public void addTopic(@RequestBody Topic topic) {     //@RequestBody used for raw-JSON insertion
        topicService.addTopic(topic);

        System.out.println("add");
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/t/{id}")
    public String delTopic(@PathVariable int id) {

        topicService.deleTopic(id);
        return "Deleted";
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/t/{id}")
    public String updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.update(id, topic);
        return "Updated";
    }


}