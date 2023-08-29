package com.Sacral.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Sacral.com.model.Endorsement;

public interface EndorsementRepository extends JpaRepository<Endorsement, Long> {
    
    Endorsement findByEndorsementNumber(String endorsementNumber);
    
    Endorsement findByEndorsementProcessingDate(String endorsementProcessingDate);
    
    Endorsement findByEndorsementStatus(String endorsementStatus);
    
    void save(Endorsement endorsement);
    
    void delete(Endorsement endorsement);
    
    void update(Endorsement endorsement);
    
}