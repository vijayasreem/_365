package com.Sacral.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sacral.com.model.CommunicationAcceptance;

@Repository
public interface CommunicationRepository extends JpaRepository<CommunicationAcceptance, Long> {

  // APIs to handle communication tasks (SMS, Email, etc.).
  void sendCommunicationNotification();
  void sendCommunication();

  // To store communication-related data.
  void storeCommunicationData();
  void storeCommunicationHistoryLogs();

  // To trigger communication to the Master Policy Holder.
  void triggerCommunicationToMasterPolicyHolder();

}