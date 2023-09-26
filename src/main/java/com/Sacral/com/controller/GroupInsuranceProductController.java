package com.Sacral.com.controller;

import com.Sacral.com.model.GroupInsuranceProduct;
import com.Sacral.com.service.GroupInsuranceProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/group-insurance-products")
public class GroupInsuranceProductController {

    private final GroupInsuranceProductService groupInsuranceProductService;

    @Autowired
    public GroupInsuranceProductController(GroupInsuranceProductService groupInsuranceProductService) {
        this.groupInsuranceProductService = groupInsuranceProductService;
    }

    // Marketing Team
    @GetMapping("/created-by/{createdBy}")
    public List<GroupInsuranceProduct> findByCreatedBy(@PathVariable String createdBy) {
        return groupInsuranceProductService.findByCreatedBy(createdBy);
    }

    // Unit (New Business) Team
    @GetMapping("/unit-code/{unitCode}")
    public List<GroupInsuranceProduct> findByUnitCode(@PathVariable String unitCode) {
        return groupInsuranceProductService.findByUnitCode(unitCode);
    }

    @GetMapping("/underwriting-status/{underwritingStatus}")
    public List<GroupInsuranceProduct> findByUnderwritingStatus(@PathVariable String underwritingStatus) {
        return groupInsuranceProductService.findByUnderwritingStatus(underwritingStatus);
    }

    @GetMapping("/reinsurance-status/{reinsuranceStatus}")
    public List<GroupInsuranceProduct> findByReinsuranceStatus(@PathVariable String reinsuranceStatus) {
        return groupInsuranceProductService.findByReinsuranceStatus(reinsuranceStatus);
    }

    // ZO
    @GetMapping("/underwriting-deviation/{underwritingDeviation}")
    public List<GroupInsuranceProduct> findByUnderwritingDeviation(@PathVariable boolean underwritingDeviation) {
        return groupInsuranceProductService.findByUnderwritingDeviation(underwritingDeviation);
    }

    @GetMapping("/reinsurance-deviation/{reinsuranceDeviation}")
    public List<GroupInsuranceProduct> findByReinsuranceDeviation(@PathVariable boolean reinsuranceDeviation) {
        return groupInsuranceProductService.findByReinsuranceDeviation(reinsuranceDeviation);
    }

    @GetMapping("/statutory-report-approval/{statutoryReportApproval}")
    public List<GroupInsuranceProduct> findByStatutoryReportApproval(@PathVariable boolean statutoryReportApproval) {
        return groupInsuranceProductService.findByStatutoryReportApproval(statutoryReportApproval);
    }

    // CO
    @GetMapping("/approval-decision/{approvalDecision}")
    public List<GroupInsuranceProduct> findByApprovalDecision(@PathVariable boolean approvalDecision) {
        return groupInsuranceProductService.findByApprovalDecision(approvalDecision);
    }

    @GetMapping("/underwriting-pricing-deviation/{underwritingPricingDeviation}")
    public List<GroupInsuranceProduct> findByUnderwritingPricingDeviation(@PathVariable boolean underwritingPricingDeviation) {
        return groupInsuranceProductService.findByUnderwritingPricingDeviation(underwritingPricingDeviation);
    }

    @GetMapping("/delayed-claims-approval/{delayedClaimsApproval}")
    public List<GroupInsuranceProduct> findByDelayedClaimsApproval(@PathVariable boolean delayedClaimsApproval) {
        return groupInsuranceProductService.findByDelayedClaimsApproval(delayedClaimsApproval);
    }

    @GetMapping("/new-product-configuration/{newProductConfiguration}")
    public List<GroupInsuranceProduct> findByNewProductConfiguration(@PathVariable boolean newProductConfiguration) {
        return groupInsuranceProductService.findByNewProductConfiguration(newProductConfiguration);
    }

    @GetMapping("/unit-code-creation/{unitCodeCreation}")
    public List<GroupInsuranceProduct> findByUnitCodeCreation(@PathVariable boolean unitCodeCreation) {
        return groupInsuranceProductService.findByUnitCodeCreation(unitCodeCreation);
    }

    @GetMapping("/scheme-wise-interest-tables/{schemeWiseInterestTables}")
    public List<GroupInsuranceProduct> findBySchemeWiseInterestTables(@PathVariable boolean schemeWiseInterestTables) {
        return groupInsuranceProductService.findBySchemeWiseInterestTables(schemeWiseInterestTables);
    }

    @GetMapping("/premium-rate-tables/{premiumRateTables}")
    public List<GroupInsuranceProduct> findByPremiumRateTables(@PathVariable boolean premiumRateTables) {
        return groupInsuranceProductService.findByPremiumRateTables(premiumRateTables);
    }

    @GetMapping("/centralized-collection/{centralizedCollection}")
    public List<GroupInsuranceProduct> findByCentralizedCollection(@PathVariable boolean centralizedCollection) {
        return groupInsuranceProductService.findByCentralizedCollection(centralizedCollection);
    }

    @GetMapping("/payment-related-activities/{paymentRelatedActivities}")
    public List<GroupInsuranceProduct> findByPaymentRelatedActivities(@PathVariable boolean paymentRelatedActivities) {
        return groupInsuranceProductService.findByPaymentRelatedActivities(paymentRelatedActivities);
    }

    // Actuarial Team
    @GetMapping("/valuations/{valuations}")
    public List<GroupInsuranceProduct> findByValuations(@PathVariable boolean valuations) {
        return groupInsuranceProductService.findByValuations(valuations);
    }

    // Re-insurer
    @GetMapping("/pricing-decisions/{pricingDecisions}")
    public List<GroupInsuranceProduct> findByPricingDecisions(@PathVariable boolean pricingDecisions) {
        return groupInsuranceProductService.findByPricingDecisions(pricingDecisions);
    }

    // Underwriter
    @GetMapping("/underwriting-pricing-decisions/{underwritingPricingDecisions}")
    public List<GroupInsuranceProduct> findByUnderwritingPricingDecisions(@PathVariable boolean underwritingPricingDecisions) {
        return groupInsuranceProductService.findByUnderwritingPricingDecisions(underwritingPricingDecisions);
    }

    @GetMapping("/underwriting-decisions/{underwritingDecisions}")
    public List<GroupInsuranceProduct> findByUnderwritingDecisions(@PathVariable boolean underwritingDecisions) {
        return groupInsuranceProductService.findByUnderwritingDecisions(underwritingDecisions);
    }

    // Master Policy Holder
    @GetMapping("/member-data/{memberData}")
    public List<GroupInsuranceProduct> findByMemberData(@PathVariable String memberData) {
        return groupInsuranceProductService.findByMemberData(memberData);
    }

    @GetMapping("/payments/{payments}")
    public List<GroupInsuranceProduct> findByPayments(@PathVariable boolean payments) {
        return groupInsuranceProductService.findByPayments(payments);
    }

    @GetMapping("/scheme-rules-changes/{schemeRulesChanges}")
    public List<GroupInsuranceProduct> findBySchemeRulesChanges(@PathVariable boolean schemeRulesChanges) {
        return groupInsuranceProductService.findBySchemeRulesChanges(schemeRulesChanges);
    }

    @GetMapping("/consent-for-renewal/{consentForRenewal}")
    public List<GroupInsuranceProduct> findByConsentForRenewal(@PathVariable boolean consentForRenewal) {
        return groupInsuranceProductService.findByConsentForRenewal(consentForRenewal);
    }

    @GetMapping("/member-addition/{memberAddition}")
    public List<GroupInsuranceProduct> findByMemberAddition(@PathVariable boolean memberAddition) {
        return groupInsuranceProductService.findByMemberAddition(memberAddition);
    }

    @GetMapping("/request-for-conversion/{requestForConversion}")
    public List<GroupInsuranceProduct> findByRequestForConversion(@PathVariable boolean requestForConversion) {
        return groupInsuranceProductService.findByRequestForConversion(requestForConversion);
    }

    @GetMapping("/withdrawal/{withdrawal}")
    public List<GroupInsuranceProduct> findByWithdrawal(@PathVariable boolean withdrawal) {
        return groupInsuranceProductService.findByWithdrawal(withdrawal);
    }

    @GetMapping("/surrender/{surrender}")
    public List<GroupInsuranceProduct> findBySurrender(@PathVariable boolean surrender) {
        return groupInsuranceProductService.findBySurrender(surrender);
    }

    @GetMapping("/member-level-payments/{memberLevelPayments}")
    public List<GroupInsuranceProduct> findByMemberLevelPayments(@PathVariable boolean memberLevelPayments) {
        return groupInsuranceProductService.findByMemberLevelPayments(memberLevelPayments);
    }

    @GetMapping("/tds-details/{tdsDetails}")
    public List<GroupInsuranceProduct> findByTdsDetails(@PathVariable boolean tdsDetails) {
        return groupInsuranceProductService.findByTdsDetails(tdsDetails);
    }

    @GetMapping("/gst/{gst}")
    public List<GroupInsuranceProduct> findByGst(@PathVariable boolean gst) {
        return groupInsuranceProductService.findByGst(gst);
    }

    @GetMapping("/valuation-funding/{valuationFunding}")
    public List<GroupInsuranceProduct> findByValuationFunding(@PathVariable boolean valuationFunding) {
        return groupInsuranceProductService.findByValuationFunding(valuationFunding);
    }

    @GetMapping("/non-monetary-services/{nonMonetaryServices}")
    public List<GroupInsuranceProduct> findByNonMonetaryServices(@PathVariable boolean nonMonetaryServices) {
        return groupInsuranceProductService.findByNonMonetaryServices(nonMonetaryServices);
    }

    // Member
    @GetMapping("/claim-form-receipt-acknowledgement/{claimFormReceiptAcknowledgement}")
    public List<GroupInsuranceProduct> findByClaimFormReceiptAcknowledgement(@PathVariable boolean claimFormReceiptAcknowledgement) {
        return groupInsuranceProductService.findByClaimFormReceiptAcknowledgement(claimFormReceiptAcknowledgement);
    }

    // Channel Users (Agents/Intermediaries)
    @GetMapping("/lead-update/{leadUpdate}")
    public List<GroupInsuranceProduct> findByLeadUpdate(@PathVariable String leadUpdate) {
        return groupInsuranceProductService.findByLeadUpdate(leadUpdate);
    }

    @GetMapping("/document-collection/{documentCollection}")
    public List<GroupInsuranceProduct> findByDocumentCollection(@PathVariable boolean documentCollection) {
        return groupInsuranceProductService.findByDocumentCollection(documentCollection);
    }

    @GetMapping("/commission-receipt-acknowledgement/{commissionReceiptAcknowledgement}")
    public List<GroupInsuranceProduct> findByCommissionReceiptAcknowledgement(@PathVariable boolean commissionReceiptAcknowledgement) {
        return groupInsuranceProductService.findByCommissionReceiptAcknowledgement(commissionReceiptAcknowledgement);
    }

    // Custom Queries
    @GetMapping("/created-by-and-unit-code/{createdBy}/{unitCode}")
    public List<GroupInsuranceProduct> findByCreatedByAndUnitCode(@PathVariable String createdBy, @PathVariable String unitCode) {
        return groupInsuranceProductService.findByCreatedByAndUnitCode(createdBy, unitCode);
    }
}