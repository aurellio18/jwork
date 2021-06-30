package aurelliofishandy.jwork;
/**
* @author (Aurellio Fishandy)
* @version (TUTAM - 29-Jun-2021)
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
     * Mendapatkan fee
     * getter Fee
     * @return Fee
    */  
    public int getFee(){
        return this.fee;
    }    
    
    
    /**
     * Mendapatkan recruiter
     * getter recruiter
     * @return recruiter
    */
    public Recruiter getRecruiter(){
        return this.recruiter;
    }
    
    
    /** 
     * Mendapatkan kategori job
     * @return JobCategory
     */
    public JobCategory getCategory(){
        return this.category;
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
     * Menentukan fee
     * setter Fee
     * @param Fee
    */
    public void setFee(int fee){
      this.fee = fee;
         
    }
    
    /**
     * Menentukan recruiter
     * setter recruiter
     * @param recruiter
    */
    public void setRecruiter(Recruiter recruiter){
      this.recruiter = recruiter;   
    }
    
    /**
     * Menentukan kategori job
     * setter Category
     * @param Category
    */
    public void setCategory(JobCategory category){
      this.category = category;   
    }
    
    
    /** 
     * print job
     * @return String
     */
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
