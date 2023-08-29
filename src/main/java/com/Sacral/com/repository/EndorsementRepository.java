.

package com.Sacral.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sacral.com.entity.Endorsement;

@Repository
public interface EndorsementRepository extends JpaRepository<Endorsement, Long> {
    
    Endorsement findByMph(String mph);

    Endorsement findByTrust(String trust);

    Endorsement findByCustomer(String customer);

    Endorsement save(Endorsement endorsement);

    Endorsement update(Endorsement endorsement);

}