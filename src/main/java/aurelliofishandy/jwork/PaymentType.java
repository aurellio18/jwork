package aurelliofishandy.jwork;
/**
* @author (Aurellio Fishandy)
* @version (TUTAM - 29-Jun-2021)
*/

public enum PaymentType
{
    BankPayment("Bank Payment"),
    EwalletPayment("Ewallet Payment");
    
    private String paymentType;
    
    PaymentType(String paymentType){
        this.paymentType = paymentType;
    }
    
    @Override
    public String toString(){
        return paymentType;
    }
    
}