package com.Sacral.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sacral.com.model.UserStory;
import com.Sacral.com.repository.UserStoryRepository;

@Service
public class UserStoryService {
 
    @Autowired
    private UserStoryRepository userStoryRepository;
    
    // Method to fetch user stories from Jira API
    public List<UserStory> findByApi(String api) {
        return userStoryRepository.findByApi(api);
    }
    
    // Method to display user stories in a readable and organized manner
    public List<UserStory> findByOrganizedFormat(String format) {
        return userStoryRepository.findByOrganizedFormat(format);
    }
    
    // Method to display user stories in real-time
    public List<UserStory> findByRealTime(String time) {
        return userStoryRepository.findByRealTime(time);
    }
    
    // Method to verify user stories have been fetched from Jira API
    public List<UserStory> verifyByApi(String api) {
        return userStoryRepository.verifyByApi(api);
    }
    
    // Method to verify user stories are displayed correctly in the front-end application
    public List<UserStory> verifyByFrontEnd(String frontEnd) {
        return userStoryRepository.verifyByFrontEnd(frontEnd);
    }
    
    // Method to verify user stories are displayed in real-time
    public List<UserStory> verifyByRealTime(String time) {
        return userStoryRepository.verifyByRealTime(time);
    }
}