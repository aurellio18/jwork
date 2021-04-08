
public class EwalletPayment extends Invoice
{
    // instance variables - replace the example below with your own
    private PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;

    /**
     * Constructor for objects of class EwalletPayment
     */
    public EwalletPayment(int id, Job job, String date, Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        super(id,job,date,jobseeker,invoiceStatus);
        
    }
    
    public EwalletPayment(int id, Job job, String date, Jobseeker jobseeker, 
    InvoiceStatus invoiceStatus,Bonus bonus)
    {
        super(id,job,date,jobseeker,invoiceStatus);
        this.bonus = bonus;
        
    }
    
    public PaymentType getPaymentType(){
        return this.PAYMENT_TYPE;
    }
    
    public Bonus getBonus(){
        return this.bonus;
    }
    
    public void setBonus(Bonus bonus){
       this.bonus = bonus;
    }
    
    public void setTotalFee(){
        if((bonus != null) && (bonus.getActive() == true) && (getJob().getFee() > getBonus().getMinTotalFee())){
            super.totalFee = (getJob().getFee() + bonus.getExtraFee());
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
        System.out.println("Fee              = "+ super.totalFee);

        if(getJob().getFee() != totalFee){
            System.out.println("Bonus: "+ bonus.getReferralCode());
        }

        System.out.println("Status           = "+ super.getInvoiceStatus().toString());
        System.out.println("Payment Type     = "+ PAYMENT_TYPE.toString());
    }
}
