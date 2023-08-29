package com.Sacral.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sacral.com.model.ApprovalAcceptance;
import com.Sacral.com.service.ApprovalService;

@RestController
@RequestMapping("/approval")
public class ApprovalController {

    @Autowired
    ApprovalService approvalService;

    @GetMapping("")
    public List<ApprovalAcceptance> getAll(){
        return approvalService.getAll();
    }

    @GetMapping("/{id}")
    public ApprovalAcceptance getById(@PathVariable Long id){
        return approvalService.getById(id);
    }

    @PostMapping("")
    public ApprovalAcceptance save(@RequestBody ApprovalAcceptance approvalAcceptance){
        return approvalService.save(approvalAcceptance);
    }

    @PutMapping("")
    public ApprovalAcceptance update(@RequestBody ApprovalAcceptance approvalAcceptance){
        return approvalService.update(approvalAcceptance);
    }

    @DeleteMapping("")
    public void delete(@RequestBody ApprovalAcceptance approvalAcceptance){
        approvalService.delete(approvalAcceptance);
    }

    @PostMapping("/approve/{id}")
    public ApprovalAcceptance approve(@PathVariable Long id){
        ApprovalAcceptance approvalAcceptance = approvalService.approve(id);
        approvalService.moveDataToMasterTables(approvalAcceptance);
        return approvalAcceptance;
    }

    @PostMapping("/reject/{id}")
    public ApprovalAcceptance reject(@PathVariable Long id){
        return approvalService.reject(id);
    }

    @PostMapping("/send-to-maker/{id}")
    public ApprovalAcceptance sendToMaker(@PathVariable Long id){
        return approvalService.sendToMaker(id);
    }

}