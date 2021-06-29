package aurelliofishandy.jwork;

/**
* @author (Aurellio Fishandy)
* @version (TUTAM - 29-Jun-2021)
*/

public class JobNotFoundException extends Exception {

    private int job_error;

    public JobNotFoundException(int job_input){
        super("Job ID: ");
        job_error = job_input;
    }

    
    /** 
     * @return String
     */
    @Override
    public String getMessage() {
        return super.getMessage() + job_error + "Not Found";
    }

}
