package aurelliofishandy.jwork;
import java.util.ArrayList;
import java.util.concurrent.RecursiveAction;

/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 18-Mar-2021)
*/

public class DatabaseRecruiter
{
    // memasukkan variabel yang digunakan
    private static ArrayList<Recruiter> RECRUITER_DATABASE = new ArrayList<Recruiter>();
    private static int lastId = 0;

    public static ArrayList<Recruiter> getRecruiterDatabase(){
        return RECRUITER_DATABASE;
    }
    public static int getLastId(){
        return lastId;
    }

    public static Recruiter getRecruiterById(int id) throws RecruiterNotFoundException {
        Recruiter temp = null;
        try {
            for (Recruiter recruiter : RECRUITER_DATABASE) {
                if (id == recruiter.getId()) {
                    temp = recruiter;
                }
            }
        }
        catch (Exception x)
        {
            throw new RecruiterNotFoundException(id);
        }
        return temp;
    }
    
    public static boolean addRecruiter(Recruiter recruiter){
        RECRUITER_DATABASE.add(recruiter);
        lastId = recruiter.getId();
        return true;
    }
    
    public static boolean removeRecruiter(int id) throws RecruiterNotFoundException {
        boolean temp = true;
        try
        {
            for (Recruiter recruiter : RECRUITER_DATABASE){
                if (id == recruiter.getId()){
                    RECRUITER_DATABASE.remove(id);
                    temp = true;
                }
            }
        }
        catch (Exception x){
            throw new RecruiterNotFoundException(id);
        }
        return temp;
    }

    
}
