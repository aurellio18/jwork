/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 18-Mar-2021)
*/

public class JWork
{
    public static void main (String[] args) 
    {
        Location location1 = new Location("Bandung", "Bandung", "Bandung");
        Recruiter recruite1 = new Recruiter(1, "Aurellio", "aurelliofishandy@yahoo.com", "0812883728", location1);
        Jobseeker jobSeek1 = new Jobseeker(1 ,"tayo", "tayo@gmail.com", "abcd1234", "10 Maret 2021");
        Bonus bonus1 = new Bonus(1, "astagfirullah", 100, 10, true);
        Bonus bonus2 = new Bonus(2, null, 200, 20, true);
        Job job1 = new Job(1, "Designer",10000, recruite1, JobCategory.UI);
        Job job2 = new Job(2, "Programmer",10000, recruite1, JobCategory.WebDeveloper);
        /**EwalletPayment ewalletpayment1 = new EwalletPayment(1, job1, "2 September 2020", jobSeek1,  InvoiceStatus.Finished, bonus2);
        EwalletPayment ewalletpayment2 = new EwalletPayment(2, job1, "3 September 2020", jobSeek1,  InvoiceStatus.Finished, bonus1);
        EwalletPayment ewalletpayment3 = new EwalletPayment(3, job2, "4 September 2020", jobSeek1,  InvoiceStatus.Finished, bonus1); */
        
        BankPayment bank1 = new BankPayment(1, job1, "2 September 2020", jobSeek1,  InvoiceStatus.Finished);
        BankPayment bank2 = new BankPayment(1, job1, "2 September 2020", jobSeek1,  InvoiceStatus.Finished, 100);
        
        //Invoice invoice1 = new Invoice(1,job1.getId(),"20 Maret 2021",job1.getFee(), jobSeek1, PaymentType.BankPayment, InvoiceStatus.OnGoing);
        
        /**ewalletpayment1.setTotalFee();
        ewalletpayment2.setTotalFee();
        ewalletpayment3.setTotalFee();
        
        ewalletpayment1.printData();
        ewalletpayment2.printData();
        ewalletpayment3.printData();*/
        
        bank1.setTotalFee();
        bank2.setTotalFee();
        
        bank1.printData();
        bank2.printData();

    }
}



