package aurelliofishandy.jwork;
import java.util.ArrayList;

/**
* @author (Aurellio Fishandy)
* @version (TUTAM - 29-Jun-2021)
*/
public class DatabaseJob
{

    // memasukkan variabel yang digunakan
    private static ArrayList<Job> JOB_DATABASE= new ArrayList<Job>();
    private static int lastId = 0;

    
    /** 
     * @return ArrayList<Job>
     */
    public static ArrayList<Job> getJobDatabase(){
        return JOB_DATABASE;
    }

    
    /** 
     * @return int
     */
    public static int getLastId(){
        return lastId;
    }

    
    /** 
     * @param id
     * @return Job
     * @throws JobNotFoundException
     */
    public static Job getJobById(int id) throws JobNotFoundException{
        for (Job job : JOB_DATABASE) {
            if (id == job.getId()) {
                return job;
            }
        }
        throw new JobNotFoundException(id);
    }

    
    /** 
     * @param recruiterId
     * @return ArrayList<Job>
     */
    public static ArrayList<Job> getJobByRecruiter(int recruiterId){
        ArrayList<Job> temp = new ArrayList<>();
        for (int i = 0; i < JOB_DATABASE.size(); i++){
            if(JOB_DATABASE.get(i).getRecruiter().getId() == recruiterId){
                temp.add(JOB_DATABASE.get(i));
                return temp;
            }
        }
        return null;
    }

    
    /** 
     * @param category
     * @return ArrayList<Job>
     */
    public static ArrayList<Job> getJobByCategory(JobCategory category){
        ArrayList<Job> temp = new ArrayList<>();
        for (int i = 0; i < JOB_DATABASE.size(); i++){
            if(JOB_DATABASE.get(i).getCategory() == category){
                temp.add(JOB_DATABASE.get(i));
                return temp;
            }
        }
        return null;
    }
    
    
    /** 
     * @param job
     * @return boolean
     */
    public static boolean addJob(Job job){
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }
    
    
    /** 
     * @param id
     * @return boolean
     * @throws JobNotFoundException
     */
    public static boolean removeJob(int id) throws JobNotFoundException {
        boolean temp = true;
        try
        {
        for (Job job : JOB_DATABASE){
            if (id == job.getId()){
                JOB_DATABASE.remove(id);
                temp = true;
            }
        }
    }
        catch (Exception x){
            throw new JobNotFoundException(id);
        }
        return temp;
    }
    

}
