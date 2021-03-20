/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 18-Feb-2021)
*/

public class Location
{
    // memasukkan variabel yang diperlukan
    private String province, city, description;


    /**
     * Constructor untuk objek
     * @param province
     * @param city
     * @param description
     */
    public Location(String province, String city, String description)
    {
      this.province = province;
      this.city = city;
      this.description = description;
      
    }
    
    /**
     * getter province
     * @return province
    */
    
    public String getProvince(){
        return this.province;
    }
    
    /**
     * getter city
     * @return city
    */
    public String getCity(){
        return this.city;
    }
    
    /**
     * getter description
     * @return description
    */
    
    public String getDescription(){
        return this.description;
    }    
    
    /**
     * setter province
     * @param province
    */
    
    public void setProvince(String province){
      this.province = province;
        
    }
    
    /**
     * setter city
     * @param city
    */
    public void setCity(String city){
      this.city = city;      
    }
    
    /**
     * setter description
     * @param description
    */
    public void setDescription(String description){
     this.description = description;
         
    }
    
    // print out provinsi yang dimasukkan    
    public void printData(){
        System.out.println("Provinsi :" +getProvince() );
    }
    
}
