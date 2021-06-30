package aurelliofishandy.jwork.controller;

import aurelliofishandy.jwork.*;
import jdk.jfr.Category;
import org.springframework.web.bind.annotation.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 29-Jun-2021)
*/

@RequestMapping("/bonus")
@RestController
public class BonusController {
    
    /** 
     * Mendapatkan Seluruh informasi
     * @return ArrayList<Bonus>
     */
    @RequestMapping("")
    public ArrayList<Bonus> getAllBonus(){
        return DatabaseBonus.getBonusDatabase();
    }

    
    /** 
     * Mendapatkan referralcode
     * @param referralCode
     * @return Bonus
     */
    @RequestMapping("/{referralCode}")
    public Bonus getBonusByReferralCode(@PathVariable String referralCode) {
        Bonus bns = null;
        bns = DatabaseBonus.getBonusByReferralCode(referralCode);
        return bns;
    }

    
    /** 
     * Menambahkan bonus sesuai dengan referral code
     * @param Code"
     * @return Bonus
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Bonus addBonus(@RequestParam(value="referral Code") String referralCode,
                      @RequestParam(value="extraFee") int extraFee,
                      @RequestParam(value="minTotalFee") int minTotalFee,
                      @RequestParam(value="active") boolean active) throws ReferralCodeAlreadyExistsException
    {

        Bonus bonus = new Bonus(DatabaseBonus.getLastId()+1,referralCode,extraFee,minTotalFee,active);

        boolean success = DatabaseBonus.addBonus(bonus);

        if (success)
        {
            return bonus;
        } else
        {
            return null;
        }
    }


}
