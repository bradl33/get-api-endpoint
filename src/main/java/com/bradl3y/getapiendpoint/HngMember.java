package com.bradl3y.getapiendpoint;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class HngMember {
    @JsonIgnore //ignore id when serializing to JSON
    private @Id
    @GeneratedValue Long id;
    private String slackUsername;
    private boolean backend;
    private int age;
    private String bio;

    public HngMember() {}

    public HngMember(String slackUsername, boolean backend,
                     int age, String bio) {
        this.slackUsername = slackUsername;
        this.backend = backend;
        this.age = age;
        this.bio = bio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSlackUsername() {
        return slackUsername;
    }

    public void setSlackUsername(String slackUsername) {
        this.slackUsername = slackUsername;
    }

    public boolean isBackend() {
        return backend;
    }

    public void setBackend(boolean backend) {
        this.backend = backend;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "HngMember{" +
                "id=" + id +
                ", slackUsername='" + slackUsername + '\'' +
                ", backend=" + backend +
                ", age=" + age +
                ", bio='" + bio + '\'' +
                '}';
    }
}
