import java.util.ArrayList;

public class DatabaseInvoice {
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int lastId = 0;

    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Invoice getInvoiceById(int id) throws InvoiceNotFoundException {
        Invoice temp = null;
        try {
            for (Invoice invoice : INVOICE_DATABASE) {
                if (id == invoice.getId()) {
                    temp = invoice;
                }
            }
        }
        catch (Exception x)
        {
            throw new InvoiceNotFoundException(id);
        }
        return temp;
    }

    public static ArrayList<Invoice> getInvoiceByJobseeker(int jobseekerId){
        ArrayList<Invoice> temp = new ArrayList<>();
        for (int i=0; i < INVOICE_DATABASE.size(); i++) {
            if(INVOICE_DATABASE.get(i).getJobSeeker().getId() == jobseekerId){
                temp.add(INVOICE_DATABASE.get(i));
                return temp;
            }
        }
        return null;
    }

    public static boolean addInvoice(Invoice invoice) throws OngoingInvoiceAlreadyExistsException {
        for (Invoice invoce : INVOICE_DATABASE)
        {
            if (invoce.getId() == invoice.getId()) {
                throw new OngoingInvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        lastId = invoice.getId();
        return true;
    }

    public static boolean changeInvoiceStatus(int id, InvoiceStatus invoiceStatus){
        for (int i=0; i < INVOICE_DATABASE.size(); i++) {
            if(INVOICE_DATABASE.get(i).getId() == id) {
                INVOICE_DATABASE.get(i).setInvoiceStatus(invoiceStatus);
                return true;
            }
        }
        return false;
    }

    public static boolean removeInvoice(int id) throws InvoiceNotFoundException {
        boolean temp = true;
        try
        {
            for (Invoice invoice : INVOICE_DATABASE){
                if (id == invoice.getId()){
                    INVOICE_DATABASE.remove(id);
                    temp = true;
                }
            }
        }
        catch (Exception x){
            throw new InvoiceNotFoundException(id);
        }
        return temp;
    }

}