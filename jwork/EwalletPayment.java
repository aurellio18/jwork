import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EwalletPayment extends Invoice
{
    // instance variables - replace the example below with your own
    private PaymentType PAYMENT_TYPE = PaymentType.EwalletPayment;
    private Bonus bonus;

    /**
     * Constructor for objects of class EwalletPayment
     */
    public EwalletPayment(int id, Job job,Jobseeker jobseeker, InvoiceStatus invoiceStatus)
    {
        super(id,job,jobseeker,invoiceStatus);
        
    }
    
    public EwalletPayment(int id, Job job,Jobseeker jobseeker, 
    InvoiceStatus invoiceStatus,Bonus bonus)
    {
        super(id,job,jobseeker,invoiceStatus);
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
    public String toString(){
        String strDate = "" ;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = getDate().getTime();
        if (date != null){
        strDate = dateFormat.format(date);
        }
        if(getJob().getFee() != totalFee){
        return  "Id = "  + super.getId() +
                "\nIdJob= "+ super.getJob().getName() +
                "\nDate = "+ strDate +
                "\nSeeker = "+ super.getJobSeeker().getName() +
                "\nFee ="+ super.totalFee +
                "\nBonus =" + bonus.getReferralCode() +
                "\nStatus =" + super.getInvoiceStatus().toString() +
                "\nPayment Type = " + PAYMENT_TYPE.toString() ;
            } else{
        return  "Id = "  + super.getId() +
                "\nIdJob= "+ super.getJob().getName() +
                "\nDate = "+ strDate +
                "\nSeeker = "+ super.getJobSeeker().getName() +
                "\nFee ="+ super.totalFee +
                "\nStatus =" + super.getInvoiceStatus().toString() +
                "\nPayment Type = " + PAYMENT_TYPE.toString(); 
            }
    }
    /**public void printData()
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
    }*/
}
