package com.example.demo.course;

import com.example.demo.Topics.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Course {
    @Id
    private String id;
    private String name;
    private String details;
    @ManyToOne  //foreign key
    private Topic topic;


    public Course() {
    }

    public Course(String id, String name, String details, int tid) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.topic = new Topic(tid, " ", "");
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }


    @Override
    public String toString() {
        return "course{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}
