/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 18-Mar-2021)
*/

public class Jobseeker
{
    // memasukkan variabel yang digunakan
    private int id;
    private String name;
    private String email;
    private String password;
    private String joinDate;

    /**
     * Constructor untuk objek
     * @param id
     * @param name
     * @param email
     * @param password
     * @param joinDate
     */
    public Jobseeker(int id, String name, String email, String password, 
    String joinDate)
    {
      this.id = id;
      this.name = name;
      this.email = email;
      this.password = password;
      this.joinDate = joinDate;
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
     * getter password
     * @return password
    */  
    public String getPassword(){
        return this.password;
    }
    
    /**
     * getter joinDate
     * @return joinDate
    */  
    public String getJoinDate(){
        return this.joinDate;
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
     * setter password
     * @param password
    */
    public void setPassword(String password){
        this.password = password;
    }
    
    /**
     * setter joinDate
     * @param joinDate
    */
    public void setJoinDate(String joinDate){
        this.joinDate = joinDate;
    }
    
    //Print out dari data yang diinput
    public void printData(){
        System.out.println("========= JOB SEEKER =========");
        System.out.println("id :" + id );
        System.out.println("Name :" + name );
        System.out.println("Email :" + email );
        System.out.println("Password :" + password);
        System.out.println("Join :" + joinDate );
    }
}
