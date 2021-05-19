package aurelliofishandy.jwork;
/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 18-Mar-2021)
*/

public class Job
{
    // memasukkan variabel yang digunakan
    private int id,fee;
    private String name;
    private Recruiter recruiter;
    private JobCategory category;

    /**
     * Constructor untuk objek
     * @param id
     * @param name
     * @param fee
     * @param category
     * @param recruiter
     */
    public Job(int id,String name,Recruiter recruiter, int fee,
     JobCategory category)
    {
      this.id = id;
      this.name = name;
      this.recruiter = recruiter;
      this.fee = fee;
      this.category = category;

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
     * getter recruiter
     * @return recruiter
    */
    public Recruiter getRecruiter(){
        return this.recruiter;
    }
    
    public JobCategory getCategory(){
        return this.category;
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
     * setter recruiter
     * @param recruiter
    */
    public void setRecruiter(Recruiter recruiter){
      this.recruiter = recruiter;   
    }
    
    /**
     * setter Category
     * @param Category
    */
    public void setCategory(JobCategory category){
      this.category = category;   
    }
    
    public String toString(){
        return  "========= JOB =========" +
                "\nId = "  + id  +
                "\nName = "+ name +
                "\nRecruiter = "+ getRecruiter().getName() +
                "\nCity = "+ recruiter.getLocation().getCity() +
                "\nFee = "+ fee +
                "\nCategory ="+ category ;
    }
    
    /**
    //Print out dari data yang diinput
    public void printData(){
        System.out.println("========= JOB =========");
        System.out.println("id :" + id );
        System.out.println("Name :" + name );
        System.out.println("Recruiter :" + getRecruiter().getName() );
        System.out.println("Fee :" + fee );
        System.out.println("City :" + recruiter.getLocation().getCity());
        System.out.println("Category :" + category );
    }*/
}
