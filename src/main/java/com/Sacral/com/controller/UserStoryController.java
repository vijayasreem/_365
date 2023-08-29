package com.Sacral.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Sacral.com.model.UserStory;
import com.Sacral.com.service.UserStoryService;

@RestController
public class UserStoryController {
 
    @Autowired
    private UserStoryService userStoryService;
    
    // Method to fetch user stories from Jira API
    @GetMapping("/userstories/api")
    public List<UserStory> getUserStoriesByApi(@RequestParam String api) {
        return userStoryService.findByApi(api);
    }
    
    // Method to display user stories in a readable and organized manner
    @GetMapping("/userstories/format")
    public List<UserStory> getUserStoriesByOrganizedFormat(@RequestParam String format) {
        return userStoryService.findByOrganizedFormat(format);
    }
    
    // Method to display user stories in real-time
    @GetMapping("/userstories/time")
    public List<UserStory> getUserStoriesByRealTime(@RequestParam String time) {
        return userStoryService.findByRealTime(time);
    }
    
    // Method to verify user stories have been fetched from Jira API
    @GetMapping("/userstories/verify/api")
    public List<UserStory> verifyUserStoriesByApi(@RequestParam String api) {
        return userStoryService.verifyByApi(api);
    }
    
    // Method to verify user stories are displayed correctly in the front-end application
    @GetMapping("/userstories/verify/frontend")
    public List<UserStory> verifyUserStoriesByFrontEnd(@RequestParam String frontEnd) {
        return userStoryService.verifyByFrontEnd(frontEnd);
    }
    
    // Method to verify user stories are displayed in real-time
    @GetMapping("/userstories/verify/time")
    public List<UserStory> verifyUserStoriesByRealTime(@RequestParam String time) {
        return userStoryService.verifyByRealTime(time);
    }
}