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

    // API to get policy details by policy number
    public Policy getPolicyByPolicyNumber(String policyNumber) {
        return policyRepository.findByPolicyNumber(policyNumber);
    }

    // API to get policy details by scheme type
    public List<Policy> getPolicyBySchemeType(String schemeType) {
        return policyRepository.findBySchemeType(schemeType);
    }

    // API to get policy details by mph name
    public List<Policy> getPolicyByMphName(String mphName) {
        return policyRepository.findByMphName(mphName);
    }

    // API to get policy details by mph code
    public List<Policy> getPolicyByMphCode(String mphCode) {
        return policyRepository.findByMphCode(mphCode);
    }

    // API to get policy details by policy status
    public List<Policy> getPolicyByPolicyStatus(String policyStatus) {
        return policyRepository.findByPolicyStatus(policyStatus);
    }
}