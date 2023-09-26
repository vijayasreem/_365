
package com.Sacral.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class GroupInsuranceProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String createdBy;
    private String unitCode;
    private String underwritingStatus;
    private String reinsuranceStatus;
    private boolean underwritingDeviation;
    private boolean reinsuranceDeviation;
    private boolean statutoryReportApproval;
    private boolean approvalDecision;
    private boolean underwritingPricingDeviation;
    private boolean delayedClaimsApproval;
    private boolean newProductConfiguration;
    private boolean unitCodeCreation;
    private boolean schemeWiseInterestTables;
    private boolean premiumRateTables;
    private boolean centralizedCollection;
    private boolean paymentRelatedActivities;
    private boolean valuations;
    private boolean pricingDecisions;
    private boolean underwritingPricingDecisions;
    private boolean underwritingDecisions;
    private String memberData;
    private boolean payments;
    private boolean schemeRulesChanges;
    private boolean consentForRenewal;
    private boolean memberAddition;
    private boolean requestForConversion;
    private boolean withdrawal;
    private boolean surrender;
    private boolean memberLevelPayments;
    private boolean tdsDetails;
    private boolean gst;
    private boolean valuationFunding;
    private boolean nonMonetaryServices;
    private boolean claimFormReceiptAcknowledgement;
    private String leadUpdate;
    private boolean documentCollection;
    private boolean commissionReceiptAcknowledgement;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getUnderwritingStatus() {
        return underwritingStatus;
    }

    public void setUnderwritingStatus(String underwritingStatus) {
        this.underwritingStatus = underwritingStatus;
    }

    public String getReinsuranceStatus() {
        return reinsuranceStatus;
    }

    public void setReinsuranceStatus(String reinsuranceStatus) {
        this.reinsuranceStatus = reinsuranceStatus;
    }

    public boolean isUnderwritingDeviation() {
        return underwritingDeviation;
    }

    public void setUnderwritingDeviation(boolean underwritingDeviation) {
        this.underwritingDeviation = underwritingDeviation;
    }

    public boolean isReinsuranceDeviation() {
        return reinsuranceDeviation;
    }

    public void setReinsuranceDeviation(boolean reinsuranceDeviation) {
        this.reinsuranceDeviation = reinsuranceDeviation;
    }

    public boolean isStatutoryReportApproval() {
        return statutoryReportApproval;
    }

    public void setStatutoryReportApproval(boolean statutoryReportApproval) {
        this.statutoryReportApproval = statutoryReportApproval;
    }

    public boolean isApprovalDecision() {
        return approvalDecision;
    }

    public void setApprovalDecision(boolean approvalDecision) {
        this.approvalDecision = approvalDecision;
    }

    public boolean isUnderwritingPricingDeviation() {
        return underwritingPricingDeviation;
    }

    public void setUnderwritingPricingDeviation(boolean underwritingPricingDeviation) {
        this.underwritingPricingDeviation = underwritingPricingDeviation;
    }

    public boolean isDelayedClaimsApproval() {
        return delayedClaimsApproval;
    }

    public void setDelayedClaimsApproval(boolean delayedClaimsApproval) {
        this.delayedClaimsApproval = delayedClaimsApproval;
    }

    public boolean isNewProductConfiguration() {
        return newProductConfiguration;
    }

    public void setNewProductConfiguration(boolean newProductConfiguration) {
        this.newProductConfiguration = newProductConfiguration;
    }

    public boolean isUnitCodeCreation() {
        return unitCodeCreation;
    }

    public void setUnitCodeCreation(boolean unitCodeCreation) {
        this.unitCodeCreation = unitCodeCreation;
    }

    public boolean isSchemeWiseInterestTables() {
        return schemeWiseInterestTables;
    }

    public void setSchemeWiseInterestTables(boolean schemeWiseInterestTables) {
        this.schemeWiseInterestTables = schemeWiseInterestTables;
    }

    public boolean isPremiumRateTables() {
        return premiumRateTables;
    }

    public void setPremiumRateTables(boolean premiumRateTables) {
        this.premiumRateTables = premiumRateTables;
    }

    public boolean isCentralizedCollection() {
        return centralizedCollection;
    }

    public void setCentralizedCollection(boolean centralizedCollection) {
        this.centralizedCollection = centralizedCollection;
    }

    public boolean isPaymentRelatedActivities() {
        return paymentRelatedActivities;
    }

    public void setPaymentRelatedActivities(boolean paymentRelatedActivities) {
        this.paymentRelatedActivities = paymentRelatedActivities;
    }

    public boolean isValuations() {
        return valuations;
    }

    public void setValuations(boolean valuations) {
        this.valuations = valuations;
    }

    public boolean isPricingDecisions() {
        return pricingDecisions;
    }

    public void setPricingDecisions(boolean pricingDecisions) {
        this.pricingDecisions = pricingDecisions;
    }

    public boolean isUnderwritingPricingDecisions() {
        return underwritingPricingDecisions;
    }

    public void setUnderwritingPricingDecisions(boolean underwritingPricingDecisions) {
        this.underwritingPricingDecisions = underwritingPricingDecisions;
    }

    public boolean isUnderwritingDecisions() {
        return underwritingDecisions;
    }

    public void setUnderwritingDecisions(boolean underwritingDecisions) {
        this.underwritingDecisions = underwritingDecisions;
    }

    public String getMemberData() {
        return memberData;
    }

    public void setMemberData(String memberData) {
        this.memberData = memberData;
    }

    public boolean isPayments() {
        return payments;
    }

    public void setPayments(boolean payments) {
        this.payments = payments;
    }

    public boolean isSchemeRulesChanges() {
        return schemeRulesChanges;
    }

    public void setSchemeRulesChanges(boolean schemeRulesChanges) {
        this.schemeRulesChanges = schemeRulesChanges;
    }

    public boolean isConsentForRenewal() {
        return consentForRenewal;
    }

    public void setConsentForRenewal(boolean consentForRenewal) {
        this.consentForRenewal = consentForRenewal;
    }

    public boolean isMemberAddition() {
        return memberAddition;
    }

    public void setMemberAddition(boolean memberAddition) {
        this.memberAddition = memberAddition;
    }

    public boolean isRequestForConversion() {
        return requestForConversion;
    }

    public void setRequestForConversion(boolean requestForConversion) {
        this.requestForConversion = requestForConversion;
    }

    public boolean isWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(boolean withdrawal) {
        this.withdrawal = withdrawal;
    }

    public boolean isSurrender() {
        return surrender;
    }

    public void setSurrender(boolean surrender) {
        this.surrender = surrender;
    }

    public boolean isMemberLevelPayments() {
        return memberLevelPayments;
    }

    public void setMemberLevelPayments(boolean memberLevelPayments) {
        this.memberLevelPayments = memberLevelPayments;
    }

    public boolean isTdsDetails() {
        return tdsDetails;
    }

    public void setTdsDetails(boolean tdsDetails) {
        this.tdsDetails = tdsDetails;
    }

    public boolean isGst() {
        return gst;
    }

    public void setGst(boolean gst) {
        this.gst = gst;
    }

    public boolean isValuationFunding() {
        return valuationFunding;
    }

    public void setValuationFunding(boolean valuationFunding) {
        this.valuationFunding = valuationFunding;
    }

    public boolean isNonMonetaryServices() {
        return nonMonetaryServices;
    }

    public void setNonMonetaryServices(boolean nonMonetaryServices) {
        this.nonMonetaryServices = nonMonetaryServices;
    }

    public boolean isClaimFormReceiptAcknowledgement() {
        return claimFormReceiptAcknowledgement;
    }

    public void setClaimFormReceiptAcknowledgement(boolean claimFormReceiptAcknowledgement) {
        this.claimFormReceiptAcknowledgement = claimFormReceiptAcknowledgement;
    }

    public String getLeadUpdate() {
        return leadUpdate;
    }

    public void setLeadUpdate(String leadUpdate) {
        this.leadUpdate = leadUpdate;
    }

    public boolean isDocumentCollection() {
        return documentCollection;
    }

    public void setDocumentCollection(boolean documentCollection) {
        this.documentCollection = documentCollection;
    }

    public boolean isCommissionReceiptAcknowledgement() {
        return commissionReceiptAcknowledgement;
    }

    public void setCommissionReceiptAcknowledgement(boolean commissionReceiptAcknowledgement) {
        this.commissionReceiptAcknowledgement = commissionReceiptAcknowledgement;
    }
}
