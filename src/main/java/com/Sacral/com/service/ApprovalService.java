package com.Sacral.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sacral.com.model.ApprovalAcceptance;
import com.Sacral.com.repository.ApprovalRepository;

@Service
public class ApprovalService {

    @Autowired
    private ApprovalRepository approvalRepository;

    //Endorsement approval
    public ApprovalAcceptance approve(Long id){
        ApprovalAcceptance approvalAcceptance = approvalRepository.findById(id);
        approvalAcceptance.setStatus("Approved");
        return approvalRepository.save(approvalAcceptance);
    }

    //Endorsement rejection
    public ApprovalAcceptance reject(Long id){
        ApprovalAcceptance approvalAcceptance = approvalRepository.findById(id);
        approvalAcceptance.setStatus("Rejected");
        return approvalRepository.save(approvalAcceptance);
    }

    //Send back to Maker
    public ApprovalAcceptance sendToMaker(Long id){
        ApprovalAcceptance approvalAcceptance = approvalRepository.findById(id);
        approvalAcceptance.setStatus("Sent Back");
        return approvalRepository.save(approvalAcceptance);
    }

    //Get approval by Id
    public ApprovalAcceptance getById(Long id){
        return approvalRepository.findById(id);
    }

    //Get all approvals
    public List<ApprovalAcceptance> getAll(){
        return approvalRepository.findAll();
    }

    //Save approval
    public ApprovalAcceptance save(ApprovalAcceptance approvalAcceptance){
        return approvalRepository.save(approvalAcceptance);
    }

    //Delete approval
    public void delete(ApprovalAcceptance approvalAcceptance){
        approvalRepository.delete(approvalAcceptance);
    }

    //Update approval
    public ApprovalAcceptance update(ApprovalAcceptance approvalAcceptance){
        return approvalRepository.save(approvalAcceptance);
    }

    //Move endorsement data from Temp tables to Master tables
    public void moveDataToMasterTables(ApprovalAcceptance approvalAcceptance){
        //TODO: Code to move endorsement data from Temp tables to Master tables
    }
}