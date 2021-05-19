package aurelliofishandy.jwork;
public class ReferralCodeAlreadyExistsException extends Exception{
    private Bonus referral_error;

    public ReferralCodeAlreadyExistsException(Bonus referral_input){
        super("Refferral Code: ");
        referral_error = referral_input;

    }

    @Override
    public String getMessage(){
        return super.getMessage()+ referral_error.getReferralCode() + "already exists.";
    }
}

