package aurelliofishandy.jwork;
import java.util.ArrayList;

/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 18-Mar-2021)
*/
public class DatabaseJobseeker
{
    // memasukkan variabel yang digunakan
    private static ArrayList<Jobseeker> JOBSEEKER_DATABASE= new ArrayList<Jobseeker>();
    private static int lastId = 0;

    public static ArrayList<Jobseeker> getDatabaseJobseeker(){
        return JOBSEEKER_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Jobseeker getJobseekerById(int id) throws JobSeekerNotFoundException {
        for (Jobseeker js : JOBSEEKER_DATABASE)
            if (id == js.getId())
                return js;
        throw new JobSeekerNotFoundException(id);
    }

    public static boolean addJobseeker(Jobseeker jobseeker) throws EmailAlreadyExistsException {
        for (Jobseeker js : JOBSEEKER_DATABASE)
        {
            if (jobseeker.getEmail() == js.getEmail()) {
                throw new EmailAlreadyExistsException(jobseeker);
            }
        }
        JOBSEEKER_DATABASE.add(jobseeker);
        lastId = jobseeker.getId();
        return true;
    }
    
    public static boolean removeJobseeker(int id) throws JobSeekerNotFoundException {
        boolean temp = true;
        try
        {
            for (Jobseeker jobseeker : JOBSEEKER_DATABASE){
                if (id == jobseeker.getId()){
                    JOBSEEKER_DATABASE.remove(id);
                    temp = true;
                }
            }
        }
        catch (Exception x){
            throw new JobSeekerNotFoundException(id);
        }
        return temp;
    }

    public static Jobseeker getJobSeekerLogin(String email, String password){
        Jobseeker x = null;
        for (Jobseeker js : JOBSEEKER_DATABASE) {
            if (email.equals(js.getEmail()) && password.equals(js.getPassword()))
            {
                x = js;
            }
            else{
                return null;
            }
        }
        return x;
    }

    
}
