package aurelliofishandy.jwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 29-Jun-2021)
*/
@SpringBootApplication
public class JWork {


/** 
 * @param args
 */
public static void main(String[] args) {
    Location l1= new Location("Jawa Barat", "Bandung", "Bismillah");

    Recruiter r1 = new Recruiter(1,"aurellio","aurelliofishandy@gmail.com","081284475450",l1);

    try {
            DatabaseJobseeker.addJobseeker(new Jobseeker(1, "Aurellio", "arelfish@gmail.com", "Password123"));
    } catch (EmailAlreadyExistsException e1) {
            e1.printStackTrace();
    }

        DatabaseRecruiter.addRecruiter(r1);

        try{
            DatabaseJob.addJob(new Job(1, "Polisi",DatabaseRecruiter.getRecruiterById(1),900000,JobCategory.DataAnalyst));
        }catch(RecruiterNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            DatabaseJob.addJob(new Job(2, "Tentara",DatabaseRecruiter.getRecruiterById(1),900000,JobCategory.DataAnalyst));
        }catch(RecruiterNotFoundException e){
            System.out.println(e.getMessage());
        }
        SpringApplication.run(JWork.class, args);

}

}