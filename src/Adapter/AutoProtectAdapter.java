package Adapter;
import Adapter.external.*;
public class AutoProtectAdapter implements TravelInsuranceAdapter {
    AutoProtectApi autoProtectApi = new AutoProtectApi();
    public void submitClaim(String id, Double amount){
        autoProtectApi.addClaim(amount);
    }
    public String getClaimStatus(String id){
        return to(autoProtectApi.getStatus(id));
    }
    private String to(AutoProtectStatus status){
        String str="";
        if(status==AutoProtectStatus.APPROVED){
            str = "APPROVED";
        }else if(status==AutoProtectStatus.DENIED){
            str = "DENIED";
        }else if(status==AutoProtectStatus.PENDING){
            str = "PENDING";
        }
        return str;
    }
}
