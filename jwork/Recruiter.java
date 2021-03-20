/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 18-Feb-2021)
*/

public class Recruiter
{
    // memasukkan variabel yang diperlukan
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Constructor untuk objek
     * @param id
     * @param name
     * @param email
     * @param phoneNumber
     * @param location
     */
    public Recruiter(int id, String name, String email, String phoneNumber,
    Location location)
    {
      this.id = id;
      this.name = name;
      this.email = email;
      this.phoneNumber = phoneNumber;
      this.location = location;
    }
    
    /**
     * getter id
     * @return id
    */    
    public int getId(){
        return this.id;
    }
    
    /**
     * getter Name
     * @return name
    */
    public String getName(){
        return this.name;
    }
    
    /**
     * getter email
     * @return email
    */
    public String getEmail(){
        return this.email;
    }    
    
    /**
     * getter phoneNumber
     * @return phoneNumber
    */
    public String getphoneNumber(){
        return this.phoneNumber;
    }
    
    /**
     * getter location
     * @return location
    */
    public Location getLocation(){
        return this.location;
    }    
    
    /**
     * setter id
     * @param id
    */
    public void setId(int id){
      this.id = id;

    }
    
    /**
     * setter name
     * @param name
    */
    public void setName(String name){
      this.name = name;
       
    }
    
    /**
     * setter email
     * @param email
    */
    public void setEmail(String email){
      this.email = email;
      
    }
    
    /**
     * setter phoneNumber
     * @param id
    */
    public void setphoneNumber(String phoneNumber){
      this.phoneNumber = phoneNumber;    
    }
    
    /**
     * setter location
     * @param location
    */
    public void setLocation(Location location){
      this.location = location;    
    }
    
    //Print out dari data yang diinput
    public void printData(){
        System.out.println("Perekrut :" + getName() );
    }
}
