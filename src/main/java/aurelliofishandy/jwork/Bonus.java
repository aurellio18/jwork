package aurelliofishandy.jwork;
/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 29-Jun-2021)
*/

public class Bonus
{
    // memasukkan variabel yang diperlukan
    private int id, extraFee, minTotalFee;
    private String referralCode;
    private boolean active;

    /**
     * Konstruktur dari Bonus
     * @param id
     * @param referralCode
     * @param extraFee
     * @param minTotalFee
     * @param active
     */
    public Bonus(int id, String referralCode, int extraFee, int minTotalFee, boolean active)
    {
      this.id = id;
      this.referralCode = referralCode;
      this.extraFee = extraFee;
      this.minTotalFee = minTotalFee;
      this.active = active;
      
    }
    
    
    /** 
     * Mendapatkan ID
     * @return int
     */
    public  int getId(){
        return this.id;
    }
    
    
    /** 
     *  Mendapatkan ReferralCode
     * @return String
     */
    public String getReferralCode(){
        return this.referralCode;
    }
    
    
    /** 
     *  Mendapatkan tambahan fee
     * @return int
     */
    public int getExtraFee(){
        return this.extraFee;
    }  
    
    
    /**
     *  Mendapatkan total fee 
     * @return int
     */
    public int getMinTotalFee(){
        return this.minTotalFee;
    }
    
    
    /** 
     *  Mendapatkan aktivasi Bonus
     * @return boolean
     */
    public boolean getActive(){
        return this.active;
    }
    
       
    
    /** 
     * Menentukan ID
     * @param id
     */
    public void setId(int id){
      this.id = id;
        
    }
    
    
    /** 
     * Menentukan Referral Code
     * @param referralCode
     */
    public void setReferralCode(String referralCode){
      this.referralCode = referralCode;
        
    }
    
    
    /** 
     * Menentukan fee tambahan
     * @param extraFee
     */
    public void setExtraFee(int extraFee){
      this.extraFee = extraFee;
        
    }
    
    
    /**
     * Menentukan total fee 
     * @param minTotalFee
     */
    public void setMinTotalFee(int minTotalFee){
      this.minTotalFee = minTotalFee;
        
    }
    
    
    /** 
     * Menentukan aktivasi bonus
     * @param active
     */
    public void setActive(boolean active){
      this.active = active;
        
    }
    
    
    /** 
     * Print Bonus
     * @return String
     */
    public String toString(){
        return  "========= Bonus =========" +
                "\nId = "  + id +
                "\nReferral Code = "+ referralCode +
                "\nExtra Fee = "+ extraFee +
                "\nMin Total Fee =" + minTotalFee +
                "\nActive Status =" + active ;
    }
    
    /**
    //Print out dari data yang diinput
    public void printData(){
        System.out.println("========= Bonus =========");
        System.out.println("Id :" + id );
        System.out.println("Referral Code :" + referralCode);
        System.out.println("Extra Fee :" + extraFee );
        System.out.println("MinTotalFee :" + minTotalFee );
        System.out.println("Active :" + active );
    }*/
    
}
