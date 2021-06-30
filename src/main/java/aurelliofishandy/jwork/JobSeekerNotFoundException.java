package aurelliofishandy.jwork;

/**
* @author (Aurellio Fishandy)
* @version (TUTAM - 29-Jun-2021)
*/

// Mengecek apakah Jobseeker yang dimaksud ada pada database atau tidak
public class JobSeekerNotFoundException extends Exception {

    private int jobseeker_error;

    public JobSeekerNotFoundException(int jobseeker_input){
        super("Jobseeker ID: ");
        jobseeker_error = jobseeker_input;
    }

    
    /** 
     * @return String
     */
    @Override
    public String getMessage(){
        return super.getMessage() + jobseeker_error +"Not Found";
    }
}
