.

package com.Sacral.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sacral.com.entity.Endorsement;
import com.Sacral.com.service.EndorsementService;

@RestController
@RequestMapping("/endorsement")
public class EndorsementController {
	
	@Autowired
    private EndorsementService endorsementService;
	
	@GetMapping("/mph/{mph}")
    public ResponseEntity<Endorsement> findByMph(@PathVariable String mph) {
        Endorsement endorsement = endorsementService.findByMph(mph);
        return ResponseEntity.ok(endorsement);
    }
	
	@GetMapping("/trust/{trust}")
    public ResponseEntity<Endorsement> findByTrust(@PathVariable String trust) {
        Endorsement endorsement = endorsementService.findByTrust(trust);
        return ResponseEntity.ok(endorsement);
    }
	
	@GetMapping("/customer/{customer}")
    public ResponseEntity<Endorsement> findByCustomer(@PathVariable String customer) {
        Endorsement endorsement = endorsementService.findByCustomer(customer);
        return ResponseEntity.ok(endorsement);
    }
	
	@PostMapping
    public ResponseEntity<Endorsement> saveEndorsement(@RequestBody Endorsement endorsement) {
        Endorsement savedEndorsement = endorsementService.saveEndorsement(endorsement);
        return ResponseEntity.ok(savedEndorsement);
    }
	
	@PutMapping
    public ResponseEntity<Endorsement> updateEndorsement(@RequestBody Endorsement endorsement) {
        Endorsement updatedEndorsement = endorsementService.updateEndorsement(endorsement);
        return ResponseEntity.ok(updatedEndorsement);
    }
	
	@GetMapping
    public ResponseEntity<List<Endorsement>> getAllEndorsements() {
        List<Endorsement> endorsements = endorsementService.getAllEndorsements();
        return ResponseEntity.ok(endorsements);
    }
	
	@DeleteMapping("/{id}")
    public void deleteEndorsement(@PathVariable Long id) {
        endorsementService.deleteEndorsement(id);
    }
	
	public void handleEndorsementEffectiveTypes(Endorsement endorsement){
        endorsementService.handleEndorsementEffectiveTypes(endorsement);
    }
}