package aurelliofishandy.jwork;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 18-Mar-2021)
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
    public  ArrayList<Job> getJobs(){
        return jobs;
    }
    
    /**
     * getter date
     * @return date
    */  
    public Calendar getDate(){
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
    

    public void setJobs(ArrayList<Job> jobs){
      this.jobs = jobs;
       
    }
    
    /**
     * setter date
     * @param date
    */
    public void setDate(Calendar date){
      this.date = date;
         
    }
    
    public void setDate(int year, int month, int dayOfMonth){
        this.date = new GregorianCalendar(year, month, dayOfMonth);
    }
    

    public abstract void setTotalFee();
    
    /**
     * setter jobSeeker
     * @param jobSeeker
    */
    public void setJobSeeker(Jobseeker jobSeeker){
      this.jobSeeker = jobSeeker;    
    }

    public void setInvoiceStatus(InvoiceStatus invoiceStatus){this.invoiceStatus = invoiceStatus;}

    public abstract String toString();
    //Print out dari data yang diinput
    //public abstract void printData();
    
}
