
public class BankPayment extends Invoice
{
    // instance variables - replace the example below with your own
    private PaymentType PAYMENT_TYPE = PaymentType.BankPayment;
    private int adminFee = 0;

    /**
     * Constructor for objects of class EwalletPayment
     */
    public BankPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        super(id,job,date,jobseeker,invoiceStatus);
        
    }
    
    public BankPayment(int id, Job job, String date, Jobseeker jobseeker, 
    InvoiceStatus invoiceStatus,int adminFee)
    {
        super(id,job,date,jobseeker,invoiceStatus);
        this.adminFee = adminFee;
        
    }
    
    public PaymentType getPaymentType(){
        return this.PAYMENT_TYPE;
    }
    
    public int getAdminFee(){
        return this.adminFee;
    }
    
    public void setAdminFee(int adminFee){
       this.adminFee = adminFee;
    }
    
    public void setTotalFee(){
         
        if (adminFee != 0){
            super.totalFee = getJob().getFee() - adminFee;
        }
        else{
        super.totalFee = getJob().getFee();
    }
    }
    
    @Override
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
    }
}
