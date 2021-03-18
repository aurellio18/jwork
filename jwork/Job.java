
public class Job
{
    // instance variables - replace the example below with your own
    private int id,fee;
    private String name,category;
    private Recruiter recruiter;

    /**
     * Constructor for objects of class JobSeeker
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
    
    public int getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getFee(){
        return this.fee;
    }    
    
    public String getCategory(){
        return this.category;
    }
    
    public Recruiter getRecruiter(){
        return this.recruiter;
    }
    
    public void setId(int id){
      this.id = id;
        
    }
    
    public void setName(String name){
      this.name = name;
      
    }
    
    public void setFee(int fee){
      this.fee = fee;
         
    }
    
    public void setCategory(String category){
      this.category = category;   
    }
    
    public void setRecruiter(Recruiter recruiter){
      this.recruiter = recruiter;   
    }
    
}
