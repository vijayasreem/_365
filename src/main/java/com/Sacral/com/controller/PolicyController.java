package com.Sacral.com.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Sacral.com.model.Policy;
import com.Sacral.com.service.PolicyService;

@RestController
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    // API to get policy details by policy number
    @GetMapping("/policy/byPolicyNumber")
    public ResponseEntity<List<Policy>> getPolicyByPolicyNumber(@RequestParam String policyNumber) {
        List<Policy> policies = policyService.getPolicyByPolicyNumber(policyNumber);
        if (policies.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(policies, HttpStatus.OK);
    }

    // API to get policy details by scheme type
    @GetMapping("/policy/bySchemeType")
    public ResponseEntity<List<Policy>> getPolicyBySchemeType(@RequestParam String schemeType) {
        List<Policy> policies = policyService.getPolicyBySchemeType(schemeType);
        if (policies.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(policies, HttpStatus.OK);
    }

    // API to get policy details by mph name
    @GetMapping("/policy/byMphName")
    public ResponseEntity<List<Policy>> getPolicyByMphName(@RequestParam String mphName) {
        List<Policy> policies = policyService.getPolicyByMphName(mphName);
        if (policies.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(policies, HttpStatus.OK);
    }

    // API to get policy details by mph code
    @GetMapping("/policy/byMphCode")
    public ResponseEntity<List<Policy>> getPolicyByMphCode(@RequestParam String mphCode) {
        List<Policy> policies = policyService.getPolicyByMphCode(mphCode);
        if (policies.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(policies, HttpStatus.OK);
    }

    // API to get policy details by policy status
    @GetMapping("/policy/byPolicyStatus")
    public ResponseEntity<List<Policy>> getPolicyByPolicyStatus(@RequestParam String policyStatus) {
        List<Policy> policies = policyService.getPolicyByPolicyStatus(policyStatus);
        if (policies.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(policies, HttpStatus.OK);
    }

}