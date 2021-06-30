package aurelliofishandy.jwork;
/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 29-Jun-2021)
*/

// Mengecek apakah terdapat bonus atau tidak
public class BonusNotFoundException extends Exception{

    private int bonus_error;

    public BonusNotFoundException(int bonus_input){
        super("Bonus ID: ");
        bonus_error = bonus_input;
    }

    
    /** 
     * Memperlihatkan error
     * @return String
     */
    @Override
    public String getMessage(){
        return super.getMessage() + bonus_error + "Not Found";
    }
}
