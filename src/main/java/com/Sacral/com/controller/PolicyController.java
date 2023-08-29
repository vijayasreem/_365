package com.Sacral.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Sacral.com.model.Policy;
import com.Sacral.com.service.PolicyService;

@RestController
@RequestMapping("/policy")
public class PolicyController {
    
    @Autowired
    private PolicyService policyService;
    
    @GetMapping("/search")
    public List<Policy> searchPolicies(@RequestParam(value = "policyNumber", required = false) String policyNumber,
            @RequestParam(value = "mphName", required = false) String mphName,
            @RequestParam(value = "mphCode", required = false) String mphCode,
            @RequestParam(value = "policyStatus", required = false) String policyStatus,
            @RequestParam(value = "schemeType", required = false) String schemeType) {
        
        if (policyNumber != null) {
            return policyService.getPolicyByNumber(policyNumber);
        } else if (mphName != null) {
            return policyService.getPolicyByMphName(mphName);
        } else if (mphCode != null) {
            return policyService.getPolicyByMphCode(mphCode);
        } else if (policyStatus != null) {
            return policyService.getPolicyByPolicyStatus(policyStatus);
        } else if (schemeType != null) {
            return policyService.getPolicyBySchemeType(schemeType);
        } else {
            return null;
        }
    }
}