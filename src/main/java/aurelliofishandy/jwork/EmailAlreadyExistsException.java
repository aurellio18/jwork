package aurelliofishandy.jwork;

/**
* @author (Aurellio Fishandy)
* @version (TUTAM - 29-Jun-2021)
*/

public class EmailAlreadyExistsException extends Exception{
    private Jobseeker jobseeker_error;

    public EmailAlreadyExistsException(Jobseeker jobseeker_input){
        super("Jobseeker Email: ");
        jobseeker_error = jobseeker_input;

    }

    
    /** 
     * @return String
     */
    @Override
    public String getMessage(){
        return super.getMessage() + jobseeker_error.getEmail() + "already exists.";
    }
}
