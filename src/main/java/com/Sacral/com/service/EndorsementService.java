.

package com.Sacral.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sacral.com.entity.Endorsement;
import com.Sacral.com.repository.EndorsementRepository;

@Service
public class EndorsementService {
	
    @Autowired
    private EndorsementRepository endorsementRepository;
    
    public Endorsement findByMph(String mph) {
        return endorsementRepository.findByMph(mph);
    }

    public Endorsement findByTrust(String trust) {
        return endorsementRepository.findByTrust(trust);
    }

    public Endorsement findByCustomer(String customer) {
        return endorsementRepository.findByCustomer(customer);
    }
    
    public Endorsement saveEndorsement(Endorsement endorsement) {
        return endorsementRepository.save(endorsement);
    }
    
    public Endorsement updateEndorsement(Endorsement endorsement) {
        return endorsementRepository.update(endorsement);
    }
    
    public List<Endorsement> getAllEndorsements() {
        return endorsementRepository.findAll();
    }
    
    public void deleteEndorsement(Long id) {
        endorsementRepository.deleteById(id);
    }
    
    public void handleEndorsementEffectiveTypes(Endorsement endorsement){
        //business logic for handling different endorsement effective types
    }
    
}