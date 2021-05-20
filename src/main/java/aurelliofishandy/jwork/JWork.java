package aurelliofishandy.jwork;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JWork {

    public static void main(String[] args) {
        Location l1= new Location("Jawa Barat", "Bandung", "Bismillah");
        Location l2= new Location("Jawa Tengah", "Semarang", "Bismillah");
        Location l3= new Location("Jawa Timur", "Surabaya", "Bismillah");

        DatabaseRecruiter.addRecruiter(new Recruiter(1,"aurellio","aurelliofishandy@gmail.com","081284475450",l1));
        DatabaseRecruiter.addRecruiter(new Recruiter(2,"fishandy","fishandy@gmail.com","081284475020",l2));
        DatabaseRecruiter.addRecruiter(new Recruiter(3,"hartadi","hartadi@gmail.com","081284205450",l3));

        try{
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Polisi",DatabaseRecruiter.getRecruiterById(1),900000,JobCategory.DataAnalyst));
        }catch(RecruiterNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Polisi",DatabaseRecruiter.getRecruiterById(2),900000,JobCategory.DataAnalyst));
        }catch(RecruiterNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Polisi",DatabaseRecruiter.getRecruiterById(1),900000,JobCategory.UI));
        }catch(RecruiterNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            DatabaseJob.addJob(new Job(DatabaseJob.getLastId()+1, "Polisi",DatabaseRecruiter.getRecruiterById(3),900000,JobCategory.UX));
        }catch(RecruiterNotFoundException e){
            System.out.println(e.getMessage());
        }


        SpringApplication.run(JWork.class, args);
    }

}