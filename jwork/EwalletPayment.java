
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
        super(id,job,date,0,jobseeker,null,invoiceStatus);
        
    }
    
    public EwalletPayment(int id, Job job, String date, Jobseeker jobseeker, 
    InvoiceStatus invoiceStatus,Bonus bonus)
    {
        super(id,job,date,0,jobseeker,null,invoiceStatus);
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
         
        if (bonus != null && bonus.getActive() == true && 
        getTotalFee() > bonus.getMinTotalFee()){
            super.totalFee = super.totalFee + bonus.getExtraFee();
        }
        else{
        super.totalFee = totalFee;
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

        if (bonus != null && bonus.getActive() && super.totalFee > bonus.getMinTotalFee() && bonus.getReferralCode() != null) {
            System.out.println("Referral Code    = "+ bonus.getReferralCode());
        }

        System.out.println("Status           = "+ super.getInvoiceStatus().toString());
        System.out.println("Payment Type     = "+ PAYMENT_TYPE.toString());
    }
}
