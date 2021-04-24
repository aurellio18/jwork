import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Calendar;

/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 18-Mar-2021)
*/

public class JWork
{
    public static void main(String[] args){

        Calendar cal = new GregorianCalendar(2021, 4, 20);
        Location location = new Location("Jakarta", "Jakarta", "mantap");
        {
            Recruiter recruiter = new Recruiter(1, "Arel", "arel@ui.ac.id", "0123456237", location);
            DatabaseRecruiter.addRecruiter(recruiter);
        }


        Jobseeker jobseeker1 = new Jobseeker(1, "Arel", "arel@gmail.com", "Hedsot123mantap", cal);
        Jobseeker jobseeker2 = new Jobseeker(2, "Arel", "arel@gmail.com", "Hedsot123mantap", 2020, 11, 2);
        Jobseeker jobseeker3 = new Jobseeker(3, "Ferlinda", "ferlinda@gmail.com", "Testes123", 2020, 4, 20);
        DatabaseJobseeker.addJobseeker(jobseeker1);
        DatabaseJobseeker.addJobseeker(jobseeker2);
        DatabaseJobseeker.addJobseeker(jobseeker3);

        {
            ArrayList<Jobseeker> jstest = DatabaseJobseeker.getDatabaseJobseeker();
            for (Jobseeker js : jstest)
                System.out.println(js.toString());
        }

        Job job1 = new Job(1, "Duelist", DatabaseRecruiter.getRecruiterById(1), 30000, JobCategory.UX);
        Job job2 = new Job(2, "Controller", DatabaseRecruiter.getRecruiterById(1), 30000, JobCategory.WebDeveloper);
        Job job3 = new Job(3, "AREL", DatabaseRecruiter.getRecruiterById(1), 30000, JobCategory.UX);
        DatabaseJob.addJob(job1);
        DatabaseJob.addJob(job2);
        DatabaseJob.addJob(job3);

        {
            ArrayList<Job> jobtest = DatabaseJob.getJobByCategory(JobCategory.UX);
            for (Job j: jobtest)
                System.out.println(j.toString());
        }
        //EwalletPayment ewalletpay = new EwalletPayment(4, job, jobseeker1, InvoiceStatus.Finished);
        // BankPayment bankPay = new BankPayment(5, job, jobseeker1, InvoiceStatus.Finished);

        //System.out.println(ewalletpay);
        //System.out.println(bankPay);

        Bonus bonus1 = new Bonus(1,"ko123",10,1,false);
        Bonus bonus2 = new Bonus(2,"ko123",20,1,true);
        DatabaseBonus.addBonus(bonus1);
        DatabaseBonus.addBonus(bonus2);
        {
            ArrayList<Bonus> bonuses = DatabaseBonus.getBonusDatabase();
            for (Bonus bns : bonuses)
                System.out.println(bns.toString());
        }

    }
}



