package aurelliofishandy.jwork;


/**
* @author (Aurellio Fishandy)
* @version (TUTAM - 29-Jun-2021)
*/

// Mengecek apakah Recruiter yang dimaksud sudah ada pada database atau belum
public class RecruiterNotFoundException extends Exception{

    private int recruiter_error;

    public  RecruiterNotFoundException(int recruiter_input){
        super("Recruiter ID: ");
        recruiter_error = recruiter_input;
    }

    
    /** 
     * @return String
     */
    @Override
    public String getMessage(){
        return super.getMessage() + recruiter_error + "Not Found";
    }

}
