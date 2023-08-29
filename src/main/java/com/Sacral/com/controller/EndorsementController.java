package com.Sacral.com.controller;

import com.Sacral.com.model.Endorsement;
import com.Sacral.com.service.EndorsementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endorsement")
public class EndorsementController {
    
    @Autowired
    private EndorsementService endorsementService;
    
    @PostMapping("/initiate")
    public ResponseEntity<Endorsement> initiateEndorsement(@RequestBody Endorsement endorsement) {
        // Initiate Endorsement logic
        Endorsement response = endorsementService.initiateEndorsement(endorsement);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
    
    @GetMapping("/findByEndorsementNumber")
    public ResponseEntity<Endorsement> findByEndorsementNumber(@RequestParam String endorsementNumber) {
        Endorsement response = endorsementService.findByEndorsementNumber(endorsementNumber);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    
    @GetMapping("/findByEndorsementProcessingDate")
    public ResponseEntity<Endorsement> findByEndorsementProcessingDate(@RequestParam String endorsementProcessingDate) {
        Endorsement response = endorsementService.findByEndorsementProcessingDate(endorsementProcessingDate);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    
    @GetMapping("/findByEndorsementStatus")
    public ResponseEntity<Endorsement> findByEndorsementStatus(@RequestParam String endorsementStatus) {
        Endorsement response = endorsementService.findByEndorsementStatus(endorsementStatus);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete")
    public ResponseEntity<Void> delete(@RequestBody Endorsement endorsement) {
        endorsementService.delete(endorsement);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Endorsement> update(@RequestBody Endorsement endorsement) {
        Endorsement response = endorsementService.update(endorsement);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}