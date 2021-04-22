import java.util.ArrayList;

/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 18-Mar-2021)
*/
public class DatabaseJobseeker
{
    // memasukkan variabel yang digunakan
    private static ArrayList<Jobseeker> JOBSEEKER_DATABASE;
    private static int lastId;

    public static ArrayList<Jobseeker> getDatabaseJobseeker(){
        return JOBSEEKER_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }
    public static Jobseeker getJobseekerById(int id){
        for (int i = 0; i < JOBSEEKER_DATABASE.size(); i++){
            if(JOBSEEKER_DATABASE.get(i).getId() == id){
                return JOBSEEKER_DATABASE.get(i);
            }
        }
        return null;
    }

    public static boolean addJobseeker(Jobseeker jobseeker){
        for (Jobseeker js : JOBSEEKER_DATABASE)
        {
            if (js.getId() == jobseeker.getId()) return false;
            if (js.getEmail() == jobseeker.getEmail()) return false;
        }
        JOBSEEKER_DATABASE.add(jobseeker);
        lastId = jobseeker.getId();
        return true;
    }
    
    public static boolean removeJobseeker(int id){
        for (int i = 0; i < JOBSEEKER_DATABASE.size(); i++){
            if (JOBSEEKER_DATABASE.get(i).getId() == id){
                JOBSEEKER_DATABASE.remove(i);
                return true;
            }
        }
        return false;
    }

    
}
