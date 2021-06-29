package aurelliofishandy.jwork;

/**
* @author (Aurellio Fishandy)
* @version (TUTAM - 29-Jun-2021)
*/
public class InvoiceNotFoundException extends Exception {

        private int invoice_error;

        public InvoiceNotFoundException(int invoice_input){
            super("Invoice ID: ");
            invoice_error = invoice_input;
        }

        
        /** 
         * @return String
         */
        @Override
        public String getMessage() {
            return super.getMessage() + invoice_error + "Not Found";
        }



}
