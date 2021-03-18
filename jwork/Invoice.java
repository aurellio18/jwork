
public class Invoice
{
    // instance variables - replace the example below with your own
    private int id;
    private int idJob;
    private String date;
    private int totalFee;
    private JobSeeker jobSeeker;

    /**
     * Constructor for objects of class JobSeeker
     */
    public Invoice(int id, int idJob, String date, int totalFee,
    JobSeeker jobSeeker)
    {
      this.id = id;
      this.idJob = idJob;
      this.date = date;
      this.totalFee = totalFee;
      this.jobSeeker = jobSeeker;
    }
    
    public int getId(){
        return this.id;
    }
    
    public int getIdJob(){
        return this.idJob;
    }
    
    public String getDate(){
        return this.date;
    }    
    
    public int getTotalFee(){
        return this.totalFee;
    }
    
    public JobSeeker getJobSeeker(){
        return this.jobSeeker;
    }
    
    public void setId(int id){
      this.id = id;
      
    }
    
    public void setIdJob(int idJob){
      this.idJob = idJob;
       
    }
    
    public void setDate(String date){
      this.date = date;
         
    }
    
    public void setTotalFee(int totalFee){
      this.totalFee = totalFee;    
    }
    
    public void setJobSeeker(JobSeeker jobSeeker){
      this.jobSeeker = jobSeeker;    
    }
}
