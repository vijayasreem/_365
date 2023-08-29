package com.Sacral.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Sacral.com.model.Policy;

public interface PolicyRepository extends JpaRepository<Policy, Integer> {

    // API to get policy details by policy number
    Policy findByPolicyNumber(String policyNumber);

    // API to get policy details by scheme type
    List<Policy> findBySchemeType(String schemeType);

    // API to get policy details by mph name
    List<Policy> findByMphName(String mphName);

    // API to get policy details by mph code
    List<Policy> findByMphCode(String mphCode);

    // API to get policy details by policy status
    List<Policy> findByPolicyStatus(String policyStatus);
}