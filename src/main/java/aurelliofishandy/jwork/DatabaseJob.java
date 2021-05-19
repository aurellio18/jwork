package aurelliofishandy.jwork;
import java.util.ArrayList;

/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 18-Mar-2021)
*/
public class DatabaseJob
{

    // memasukkan variabel yang digunakan
    private static ArrayList<Job> JOB_DATABASE= new ArrayList<Job>();
    private static int lastId = 0;

    public static ArrayList<Job> getJobDatabase(){
        return JOB_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Job getJobById(int id) throws JobNotFoundException{
        Job temp = null;
        try {
            for (Job job : JOB_DATABASE) {
                if (id == job.getId()) {
                    temp = job;
                }
            }
        }
        catch (Exception x)
        {
            throw new JobNotFoundException(id);
        }
        return temp;
    }

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
    
    public static boolean addJob(Job job){
        JOB_DATABASE.add(job);
        lastId = job.getId();
        return true;
    }
    
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
