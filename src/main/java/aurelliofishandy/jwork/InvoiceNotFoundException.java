package aurelliofishandy.jwork;

/**
* @author (Aurellio Fishandy)
* @version (TUTAM - 29-Jun-2021)
*/

// Mengecek apakah invoice yang dimaksud sudah ada pada database atau belum
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
