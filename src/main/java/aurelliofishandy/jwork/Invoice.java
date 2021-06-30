package aurelliofishandy.jwork;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
* @author (Aurellio Fishandy)
* @version (TUTAM - 29-Jun-2021)
*/

public abstract class Invoice
{
    // memasukkan variabel yang digunakan
    private int id;
    private Calendar date;
    protected int totalFee;
    private Jobseeker jobSeeker;
    private InvoiceStatus invoiceStatus;
    private ArrayList<Job> jobs;


    public Invoice(int id, ArrayList<Job> jobs,
    Jobseeker jobSeeker)
    {
      this.id = id;
      this.jobs = jobs;
      this.jobSeeker = jobSeeker;
      this.invoiceStatus = invoiceStatus.OnGoing;
      this.date = Calendar.getInstance();
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
     * Mendapatkan ID job
     * getter idJob
     * @return idJob
    */  
    public  ArrayList<Job> getJobs(){
        return jobs;
    }
    
    /**
     * Mendapatkan tanggal
     * getter date
     * @return date
    */  
    public Calendar getDate(){
        return this.date;
    }    
    
    /**
     * Mendapatkan total fee
     * getter totalFee
     * @return totalFee
    */  
    public int getTotalFee(){
        return this.totalFee;
    }
    
    /**
     * Mendapatkan jobseeker
     * getter jobSeeker
     * @return jobSeeker
    */  
    public Jobseeker getJobSeeker(){
        return this.jobSeeker;
    }
        
    /** 
     * Mendapatkan payment type
     * @param getInvoiceStatus(
     * @return PaymentType
     */
    public abstract PaymentType getPaymentType();
        
    /** 
     * Mendapatkan invoice status
     * @return InvoiceStatus
     */
    public InvoiceStatus getInvoiceStatus(){
        return this.invoiceStatus;
    }
    
    /**
     * menentukan ID
     * setter id
     * @param id
    */
    public void setId(int id){
      this.id = id;
      
    }
    
    /** 
     * menentukan job
     * @param jobs
     */
    public void setJobs(ArrayList<Job> jobs){
      this.jobs = jobs;
       
    }
    
    /**
     * menentukan date
     * setter date
     * @param date
    */
    public void setDate(Calendar date){
      this.date = date;
         
    }
    
    
    /** 
     * menentukan date menggunakan gregorian calendar
     * @param year
     * @param month
     * @param dayOfMonth
     */
    public void setDate(int year, int month, int dayOfMonth){
        this.date = new GregorianCalendar(year, month, dayOfMonth);
    }
    
    /** 
     * menentukan total fee
     * @param jobSeeker
     */
    public abstract void setTotalFee();
    
    /**
     * menentukan jobseeker
     * setter jobSeeker
     * @param jobSeeker
    */
    public void setJobSeeker(Jobseeker jobSeeker){
      this.jobSeeker = jobSeeker;    
    }

    /**
     * menentukan invoice status
     * @param invoiceStatus
     */
    public void setInvoiceStatus(InvoiceStatus invoiceStatus){this.invoiceStatus = invoiceStatus;}

    public abstract String toString();
    //Print out dari data yang diinput
    //public abstract void printData();
    
}
