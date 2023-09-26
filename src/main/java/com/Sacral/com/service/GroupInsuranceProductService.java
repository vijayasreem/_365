package com.Sacral.com.service;

import com.Sacral.com.model.GroupInsuranceProduct;
import com.Sacral.com.repository.GroupInsuranceProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupInsuranceProductService {

    private final GroupInsuranceProductRepository groupInsuranceProductRepository;

    @Autowired
    public GroupInsuranceProductService(GroupInsuranceProductRepository groupInsuranceProductRepository) {
        this.groupInsuranceProductRepository = groupInsuranceProductRepository;
    }

    // Marketing Team
    public List<GroupInsuranceProduct> findByCreatedBy(String createdBy) {
        return groupInsuranceProductRepository.findByCreatedBy(createdBy);
    }

    // Unit (New Business) Team
    public List<GroupInsuranceProduct> findByUnitCode(String unitCode) {
        return groupInsuranceProductRepository.findByUnitCode(unitCode);
    }

    public List<GroupInsuranceProduct> findByUnderwritingStatus(String underwritingStatus) {
        return groupInsuranceProductRepository.findByUnderwritingStatus(underwritingStatus);
    }

    public List<GroupInsuranceProduct> findByReinsuranceStatus(String reinsuranceStatus) {
        return groupInsuranceProductRepository.findByReinsuranceStatus(reinsuranceStatus);
    }

    // ZO
    public List<GroupInsuranceProduct> findByUnderwritingDeviation(boolean underwritingDeviation) {
        return groupInsuranceProductRepository.findByUnderwritingDeviation(underwritingDeviation);
    }

    public List<GroupInsuranceProduct> findByReinsuranceDeviation(boolean reinsuranceDeviation) {
        return groupInsuranceProductRepository.findByReinsuranceDeviation(reinsuranceDeviation);
    }

    public List<GroupInsuranceProduct> findByStatutoryReportApproval(boolean statutoryReportApproval) {
        return groupInsuranceProductRepository.findByStatutoryReportApproval(statutoryReportApproval);
    }

    // CO
    public List<GroupInsuranceProduct> findByApprovalDecision(boolean approvalDecision) {
        return groupInsuranceProductRepository.findByApprovalDecision(approvalDecision);
    }

    public List<GroupInsuranceProduct> findByUnderwritingPricingDeviation(boolean underwritingPricingDeviation) {
        return groupInsuranceProductRepository.findByUnderwritingPricingDeviation(underwritingPricingDeviation);
    }

    public List<GroupInsuranceProduct> findByDelayedClaimsApproval(boolean delayedClaimsApproval) {
        return groupInsuranceProductRepository.findByDelayedClaimsApproval(delayedClaimsApproval);
    }

    public List<GroupInsuranceProduct> findByNewProductConfiguration(boolean newProductConfiguration) {
        return groupInsuranceProductRepository.findByNewProductConfiguration(newProductConfiguration);
    }

    public List<GroupInsuranceProduct> findByUnitCodeCreation(boolean unitCodeCreation) {
        return groupInsuranceProductRepository.findByUnitCodeCreation(unitCodeCreation);
    }

    public List<GroupInsuranceProduct> findBySchemeWiseInterestTables(boolean schemeWiseInterestTables) {
        return groupInsuranceProductRepository.findBySchemeWiseInterestTables(schemeWiseInterestTables);
    }

    public List<GroupInsuranceProduct> findByPremiumRateTables(boolean premiumRateTables) {
        return groupInsuranceProductRepository.findByPremiumRateTables(premiumRateTables);
    }

    public List<GroupInsuranceProduct> findByCentralizedCollection(boolean centralizedCollection) {
        return groupInsuranceProductRepository.findByCentralizedCollection(centralizedCollection);
    }

    public List<GroupInsuranceProduct> findByPaymentRelatedActivities(boolean paymentRelatedActivities) {
        return groupInsuranceProductRepository.findByPaymentRelatedActivities(paymentRelatedActivities);
    }

    // Actuarial Team
    public List<GroupInsuranceProduct> findByValuations(boolean valuations) {
        return groupInsuranceProductRepository.findByValuations(valuations);
    }

    // Re-insurer
    public List<GroupInsuranceProduct> findByPricingDecisions(boolean pricingDecisions) {
        return groupInsuranceProductRepository.findByPricingDecisions(pricingDecisions);
    }

    // Underwriter
    public List<GroupInsuranceProduct> findByUnderwritingPricingDecisions(boolean underwritingPricingDecisions) {
        return groupInsuranceProductRepository.findByUnderwritingPricingDecisions(underwritingPricingDecisions);
    }

    public List<GroupInsuranceProduct> findByUnderwritingDecisions(boolean underwritingDecisions) {
        return groupInsuranceProductRepository.findByUnderwritingDecisions(underwritingDecisions);
    }

    // Master Policy Holder
    public List<GroupInsuranceProduct> findByMemberData(String memberData) {
        return groupInsuranceProductRepository.findByMemberData(memberData);
    }

    public List<GroupInsuranceProduct> findByPayments(boolean payments) {
        return groupInsuranceProductRepository.findByPayments(payments);
    }

    public List<GroupInsuranceProduct> findBySchemeRulesChanges(boolean schemeRulesChanges) {
        return groupInsuranceProductRepository.findBySchemeRulesChanges(schemeRulesChanges);
    }

    public List<GroupInsuranceProduct> findByConsentForRenewal(boolean consentForRenewal) {
        return groupInsuranceProductRepository.findByConsentForRenewal(consentForRenewal);
    }

    public List<GroupInsuranceProduct> findByMemberAddition(boolean memberAddition) {
        return groupInsuranceProductRepository.findByMemberAddition(memberAddition);
    }

    public List<GroupInsuranceProduct> findByRequestForConversion(boolean requestForConversion) {
        return groupInsuranceProductRepository.findByRequestForConversion(requestForConversion);
    }

    public List<GroupInsuranceProduct> findByWithdrawal(boolean withdrawal) {
        return groupInsuranceProductRepository.findByWithdrawal(withdrawal);
    }

    public List<GroupInsuranceProduct> findBySurrender(boolean surrender) {
        return groupInsuranceProductRepository.findBySurrender(surrender);
    }

    public List<GroupInsuranceProduct> findByMemberLevelPayments(boolean memberLevelPayments) {
        return groupInsuranceProductRepository.findByMemberLevelPayments(memberLevelPayments);
    }

    public List<GroupInsuranceProduct> findByTdsDetails(boolean tdsDetails) {
        return groupInsuranceProductRepository.findByTdsDetails(tdsDetails);
    }

    public List<GroupInsuranceProduct> findByGst(boolean gst) {
        return groupInsuranceProductRepository.findByGst(gst);
    }

    public List<GroupInsuranceProduct> findByValuationFunding(boolean valuationFunding) {
        return groupInsuranceProductRepository.findByValuationFunding(valuationFunding);
    }

    public List<GroupInsuranceProduct> findByNonMonetaryServices(boolean nonMonetaryServices) {
        return groupInsuranceProductRepository.findByNonMonetaryServices(nonMonetaryServices);
    }

    // Member
    public List<GroupInsuranceProduct> findByClaimFormReceiptAcknowledgement(boolean claimFormReceiptAcknowledgement) {
        return groupInsuranceProductRepository.findByClaimFormReceiptAcknowledgement(claimFormReceiptAcknowledgement);
    }

    // Channel Users (Agents/Intermediaries)
    public List<GroupInsuranceProduct> findByLeadUpdate(String leadUpdate) {
        return groupInsuranceProductRepository.findByLeadUpdate(leadUpdate);
    }

    public List<GroupInsuranceProduct> findByDocumentCollection(boolean documentCollection) {
        return groupInsuranceProductRepository.findByDocumentCollection(documentCollection);
    }

    public List<GroupInsuranceProduct> findByCommissionReceiptAcknowledgement(boolean commissionReceiptAcknowledgement) {
        return groupInsuranceProductRepository.findByCommissionReceiptAcknowledgement(commissionReceiptAcknowledgement);
    }

    // Custom Queries
    public List<GroupInsuranceProduct> findByCreatedByAndUnitCode(String createdBy, String unitCode) {
        return groupInsuranceProductRepository.findByCreatedByAndUnitCode(createdBy, unitCode);
    }
}