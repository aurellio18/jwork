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
        Job job1 = new Job(1, "polisi", 1, "pekerjaan", recruite1);
        JobSeeker jobSeek1 = new JobSeeker(1 ,"tayo", "tayo@gmail.com", "abcd1234", "10 Maret 2021");
        Invoice invoice1 = new Invoice(1,1,"20 Maret 2021",100000, jobSeek1);
        
        recruite1.setName("Ferlinda");
        
        location1.printData();
        recruite1.printData();
        jobSeek1.printData();
        invoice1.printData();
        job1.printData();
    }
}


