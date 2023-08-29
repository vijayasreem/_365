package com.Sacral.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sacral.com.model.UserStory;

@Repository
public interface UserStoryRepository extends JpaRepository<UserStory, Long> {
    
    // Method to fetch user stories from Jira API
    List<UserStory> findByApi(String api);
    
    // Method to display user stories in a readable and organized manner
    List<UserStory> findByOrganizedFormat(String format);
    
    // Method to display user stories in real-time
    List<UserStory> findByRealTime(String time);
    
    // Method to verify user stories have been fetched from Jira API
    List<UserStory> verifyByApi(String api);
    
    // Method to verify user stories are displayed correctly in the front-end application
    List<UserStory> verifyByFrontEnd(String frontEnd);
    
    // Method to verify user stories are displayed in real-time
    List<UserStory> verifyByRealTime(String time);
}