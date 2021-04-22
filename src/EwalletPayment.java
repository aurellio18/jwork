import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
    public EwalletPayment(int id, ArrayList<Job> jobs, Jobseeker jobseeker)
    {
        super(id,jobs,jobseeker);
        
    }
    
    public EwalletPayment(int id, Job job,Jobseeker jobseeker,Bonus bonus)
    {
        super(id,job,jobseeker);
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

    public void setTotalFee() {
        //super.totalFee = getJob().getFee();
        if (bonus != null && bonus.getActive() &&
                getTotalFee() > bonus.getMinTotalFee()) {
            super.totalFee += bonus.getExtraFee();
        }
    }
    
    
    @Override
    public String toString(){
        Date date = getDate().getTime();
        String strDate = "";
        if (date != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            strDate = dateFormat.format(date);
        }
        // Print data secara keseluruhan
        String str =    "====== Ewallet Payment ======" +
                "\nID           : " + getId() +
                "\nJobs         : " + getJobs() +
                "\nDate         : " + strDate +
                "\nSeeker       : " + getJobSeeker().getName();
        // Hanya tampilkan referral code kalau bonusnya aktif atau valid
        if (bonus.getReferralCode() != null &&
                bonus != null && bonus.getActive() &&
                getTotalFee() > bonus.getMinTotalFee()) {
            str += "\nReferral Code: " + bonus.getReferralCode();
        }
        str +=          "\nFee          : " + totalFee +
                "\nStatus       : " + getInvoiceStatus().toString() +
                "\nPayment Type : " + PAYMENT_TYPE.toString();
        return str;
    }

}
