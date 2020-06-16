package com.example.demo.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {     // Id's datatype

    //getAllTopic(){}
    //getTopic(String id){}
    //updateTopic(Topic t){}
    //deleteTopic(String id){}

    List<Course> findByTopicId(String tid);


//    List<Course> findByDetails(String details);

}
