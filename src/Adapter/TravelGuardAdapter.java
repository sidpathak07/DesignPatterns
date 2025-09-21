package Adapter;
import Adapter.external.*;
public class TravelGuardAdapter implements TravelInsuranceAdapter {
    TravelGuardApi travelGuardApi = new TravelGuardApi();
    public void submitClaim(String id, Double amount){
        travelGuardApi.submitClaim(id, amount);
    }
    public String getClaimStatus(String id){
        return travelGuardApi.getClaimStatus(id);
    }
}
