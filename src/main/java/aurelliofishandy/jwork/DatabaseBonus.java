package aurelliofishandy.jwork;
import java.util.ArrayList;

/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 18-Mar-2021)
*/
public class DatabaseBonus
{
    // memasukkan variabel yang digunakan
    private static ArrayList<Bonus> BONUS_DATABASE= new ArrayList<Bonus>();
    private static int lastId = 0;

    public static ArrayList<Bonus> getBonusDatabase(){
        return BONUS_DATABASE;
    }

    public static int getLastId(){
        return lastId;
    }

    public static Bonus getBonusById(int id) throws BonusNotFoundException {
        Bonus temp = null;
        try {
            for (Bonus bonus : BONUS_DATABASE) {
                if (id == bonus.getId()) {
                    temp = bonus;
                }
            }
        }
        catch (Exception x)
        {
            throw new BonusNotFoundException(id);
        }
        return temp;
    }
    public static Bonus getBonusByReferralCode(String referralCode){
        ArrayList<Job> temp = new ArrayList<>();
        for (int i=0; i < BONUS_DATABASE.size(); i++) {
            if(BONUS_DATABASE.get(i).getReferralCode()== referralCode){
                return BONUS_DATABASE.get(i);
            }
        }
        return null;
    }
    
    public static boolean addBonus(Bonus bonus) throws ReferralCodeAlreadyExistsException {
        for (Bonus bons : BONUS_DATABASE)
        {
            if (bonus.getReferralCode() == bons.getReferralCode())
            {
                throw new ReferralCodeAlreadyExistsException(bonus);
            }
        }
        BONUS_DATABASE.add(bonus);
        lastId = bonus.getId();
        return true;
    }

    public static boolean activeBonus(int id){
        for (int i = 0; i < BONUS_DATABASE.size(); i++) {
            if (BONUS_DATABASE.get(i).getId() == id) {
                BONUS_DATABASE.get(i).setActive(true);
                return true;
            }
        }
        return false;
    }

    public static boolean deactiveBonus(int id){
        for (int i = 0; i < BONUS_DATABASE.size(); i++) {
            if (BONUS_DATABASE.get(i).getId() == id) {
                BONUS_DATABASE.get(i).setActive(false);
                return true;
            }
        }
        return false;
    }
    
    public static boolean removeBonus(int id) throws BonusNotFoundException {
        boolean temp = true;
        try
        {
            for (Bonus bonus : BONUS_DATABASE){
                if (id == bonus.getId()){
                    BONUS_DATABASE.remove(id);
                    temp = true;
                }
            }
        }
        catch (Exception x){
            throw new BonusNotFoundException(id);
        }
        return temp;
    }

    
}
