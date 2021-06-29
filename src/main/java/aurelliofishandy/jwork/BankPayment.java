package aurelliofishandy.jwork;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 29-Jun-2021)
*/
public class BankPayment extends Invoice
{
    // instance variables - replace the example below with your own
    private PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee = 0;

    /**
     * Constructor for objects of class EwalletPayment
     */
    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker)
    {
        super(id,jobs,jobseeker);
        
    }
    
    public BankPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker,int adminFee)
    {
        super(id,jobs,jobseeker);
        this.adminFee = adminFee;
        
    }
    
    
    /** 
     * @return PaymentType
     */
    public PaymentType getPaymentType(){
        return this.PAYMENT_TYPE;
    }
    
    
    /** 
     * @return int
     */
    public int getAdminFee(){
        return this.adminFee;
    }
    
    
    /** 
     * @param adminFee
     */
    public void setAdminFee(int adminFee){
       this.adminFee = adminFee;
    }

    public void setTotalFee() {
        totalFee = 0;
        for (Job j : getJobs())
            totalFee += j.getFee();
        if (adminFee != 0)
            totalFee -= adminFee;
    }
    
    
    /** 
     * @return String
     */
    public String toString(){
        String strDate = "" ;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        Date date = getDate().getTime();
        if (date != null){
        strDate = dateFormat.format(date);
        }
        return  "Id = "  + super.getId() +
                "\nIdJob= "+ super.getJobs()+
                "\nDate = "+ strDate +
                "\nSeeker = "+ super.getJobSeeker().getName() +
                "\nAdmin Fee ="+ adminFee +
                "\nTotal Fee =" + super.totalFee +
                "\nStatus =" + super.getInvoiceStatus().toString() +
                "\nPayment Type = " + PAYMENT_TYPE.toString() ;
            }
    /**@Override
    public void printData()
    {
        System.out.println("==========Invoice==========");
        System.out.println("ID               = "+ super.getId());
        System.out.println("ID Job           = "+ super.getJob().getName());
        System.out.println("Date             = "+ super.getDate());
        System.out.println("Seeker           = "+ super.getJobSeeker().getName());
        System.out.println("Admin Fee        = "+ adminFee);
        System.out.println("Total Fee        = "+ super.totalFee);
        System.out.println("Status           = "+ super.getInvoiceStatus().toString());
        System.out.println("Payment Type     = "+ PAYMENT_TYPE.toString());
    }*/
}
