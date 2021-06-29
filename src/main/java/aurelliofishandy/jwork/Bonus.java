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


    public Bonus(int id, String referralCode, int extraFee, int minTotalFee, boolean active)
    {
      this.id = id;
      this.referralCode = referralCode;
      this.extraFee = extraFee;
      this.minTotalFee = minTotalFee;
      this.active = active;
      
    }
    
    
    /** 
     * @return int
     */
    
    /** 
     * @return int
     */
    
    /** 
     * @return String
     */
    public  int getId(){
        return this.id;
    }
    
    
    /** 
     * @return int
     */
    
    /** 
     * @return String
     */
    
    /** 
     * @return int
     */
    public String getReferralCode(){
        return this.referralCode;
    }
    
    
    /** 
     * @return boolean
     */
    
    /** 
     * @return int
     */
    public int getExtraFee(){
        return this.extraFee;
    }  
    
    
    /** 
     * @return int
     */
    public int getMinTotalFee(){
        return this.minTotalFee;
    }
    
    
    /** 
     * @return boolean
     */
    public boolean getActive(){
        return this.active;
    }
    
       
    
    /** 
     * @param id
     */
    
    /** 
     * @param id
     */
    public void setId(int id){
    
    /** 
     * @param referralCode
     * @return String
     */
      this.id = id;
        
    }
    
    
    /** 
     * @param referralCode
     */
    public void setReferralCode(String referralCode){
      this.referralCode = referralCode;
        
    }
    
    
    /** 
     * @param extraFee
     */
    public void setExtraFee(int extraFee){
      this.extraFee = extraFee;
        
    }
    
    
    /** 
     * @param minTotalFee
     */
    public void setMinTotalFee(int minTotalFee){
      this.minTotalFee = minTotalFee;
        
    }
    
    
    /** 
     * @param active
     */
    public void setActive(boolean active){
      this.active = active;
        
    }
    
    
    /** 
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
