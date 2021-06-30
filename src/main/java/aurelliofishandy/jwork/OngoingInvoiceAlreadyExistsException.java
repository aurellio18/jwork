package aurelliofishandy.jwork;

/**
* @author (Aurellio Fishandy)
* @version (TUTAM - 29-Jun-2021)
*/

// Mengecek apakah invoice sudah pernah register atau belum
public class OngoingInvoiceAlreadyExistsException extends Exception {
    private Invoice invoice_error;

    public OngoingInvoiceAlreadyExistsException(Invoice invoice_input){
        super("Jobseeker Email: ");
        invoice_error = invoice_input;

    }

    
    /** 
     * @return String
     */
    @Override
    public String getMessage(){
        return super.getMessage() + invoice_error.getInvoiceStatus() + "already exists.";
    }
}
