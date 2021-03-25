/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 18-Mar-2021)
*/

public class Invoice
{
    // memasukkan variabel yang digunakan
    private int id;
    private int idJob;
    private String date;
    private int totalFee;
    private Jobseeker jobSeeker;

    /**
     * Constructor untuk objek
     * @param id
     * @param idJob
     * @param date
     * @param totalFee
     * @param JobSeeker
     */
    public Invoice(int id, int idJob, String date, int totalFee,
    Jobseeker jobSeeker)
    {
      this.id = id;
      this.idJob = idJob;
      this.date = date;
      this.totalFee = totalFee;
      this.jobSeeker = jobSeeker;
    }
    
    /**
     * getter id
     * @return id
    */  
    public int getId(){
        return this.id;
    }
    
    /**
     * getter idJob
     * @return idJob
    */  
    public int getIdJob(){
        return this.idJob;
    }
    
    /**
     * getter date
     * @return date
    */  
    public String getDate(){
        return this.date;
    }    
    
    /**
     * getter totalFee
     * @return totalFee
    */  
    public int getTotalFee(){
        return this.totalFee;
    }
    
    /**
     * getter jobSeeker
     * @return jobSeeker
    */  
    public Jobseeker getJobSeeker(){
        return this.jobSeeker;
    }
    
    /**
     * setter id
     * @param id
    */
    public void setId(int id){
      this.id = id;
      
    }
    
    /**
     * setter idJob
     * @param idJob
    */
    public void setIdJob(int idJob){
      this.idJob = idJob;
       
    }
    
    /**
     * setter date
     * @param date
    */
    public void setDate(String date){
      this.date = date;
         
    }
    
    /**
     * setter totalFee
     * @param totalFee
    */
    public void setTotalFee(int totalFee){
      this.totalFee = totalFee;    
    }
    
    /**
     * setter jobSeeker
     * @param jobSeeker
    */
    public void setJobSeeker(Jobseeker jobSeeker){
      this.jobSeeker = jobSeeker;    
    }
    
    //Print out dari data yang diinput
    public void printData(){
        System.out.println("Fee Pekerjaan :" + getTotalFee() );
    }
}
