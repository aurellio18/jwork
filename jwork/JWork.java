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
        Job job1 = new Job(1, "Designer",10000, recruite1, JobCategory.UI);
        Jobseeker jobSeek1 = new Jobseeker(1 ,"tayo", "tayo@gmail.com", "abcd1234", "10 Maret 2021");
        Invoice invoice1 = new Invoice(1,1,"20 Maret 2021",100000, jobSeek1);
        
        //System.out.println("Perekrut :" + recruite1.getName() );
        //recruite1.setName("Ferlinda");
        //System.out.println("Perekrut :" + recruite1.getName() );
        job1.printData();
        //System.out.println(PaymentType.BankPayment);

    }
}



