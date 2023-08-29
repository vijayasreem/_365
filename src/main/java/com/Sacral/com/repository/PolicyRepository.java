package com.Sacral.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Sacral.com.model.Policy;

public interface PolicyRepository extends JpaRepository<Policy, Long> {
    
    List<Policy> findByPolicyNumber(String policyNumber);
    
    List<Policy> findByMphName(String mphName);
    
    List<Policy> findByMphCode(String mphCode);
    
    List<Policy> findByPolicyStatus(String policyStatus);
    
    List<Policy> findBySchemeType(String schemeType);

}