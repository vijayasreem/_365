package com.Sacral.com.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Sacral.com.model.CommunicationAcceptance;
import com.Sacral.com.repository.CommunicationRepository;

@Service
public class CommunicationService {
  
  @Autowired
  private CommunicationRepository communicationRepository;

  // APIs to handle communication tasks (SMS, Email, etc.).
  public void sendCommunicationNotification() {
    // Logic to send communication notifications.
  }

  public void sendCommunication() {
    // Logic to send communication messages.
  }

  // To store communication-related data.
  public void storeCommunicationData(CommunicationAcceptance communicationAcceptance) {
    communicationRepository.save(communicationAcceptance);
  }

  public List<CommunicationAcceptance> getAllCommunicationData() {
    return communicationRepository.findAll();
  }

  public Optional<CommunicationAcceptance> getCommunicationData(Long id) {
    return communicationRepository.findById(id);
  }

  public void storeCommunicationHistoryLogs(Long id) {
    Optional<CommunicationAcceptance> communicationAcceptance = communicationRepository.findById(id);
    if (communicationAcceptance.isPresent()) {
      communicationAcceptance.get().setCommunicationHistoryLogs("Communication Logs");
      communicationRepository.save(communicationAcceptance.get());
    }
  }

  // To trigger communication to the Master Policy Holder.
  public void triggerCommunicationToMasterPolicyHolder() {
    // Logic to trigger communication to the Master Policy Holder.
  }

}