package aurelliofishandy.jwork;
import java.util.ArrayList;

/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 29-Jun-2021)
*/

public class DatabaseInvoice {
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId;

    
    /** 
     * Mengambil Invoice
     * @return ArrayList<Invoice>
     */
    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }

    
    /** 
     * Mengambil id terakhir
     * @return int
     */
    public static int getLastId(){
        return lastId;
    }

    
    /** 
     * Mengambil Invoice dari id
     * @param id
     * @return Invoice
     * @throws InvoiceNotFoundException
     */
    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundException{
        Invoice val = null;
        try
        {
            for (Invoice invc : INVOICE_DATABASE)
            {
                if (id == invc.getId())
                {
                    val = invc;
                }
            }
        }
        catch (Exception error)
        {
            throw new InvoiceNotFoundException(id);
        }
        return val;
    }

    
    /**
     * Mengambil Invoice dari jobseeker 
     * @param jobseekerId
     * @return ArrayList<Invoice>
     */
    public static ArrayList<Invoice> getInvoiceByJobseeker(int jobseekerId){
        ArrayList<Invoice> temp = new ArrayList<>();
        for (int i=0; i < INVOICE_DATABASE.size(); i++) {
            if(INVOICE_DATABASE.get(i).getJobSeeker().getId() == jobseekerId){
                temp.add(INVOICE_DATABASE.get(i));
            }
        }
        return temp.isEmpty() ? null : temp;
    }

    
    /** 
     * Menambah Invoice
     * @param invoice
     * @return boolean
     * @throws OngoingInvoiceAlreadyExistsException
     */
    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException{
        for (Invoice invc : INVOICE_DATABASE)
        {
            if ((invc.getInvoiceStatus() == (InvoiceStatus.OnGoing)))
            {
                throw new OngoingInvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    
    /** 
     * Mengubah invoice status
     * @param id
     * @param invoiceStatus
     * @return boolean
     */
    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus){
        for (int i=0; i < INVOICE_DATABASE.size(); i++) {
            if(INVOICE_DATABASE.get(i).getId() == id) {
                INVOICE_DATABASE.get(i).setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    
    /** 
     * menghapus Invoice
     * @param id
     * @return boolean
     * @throws InvoiceNotFoundException
     */
    public static boolean removeInvoice(int id) throws InvoiceNotFoundException{
        for (Invoice invc : INVOICE_DATABASE)
        {
            if (invc.getId() == id)
            {
                INVOICE_DATABASE.remove(invc);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }

}