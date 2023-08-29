package com.Sacral.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserStory {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String api;
    private String organizedFormat;
    private String realTime;
    
    public UserStory() {
    }
    
    public UserStory(String api, String organizedFormat, String realTime) {
        this.api = api;
        this.organizedFormat = organizedFormat;
        this.realTime = realTime;
    }
    
    public Long getId() {
        return id;
    }
    
    public String getApi() {
        return api;
    }
    
    public void setApi(String api) {
        this.api = api;
    }
    
    public String getOrganizedFormat() {
        return organizedFormat;
    }
    
    public void setOrganizedFormat(String organizedFormat) {
        this.organizedFormat = organizedFormat;
    }
    
    public String getRealTime() {
        return realTime;
    }
    
    public void setRealTime(String realTime) {
        this.realTime = realTime;
    }
    
    @Override
    public String toString() {
        return "UserStory{" +
                "id=" + id +
                ", api='" + api + '\'' +
                ", organizedFormat='" + organizedFormat + '\'' +
                ", realTime='" + realTime + '\'' +
                '}';
    }
}