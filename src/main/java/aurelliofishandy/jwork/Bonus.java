package aurelliofishandy.jwork;
/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 18-Mar-2021)
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
    
    public  int getId(){
        return this.id;
    }
    
    public String getReferralCode(){
        return this.referralCode;
    }
    
    public int getExtraFee(){
        return this.extraFee;
    }  
    
    public int getMinTotalFee(){
        return this.minTotalFee;
    }
    
    public boolean getActive(){
        return this.active;
    }
    
       
    public void setId(int id){
      this.id = id;
        
    }
    
    public void setReferralCode(String referralCode){
      this.referralCode = referralCode;
        
    }
    
    public void setExtraFee(int extraFee){
      this.extraFee = extraFee;
        
    }
    
    public void setMinTotalFee(int minTotalFee){
      this.minTotalFee = minTotalFee;
        
    }
    
    public void setActive(boolean active){
      this.active = active;
        
    }
    
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
