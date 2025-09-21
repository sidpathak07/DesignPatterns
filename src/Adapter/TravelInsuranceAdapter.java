package Adapter;

public interface TravelInsuranceAdapter {
    public void submitClaim(String id, Double amount);
    public String getClaimStatus(String id);
}
