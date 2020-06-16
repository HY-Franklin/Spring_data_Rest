package com.example.demo.Topics;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TopicRepository extends JpaRepository<Topic, Integer> {     // Id's datatype

    //getAllTopic(){}
    //getTopic(String id){}
    //updateTopic(Topic t){}
    //deleteTopic(String id){}

}
