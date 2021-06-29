package aurelliofishandy.jwork;
import java.util.ArrayList;
import java.util.concurrent.RecursiveAction;

/**
* @author (Aurellio Fishandy)
* @version (TUTAM - 29-Jun-2021)
*/

public class DatabaseRecruiter
{
    // memasukkan variabel yang digunakan
    private static ArrayList<Recruiter> RECRUITER_DATABASE = new ArrayList<Recruiter>();
    private static int lastId = 0;

    
    /** 
     * @return ArrayList<Recruiter>
     */
    public static ArrayList<Recruiter> getRecruiterDatabase(){
        return RECRUITER_DATABASE;
    }
    
    /** 
     * @return int
     */
    public static int getLastId(){
        return lastId;
    }

    
    /** 
     * @param id
     * @return Recruiter
     * @throws RecruiterNotFoundException
     */
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
    
    
    /** 
     * @param recruiter
     * @return boolean
     */
    public static boolean addRecruiter(Recruiter recruiter){
        RECRUITER_DATABASE.add(recruiter);
        lastId = recruiter.getId();
        return true;
    }
    
    
    /** 
     * @param id
     * @return boolean
     * @throws RecruiterNotFoundException
     */
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
