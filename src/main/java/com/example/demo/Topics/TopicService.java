package com.example.demo.Topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.PipedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;


//    private List<Topic> topics=new ArrayList<>(Arrays.asList(
//            new Topic("1","spring","spring details"),
//            new Topic("2","java","java details"),
//            new Topic("3","c++","c++ details"),
//            new Topic("4","json","json details"))
//    );


    public List<Topic> getAllTopics() {
//        return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll()
                .forEach(topics::add);  //add each topic into List
        return topics;
    }

    public Topic getTopic(int id) {
//        return  topics.stream().filter(x->x.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id).orElse(new Topic());

    }

    public void addTopic(Topic topic) {
//        topics.add(topic);
        topicRepository.save(topic);

    }

    public void deleTopic(int id) {
//        topics.removeIf(x->x.getId().equals(id));
        topicRepository.delete(topicRepository.findById(id).orElse(new Topic()));

    }

    public void update(String id, Topic topic) {
        topicRepository.save(topic);
    }
}
