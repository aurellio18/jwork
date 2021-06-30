package aurelliofishandy.jwork;
import java.util.ArrayList;

/**
* @author (Aurellio Fishandy)
* @version (TUTAM - 29-Jun-2021)
*/
public class DatabaseJobseeker
{
    // memasukkan variabel yang digunakan
    private static ArrayList<Jobseeker> JOBSEEKER_DATABASE= new ArrayList<Jobseeker>();
    private static int lastId = 0;

    
    /** 
     * Mengambil jobseeker 
     * @return ArrayList<Jobseeker>
     */
    public static ArrayList<Jobseeker> getDatabaseJobseeker(){
        return JOBSEEKER_DATABASE;
    }

    
    /** 
     * Mengambil  id terakhir
     * @return int
     */
    public static int getLastId(){
        return lastId;
    }

    
    /** 
     * Mengambil jobseeker menggunakan id
     * @param id
     * @return Jobseeker
     * @throws JobSeekerNotFoundException
     */
    public static Jobseeker getJobseekerById(int id) throws JobSeekerNotFoundException {
        for (Jobseeker js : JOBSEEKER_DATABASE)
            if (id == js.getId())
                return js;
        throw new JobSeekerNotFoundException(id);
    }

    
    /** 
     * Menambahkan jobseeker 
     * @param jobseeker
     * @return boolean
     * @throws EmailAlreadyExistsException
     */
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
    
    
    /** 
     * Menghapus jobseeker 
     * @param id
     * @return boolean
     * @throws JobSeekerNotFoundException
     */
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

    
    /** 
     * Mengambil jobseeker agar dapat login
     * @param email
     * @param password
     * @return Jobseeker
     */
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
