package com.Sacral.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sacral.com.model.ApprovalAcceptance;

@Repository
public interface ApprovalRepository extends JpaRepository<ApprovalAcceptance, Long> {

    //Get approval by Id
    ApprovalAcceptance findById(Long id);

    //Get all approvals
    List<ApprovalAcceptance> findAll();

    //Save approval
    ApprovalAcceptance save(ApprovalAcceptance approvalAcceptance);

    //Delete approval
    void delete(ApprovalAcceptance approvalAcceptance);

    //Update approval
    ApprovalAcceptance update(ApprovalAcceptance approvalAcceptance);

}