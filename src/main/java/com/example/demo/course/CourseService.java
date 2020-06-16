package com.example.demo.course;

import com.example.demo.Topics.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;


//    private List<Topic> topics=new ArrayList<>(Arrays.asList(
//            new Topic("1","spring","spring details"),
//            new Topic("2","java","java details"),
//            new Topic("3","c++","c++ details"),
//            new Topic("4","json","json details"))
//    );


    public List<Course> getAllCourses(String tid) {
//        return topics;
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(tid)
                .forEach(courses::add);  //add  each topic into List
        return courses;
    }

    public Course getCourse(String id) {
//        return  topics.stream().filter(x->x.getId().equals(id)).findFirst().get();
//        courseRepository.findCourseByName("");
        return courseRepository.findById(id).orElse(new Course());

    }

    public void addCourse(Course course) {
//        topics.add(topic);
        courseRepository.save(course);

    }

    public void deleCourse(String id) {
//        topics.removeIf(x->x.getId().equals(id));
        courseRepository.delete(courseRepository.findById(id).orElse(new Course()));

    }

    public void update(Course course) {
        courseRepository.save(course);
    }
}
