package aurelliofishandy.jwork;
public enum InvoiceStatus
{
    OnGoing("On Going"),
    Finished("Finished"),
    Cancelled("Cancelled");
    
    private String status;
    
    InvoiceStatus(String status){
        this.status = status;
    }
    
    public String toString(){
        return status;
    }
    
}