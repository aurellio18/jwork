package aurelliofishandy.jwork;

/**
* @author (Aurellio Fishandy)
* @version (TUTAM - 29-Jun-2021)
*/

public enum InvoiceStatus
{
    // Macam macam status Invoice
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