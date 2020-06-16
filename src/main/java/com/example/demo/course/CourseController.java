package com.example.demo.course;

import com.example.demo.Topics.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    //    @RequestMapping(path = "/t",produces = "application/json")
    @RequestMapping(method = RequestMethod.GET, value = "/t/{id}/c")
    public List<Course> getAllcourse(@PathVariable String id) {

        return courseService.getAllCourses(id);      //xml format
    }

    @RequestMapping("/t/{tid}/c/{id}")
    public Course getCourse(@PathVariable String id) {

        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/t/{tid}/c/")
    public String addCourse(@RequestBody Course course, @PathVariable int tid) {     //@RequestBody used for raw-JSON insertion
        course.setTopic(new Topic(tid, "", ""));
        courseService.addCourse(course);

        return "Added";
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/t/{tid}/c/{id}")
    public String delCourse(@PathVariable String id) {

        courseService.deleCourse(id);
        return "Deleted";
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/t/{tid}/c/{id}")
    public String updateCourse(@RequestBody Course course, @PathVariable int tid, @PathVariable String id) {
        course.setTopic(new Topic(tid, "", ""));
        courseService.update(course);
        return "Updated";
    }


}