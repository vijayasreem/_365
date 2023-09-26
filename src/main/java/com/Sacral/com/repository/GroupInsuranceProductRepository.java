
package com.Sacral.com.repository;

import com.Sacral.com.model.GroupInsuranceProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GroupInsuranceProductRepository extends JpaRepository<GroupInsuranceProduct, Long> {

    // Marketing Team
    List<GroupInsuranceProduct> findByCreatedBy(String createdBy);

    // Unit (New Business) Team
    List<GroupInsuranceProduct> findByUnitCode(String unitCode);
    List<GroupInsuranceProduct> findByUnderwritingStatus(String underwritingStatus);
    List<GroupInsuranceProduct> findByReinsuranceStatus(String reinsuranceStatus);

    // ZO
    List<GroupInsuranceProduct> findByUnderwritingDeviation(boolean underwritingDeviation);
    List<GroupInsuranceProduct> findByReinsuranceDeviation(boolean reinsuranceDeviation);
    List<GroupInsuranceProduct> findByStatutoryReportApproval(boolean statutoryReportApproval);

    // CO
    List<GroupInsuranceProduct> findByApprovalDecision(boolean approvalDecision);
    List<GroupInsuranceProduct> findByUnderwritingPricingDeviation(boolean underwritingPricingDeviation);
    List<GroupInsuranceProduct> findByDelayedClaimsApproval(boolean delayedClaimsApproval);
    List<GroupInsuranceProduct> findByNewProductConfiguration(boolean newProductConfiguration);
    List<GroupInsuranceProduct> findByUnitCodeCreation(boolean unitCodeCreation);
    List<GroupInsuranceProduct> findBySchemeWiseInterestTables(boolean schemeWiseInterestTables);
    List<GroupInsuranceProduct> findByPremiumRateTables(boolean premiumRateTables);
    List<GroupInsuranceProduct> findByCentralizedCollection(boolean centralizedCollection);
    List<GroupInsuranceProduct> findByPaymentRelatedActivities(boolean paymentRelatedActivities);

    // Actuarial Team
    List<GroupInsuranceProduct> findByValuations(boolean valuations);

    // Re-insurer
    List<GroupInsuranceProduct> findByPricingDecisions(boolean pricingDecisions);

    // Underwriter
    List<GroupInsuranceProduct> findByUnderwritingPricingDecisions(boolean underwritingPricingDecisions);
    List<GroupInsuranceProduct> findByUnderwritingDecisions(boolean underwritingDecisions);

    // Master Policy Holder
    List<GroupInsuranceProduct> findByMemberData(String memberData);
    List<GroupInsuranceProduct> findByPayments(boolean payments);
    List<GroupInsuranceProduct> findBySchemeRulesChanges(boolean schemeRulesChanges);
    List<GroupInsuranceProduct> findByConsentForRenewal(boolean consentForRenewal);
    List<GroupInsuranceProduct> findByMemberAddition(boolean memberAddition);
    List<GroupInsuranceProduct> findByRequestForConversion(boolean requestForConversion);
    List<GroupInsuranceProduct> findByWithdrawal(boolean withdrawal);
    List<GroupInsuranceProduct> findBySurrender(boolean surrender);
    List<GroupInsuranceProduct> findByMemberLevelPayments(boolean memberLevelPayments);
    List<GroupInsuranceProduct> findByTdsDetails(boolean tdsDetails);
    List<GroupInsuranceProduct> findByGst(boolean gst);
    List<GroupInsuranceProduct> findByValuationFunding(boolean valuationFunding);
    List<GroupInsuranceProduct> findByNonMonetaryServices(boolean nonMonetaryServices);

    // Member
    List<GroupInsuranceProduct> findByClaimFormReceiptAcknowledgement(boolean claimFormReceiptAcknowledgement);

    // Channel Users (Agents/Intermediaries)
    List<GroupInsuranceProduct> findByLeadUpdate(String leadUpdate);
    List<GroupInsuranceProduct> findByDocumentCollection(boolean documentCollection);
    List<GroupInsuranceProduct> findByCommissionReceiptAcknowledgement(boolean commissionReceiptAcknowledgement);

    // Custom Queries
    @Query("SELECT g FROM GroupInsuranceProduct g WHERE g.createdBy = ?1 AND g.unitCode = ?2")
    List<GroupInsuranceProduct> findByCreatedByAndUnitCode(String createdBy, String unitCode);
}
