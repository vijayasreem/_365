package com.Sacral.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sacral.com.model.Policy;
import com.Sacral.com.repository.PolicyRepository;

@Service
public class PolicyService {
    
    @Autowired
    private PolicyRepository policyRepository;
    
    public List<Policy> getPolicyByNumber(String policyNumber) {
        return policyRepository.findByPolicyNumber(policyNumber);
    }
    
    public List<Policy> getPolicyByMphName(String mphName) {
        return policyRepository.findByMphName(mphName);
    }
    
    public List<Policy> getPolicyByMphCode(String mphCode) {
        return policyRepository.findByMphCode(mphCode);
    }
    
    public List<Policy> getPolicyByPolicyStatus(String policyStatus) {
        return policyRepository.findByPolicyStatus(policyStatus);
    }
    
    public List<Policy> getPolicyBySchemeType(String schemeType) {
        return policyRepository.findBySchemeType(schemeType);
    }
    
}