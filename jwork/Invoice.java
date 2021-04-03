/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 18-Mar-2021)
*/

public abstract class Invoice
{
    // memasukkan variabel yang digunakan
    private int id;
    private Job job;
    private String date;
    protected int totalFee;
    private Jobseeker jobSeeker;
    private PaymentType paymentType;
    private InvoiceStatus invoiceStatus;

    /**
     * Constructor untuk objek
     * @param id
     * @param idJob
     * @param date
     * @param totalFee
     * @param JobSeeker
     */
    public Invoice(int id, Job job, String date, 
    Jobseeker jobSeeker, InvoiceStatus invoiceStatus)
    {
      this.id = id;
      this.job = job;
      this.date = date;
      this.jobSeeker = jobSeeker;
      this.invoiceStatus = invoiceStatus;
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
    public Job getJob(){
        return this.job;
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
    
    public abstract PaymentType getPaymentType();
    
    public InvoiceStatus getInvoiceStatus(){
        return this.invoiceStatus;
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
    public void setId(Job job){
      this.job = job;
       
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
    public abstract void setTotalFee();
    
    /**
     * setter jobSeeker
     * @param jobSeeker
    */
    public void setJobSeeker(Jobseeker jobSeeker){
      this.jobSeeker = jobSeeker;    
    }
    
    public void setPaymentType(PaymentType paymentType){
      this.paymentType = paymentType;    
    }
    
    public void setInvoiceStatus(InvoiceStatus invoiceStatus){
      this.invoiceStatus = invoiceStatus;    
    }

    
    //Print out dari data yang diinput
    public abstract void printData();
    
}
