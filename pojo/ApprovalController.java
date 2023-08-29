public class ApprovalController {
    private ApprovalService approvalService;
    private ApprovalRepository approvalRepository;
    
    public Endorsement approveEndorsement(Endorsement endorsement) {
        // update endorsement status
        endorsement.setStatus("Approved");
        // update endorsement comments
        endorsement.setComments("Approved");
        // call approval service to start the approval process
        approvalService.startApprovalProcess(endorsement);
        // store approval-related data
        approvalRepository.storeApprovalData(endorsement);
        // move endorsement data from temp tables to master tables
        moveDataToMasterTables(endorsement);
        return endorsement;
    }
    
    public Endorsement rejectEndorsement(Endorsement endorsement) {
        // update endorsement status
        endorsement.setStatus("Rejected");
        // update endorsement comments
        endorsement.setComments("Rejected");
        // call approval service to start the approval process
        approvalService.startApprovalProcess(endorsement);
        // store approval-related data
        approvalRepository.storeApprovalData(endorsement);
        // move endorsement data from temp tables to master tables
        moveDataToMasterTables(endorsement);
        return endorsement;
    }
    
    private void moveDataToMasterTables(Endorsement endorsement) {
        // code to move data from temp tables to master tables
    }
}

public class ApprovalService {
    public void startApprovalProcess(Endorsement endorsement) {
        // code to start the approval process
    }
}

public class ApprovalRepository {
    public void storeApprovalData(Endorsement endorsement) {
        // code to store approval-related data
    }
}

public class Endorsement {
    private String status;
    private String comments;
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getComments() {
        return comments;
    }
    
    public void setComments(String comments) {
        this.comments = comments;
    }
}