package com.Sacral.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Endorsement {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String endorsementNumber;
    
    private String endorsementProcessingDate;
    
    private String endorsementStatus;
    
    public Endorsement() {
        
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getEndorsementNumber() {
        return endorsementNumber;
    }
    
    public void setEndorsementNumber(String endorsementNumber) {
        this.endorsementNumber = endorsementNumber;
    }
    
    public String getEndorsementProcessingDate() {
        return endorsementProcessingDate;
    }
    
    public void setEndorsementProcessingDate(String endorsementProcessingDate) {
        this.endorsementProcessingDate = endorsementProcessingDate;
    }
    
    public String getEndorsementStatus() {
        return endorsementStatus;
    }
    
    public void setEndorsementStatus(String endorsementStatus) {
        this.endorsementStatus = endorsementStatus;
    }
    
}