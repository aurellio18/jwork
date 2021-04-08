/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 18-Mar-2021)
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
    
    public String toString(){
        return  "Province = "  + province  +
                "City = "+ city +
                "Description = "+ description;
    }
    /**
    //Print out dari data yang diinput
    public void printData(){
        System.out.println("========= LOCATION =========");
        System.out.println("Province :" + province );
        System.out.println("City :" + city );
        System.out.println("Description :" + description );
    
    }*/
    
}
