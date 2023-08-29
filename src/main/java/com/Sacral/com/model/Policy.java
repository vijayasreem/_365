package com.Sacral.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String policyNumber;
    
    private String mphName;
    
    private String mphCode;
    
    private String policyStatus;
    
    private String schemeType;
    
    // Getters and Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getPolicyNumber() {
        return policyNumber;
    }
    
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
    
    public String getMphName() {
        return mphName;
    }
    
    public void setMphName(String mphName) {
        this.mphName = mphName;
    }
    
    public String getMphCode() {
        return mphCode;
    }
    
    public void setMphCode(String mphCode) {
        this.mphCode = mphCode;
    }
    
    public String getPolicyStatus() {
        return policyStatus;
    }
    
    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
    }
    
    public String getSchemeType() {
        return schemeType;
    }
    
    public void setSchemeType(String schemeType) {
        this.schemeType = schemeType;
    }
}