package com.Sacral.com.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Sacral.com.model.CommunicationAcceptance;
import com.Sacral.com.service.CommunicationService;

@RestController
public class CommunicationController {

  @Autowired
  private CommunicationService communicationService;

  // APIs to handle communication tasks (SMS, Email, etc.).
  @PostMapping("/sendCommunicationNotification")
  public void sendCommunicationNotification() {
    communicationService.sendCommunicationNotification();
  }

  @PostMapping("/sendCommunication")
  public void sendCommunication() {
    communicationService.sendCommunication();
  }

  // To store communication-related data.
  @PostMapping("/storeCommunicationData")
  public void storeCommunicationData(@RequestBody CommunicationAcceptance communicationAcceptance) {
    communicationService.storeCommunicationData(communicationAcceptance);
  }

  @GetMapping("/getAllCommunicationData")
  public List<CommunicationAcceptance> getAllCommunicationData() {
    return communicationService.getAllCommunicationData();
  }

  @GetMapping("/getCommunicationData/{id}")
  public Optional<CommunicationAcceptance> getCommunicationData(@PathVariable Long id) {
    return communicationService.getCommunicationData(id);
  }

  @PostMapping("/storeCommunicationHistoryLogs/{id}")
  public void storeCommunicationHistoryLogs(@PathVariable Long id) {
    communicationService.storeCommunicationHistoryLogs(id);
  }

  // To trigger communication to the Master Policy Holder.
  @PostMapping("/triggerCommunicationToMasterPolicyHolder")
  public void triggerCommunicationToMasterPolicyHolder() {
    communicationService.triggerCommunicationToMasterPolicyHolder();
  }

}