import java.util.GregorianCalendar;
import java.util.Calendar;

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
        //Jobseeker jobSeek1 = new Jobseeker(1 ,"tayo", "tayo@gmail.com", "abcd1234", "10 Maret 2021");
        Bonus bonus1 = new Bonus(1, "astagfirullah", 100, 10, true);
        Bonus bonus2 = new Bonus(2, null, 200, 20, true);
        Job job1 = new Job(1, "Designer",10000, recruite1, JobCategory.UI);
        Job job2 = new Job(2, "Programmer",10000, recruite1, JobCategory.WebDeveloper);
        /**EwalletPayment ewalletpayment2 = new EwalletPayment(2, job1, "3 September 2020", jobSeek1,  InvoiceStatus.Finished, bonus1);
        EwalletPayment ewalletpayment3 = new EwalletPayment(3, job2, "4 September 2020", jobSeek1,  InvoiceStatus.Finished, bonus1); */
                
        Jobseeker jobseeker1 = new Jobseeker(1, "Arel", ".aurellio@gmail.com", "aaa123",new GregorianCalendar(2021, 4, 8));
        BankPayment bank1 = new BankPayment(1, job1, jobseeker1 ,  InvoiceStatus.Finished);
        EwalletPayment ewalletpayment1 = new EwalletPayment(1, job1, jobseeker1 ,  InvoiceStatus.Finished, bonus2);
        
        //BankPayment bank2 = new BankPayment(1, job1, "2 September 2020", jobSeek1,  InvoiceStatus.Finished, 100);

        //Jobseeker jobseeker2 = new Jobseeker(2, "Arel", "aurellio@gmail.com", "Hai123", 2021, 1, 1);
        //Jobseeker jobseeker3 = new Jobseeker(3, "Arel", "aurellio@gmail.com", "hai123");
        
        /**jobseeker1.toString();
        System.out.println(jobseeker1.toString());
        jobseeker2.toString();
        System.out.println(jobseeker2.toString());
        jobseeker3.toString();
        System.out.println(jobseeker3.toString());
        
        jobseeker1.setEmail("aurellio@gmail.com");
        jobseeker1.setPassword("AAh123");
        System.out.println(jobseeker1.toString());*/
        
        Calendar c1 = new GregorianCalendar();
        bank1.setDate(c1);
        ewalletpayment1.setDate(c1);
        bank1.toString();
        System.out.println(bank1.toString());
        ewalletpayment1.toString();
        System.out.println(ewalletpayment1.toString());
    }
}



