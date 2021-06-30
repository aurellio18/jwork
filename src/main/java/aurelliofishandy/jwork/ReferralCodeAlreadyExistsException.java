package aurelliofishandy.jwork;
/**
* @author (Aurellio Fishandy)
* @version (TUTAM - 29-Jun-2021)
*/

// Mengecek apakah ReferralCode sudah pernah register atau belum
public class ReferralCodeAlreadyExistsException extends Exception{
    private Bonus referral_error;

    public ReferralCodeAlreadyExistsException(Bonus referral_input){
        super("Refferral Code: ");
        referral_error = referral_input;

    }

    
    /** 
     * @return String
     */
    @Override
    public String getMessage(){
        return super.getMessage()+ referral_error.getReferralCode() + "already exists.";
    }
}

