/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 18-Feb-2021)
*/

public class JWork
{
    public static void main (String[] args) 
    {
        Location location1 = new Location("jkt", "jkt", "jkt");
        Recruiter recruite1 = new Recruiter(1, "", "", "", location1);
        Job job1 = new Job(1, "int", 1, "sad", recruite1);
        JobSeeker jobSeek1 = new JobSeeker(1 ,"a", "a", "a", "a");
        Invoice invoice1 = new Invoice(1,1,"a",1, jobSeek1);
        
        
        location1.setProvince("Jakarta");
        recruite1.setName("Arel");
        job1.setId(1);
        jobSeek1.setName("Fishandy");
        invoice1.setId(1);
        
        location1.printData();
        recruite1.printData();
        jobSeek1.printData();
    }
}


