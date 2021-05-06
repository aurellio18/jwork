import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Calendar;

/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 18-Mar-2021)
*/

public class JWork {
    public static void main(String[] args) {

        Calendar cal = new GregorianCalendar(2021, 4, 20);
        Location location = new Location("Jakarta", "Jakarta", "mantap");
        {
            Recruiter recruiter = new Recruiter(1, "Arel", "arel@ui.ac.id", "0123456237", location);
            DatabaseRecruiter.addRecruiter(recruiter);
        }


      /*  Jobseeker jobseeker1 = new Jobseeker(1, "Arel", "arel@gmail.com", "Hedsot123mantap", cal);
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

        Job job1 = new Job(1, "Duelist", DatabaseRecruiter.getRecruiterById(1), 2, JobCategory.UX);
        Job job2 = new Job(2, "Controller", DatabaseRecruiter.getRecruiterById(1), 1000, JobCategory.WebDeveloper);
        Job job3 = new Job(3, "AREL", DatabaseRecruiter.getRecruiterById(1), 30000, JobCategory.UX);
        DatabaseJob.addJob(job1);
        DatabaseJob.addJob(job2);
        DatabaseJob.addJob(job3);

        {
            ArrayList<Job> jobtest = DatabaseJob.getJobByCategory(JobCategory.UX);
            for (Job j : jobtest)
                System.out.println(j.toString());
            ArrayList<Job> jobtest2 = DatabaseJob.getJobByCategory(JobCategory.WebDeveloper);
            for (Job j : jobtest2)
                System.out.println(j.toString());
        }
        //EwalletPayment ewalletpay = new EwalletPayment(4, job, jobseeker1, InvoiceStatus.Finished);
        // BankPayment bankPay = new BankPayment(5, job, jobseeker1, InvoiceStatus.Finished);

        //System.out.println(ewalletpay);
        //System.out.println(bankPay);

        Bonus bonus1 = new Bonus(1, "ko123", 10, 1, false);
        Bonus bonus2 = new Bonus(2, "ko123", 20, 1, true);
        DatabaseBonus.addBonus(bonus1);
        DatabaseBonus.addBonus(bonus2);
        {
            ArrayList<Bonus> bonuss = DatabaseBonus.getBonusDatabase();
            for (Bonus bns : bonuss)
                System.out.println(bns.toString());
        } */

        {
        ArrayList<Jobseeker> list = new ArrayList<Jobseeker>();
        list.add(new Jobseeker(1, "Arel", "arel@ui.ac.id", "Testt123"));
        list.add(new Jobseeker(2, "Gans", "arel@ui.ac.id", "Testt123"));
        list.add(new Jobseeker(3, "BGT", "gans@ui.ac.id", "Test12345"));
        list.add(new Jobseeker(4, "BGT", "bgt@ui.ac.id", "Test12345"));

        for (Jobseeker j : list)
        {
            try {
                DatabaseJobseeker.addJobseeker(j);
            } catch (EmailAlreadyExistsException x) {
                System.out.println(x.getMessage());
            }
        }
    }

    {
        ArrayList<Bonus> list = new ArrayList<Bonus>();
        list.add(new Bonus(1, "#arelgans", 1000, 50000, true));
        list.add(new Bonus(2, "#arelgans", 50000, 10000, true));
        list.add(new Bonus(3, "#arelgansbgt", 10000, 20000, true));
        list.add(new Bonus(4, "#gansbgt", 1000, 20000, true));
        for (Bonus b : list)
        {
            try {
                DatabaseBonus.addBonus(b);
            } catch (ReferralCodeAlreadyExistsException x) {
                System.out.println(x.getMessage());
            }
        }
    }

    {
        try {
            Jobseeker js = DatabaseJobseeker.getJobseekerById(88);
        } catch (JobSeekerNotFoundException x) {
            System.out.println(x.getMessage());
        }

        try {
            Recruiter js = DatabaseRecruiter.getRecruiterById(88);
        } catch (RecruiterNotFoundException x) {
            System.out.println(x.getMessage());
        }

        try {
            Job js = DatabaseJob.getJobById(88);
        } catch (JobNotFoundException x) {
            System.out.println(x.getMessage());
        }

        try {
            Bonus js = DatabaseBonus.getBonusById(88);
        } catch (BonusNotFoundException x) {
            System.out.println(x.getMessage());
        }
    }

    {
        ArrayList<Bonus> listBonus = DatabaseBonus.getBonusDatabase();
        ArrayList<Jobseeker> listJS = DatabaseJobseeker.getDatabaseJobseeker();

        for (Bonus b : listBonus)
            System.out.println(b);

        for (Jobseeker js : listJS)
            System.out.println(js);
    }

    {
        try {

            Jobseeker js1 = DatabaseJobseeker.getJobseekerById(1);
            Jobseeker js2 = DatabaseJobseeker.getJobseekerById(2);
            Jobseeker js3 = DatabaseJobseeker.getJobseekerById(3);

            Location l = new Location("Jakarta", "Jakarta Selatan", "gans");
            Recruiter r = new Recruiter(1, "Aurellio", "aurellio@ui.ac.id", "0812321323", l);
            DatabaseJob.addJob(new Job(1, "UI Designer", r, 120000, JobCategory.UI));

            DatabaseInvoice.addInvoice(new BankPayment(1, DatabaseJob.getJobDatabase(), js1));
            DatabaseInvoice.addInvoice(new BankPayment(2, DatabaseJob.getJobDatabase(), js2));
            DatabaseInvoice.addInvoice(new BankPayment(3, DatabaseJob.getJobDatabase(), js3));

        } catch (JobSeekerNotFoundException x) {
            System.out.print(x.getMessage());
            return;
        }

        Thread myThread = new Thread(new FeeCalculator());
        myThread.start();
    }
        }

    }





