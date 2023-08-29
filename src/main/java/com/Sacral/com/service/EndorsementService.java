package com.Sacral.com.service;

import com.Sacral.com.model.Endorsement;
import com.Sacral.com.repository.EndorsementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EndorsementService {
    
    @Autowired
    private EndorsementRepository endorsementRepository;
    
    public Endorsement initiateEndorsement(Endorsement endorsement) {
        return endorsementRepository.save(endorsement);
    }
    
    public Endorsement findByEndorsementNumber(String endorsementNumber) {
        return endorsementRepository.findByEndorsementNumber(endorsementNumber);
    }
    
    public Endorsement findByEndorsementProcessingDate(String endorsementProcessingDate) {
        return endorsementRepository.findByEndorsementProcessingDate(endorsementProcessingDate);
    }
    
    public Endorsement findByEndorsementStatus(String endorsementStatus) {
        return endorsementRepository.findByEndorsementStatus(endorsementStatus);
    }
    
    public void delete(Endorsement endorsement) {
        endorsementRepository.delete(endorsement);
    }
    
    public void update(Endorsement endorsement) {
        endorsementRepository.save(endorsement);
    }
}