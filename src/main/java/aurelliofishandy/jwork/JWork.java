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
    // Membuat Lokasi Recruiter
    Location l1= new Location("Jawa Barat", "Bandung", "Bismillah");
    //Membuat Recruiter
    Recruiter r1 = new Recruiter(1,"aurellio","aurelliofishandy@gmail.com","081284475450",l1);


        DatabaseRecruiter.addRecruiter(r1);
        // Membuat Job yang dapat dipilih
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