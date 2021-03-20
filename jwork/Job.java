/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 18-Feb-2021)
*/

public class Job
{
    // memasukkan variabel yang digunakan
    private int id,fee;
    private String name,category;
    private Recruiter recruiter;

    /**
     * Constructor untuk objek
     * @param id
     * @param name
     * @param fee
     * @param category
     * @param recruiter
     */
    public Job(int id,String name, int fee, String category,
    Recruiter recruiter)
    {
      this.id = id;
      this.name = name;
      this.fee = fee;
      this.category = category;
      this.recruiter = recruiter;
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
     * getter Fee
     * @return Fee
    */  
    public int getFee(){
        return this.fee;
    }    
    
    /**
     * getter category
     * @return category
    */
    public String getCategory(){
        return this.category;
    }
    
    /**
     * getter recruiter
     * @return recruiter
    */
    public Recruiter getRecruiter(){
        return this.recruiter;
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
     * setter Fee
     * @param Fee
    */
    public void setFee(int fee){
      this.fee = fee;
         
    }
    
    /**
     * setter category
     * @param category
    */
    public void setCategory(String category){
      this.category = category;   
    }
    
    /**
     * setter recruiter
     * @param recruiter
    */
    public void setRecruiter(Recruiter recruiter){
      this.recruiter = recruiter;   
    }
    
    //Print out dari data yang diinput
    public void printData(){
        System.out.println("Pekerjaan :" + getName() );
    }
}
