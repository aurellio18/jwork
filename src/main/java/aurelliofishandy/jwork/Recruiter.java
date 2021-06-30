package aurelliofishandy.jwork;

/**
* @author (Aurellio Fishandy)
* @version (TUTAM - 29-Jun-2021)
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
     * Mendapatkan ID
     * getter id
     * @return id
    */    
    public int getId(){
        return this.id;
    }
    
    /**
     * Mendapatkan nama
     * getter Name
     * @return name
    */
    public String getName(){
        return this.name;
    }
    
    /**
     * Mendapatkan email
     * getter email
     * @return email
    */
    public String getEmail(){
        return this.email;
    }    
    
    /**
     * Mendapatkan nomor telepon
     * getter phoneNumber
     * @return phoneNumber
    */
    public String getphoneNumber(){
        return this.phoneNumber;
    }
    
    /**
     * Mendapatkan lokasi
     * getter location
     * @return location
    */
    public Location getLocation(){
        return this.location;
    }    
    
    /**
     * Menentukan ID
     * setter id
     * @param id
    */
    public void setId(int id){
      this.id = id;

    }
    
    /**
     * Menentukan nama
     * setter name
     * @param name
    */
    public void setName(String name){
      this.name = name;
       
    }
    
    /**
     * Menentukan email
     * setter email
     * @param email
    */
    public void setEmail(String email){
      this.email = email;
      
    }
    
    /**
     * Menentukan nomor telefon
     * setter phoneNumber
     * @param id
    */
    public void setphoneNumber(String phoneNumber){
      this.phoneNumber = phoneNumber;    
    }
    
    /**
     * Menentukan lokasi
     * setter location
     * @param location
    */
    public void setLocation(Location location){
      this.location = location;    
    }
    
    
    /** 
     * Print rekruter
     * @return String
     */
    public String toString(){
        return  "Id = "  + id  +
                "Name = "+ name +
                "PhoneNumber = "+ phoneNumber +
                "Location = "+ location.getCity();
    }
    
    /**
    //Print out dari data yang diinput
    public void printData(){
        System.out.println("========= Recruiter =========");
        System.out.println("ID :" + id );
        System.out.println("Name :" + name );
        System.out.println("Email :" + email );
        System.out.println("Phone :" + phoneNumber );
        System.out.println("City :" + location.getCity() );
    }*/
}
