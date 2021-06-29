package aurelliofishandy.jwork;
import java.util.Calendar;
import java.util.regex.*;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 29-Jun-2021)
*/
public class Jobseeker
{
    // memasukkan variabel yang digunakan
    private int id;
    private String name;
    private String email;
    private String password;
    private Calendar joinDate;

    /**
     * Constructor untuk objek
     * @param id
     * @param name
     * @param email
     * @param password
     * @param joinDate
     */
    public Jobseeker(int id, String name, String email,
                    String password, Calendar joinDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.joinDate = joinDate;
        setEmail(email);
        setPassword(password);
    }
    
    public Jobseeker(int id, String name, String email,
                    String password, int year, int month,
                    int dayOfMonth) {
        this.id = id;
        this.name = name;
        this.setEmail(email);
        this.setPassword(password);
        this.setJoinDate(year, month, dayOfMonth);
    }
    
    public Jobseeker(int id, String name, String email,
                    String password) {
        this.id = id;
        this.name = name;
        this.setEmail(email);
        this.setPassword(password);
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
    public Calendar getJoinDate(){
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
        Pattern p = Pattern.compile("^(?!.*([.])\\1)[^-.@][a-zA-Z0-9.&*_~]+(?!.*([@.])\\1)[^-.][a-zA-Z0-9-.&*_~]+(?:\\\\.[a-zA-Z0-9-]+)*$");
        Matcher m = p.matcher(email);
        if (m.find()){
            this.email = email;
        }else{
            this.email = "";
        }
    }
    
    /**
     * setter password
     * @param password
    */
    public void setPassword(String password){
        Pattern p = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{6,}$");
        Matcher m = p.matcher(password);
        if (m.find()){
            this.password = password;
        }else{
            this.password = "";
        }
    }
    
    /**
     * setter joinDate
     * @param joinDate
    */
    public void setJoinDate(Calendar joinDate){

        this.joinDate = joinDate;
    }
    
    public void setJoinDate(int year, int month, int dayOfMonth){
        this.joinDate = new GregorianCalendar(year, month, dayOfMonth);
    }
    
    public String toString(){
        String strDate = "" ;
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        if (joinDate != null){
        Date date = joinDate.getTime();
        strDate = dateFormat.format(date);
        }
        return  "========= JOB SEEKER =========" +
                "\nId = "  + id  +
                "\nName = "+ name +
                "\nEmail = "+ email +
                "\nPassword = "+ password +
                "\nJoin Date ="+ strDate;
    }
}
    
    /**
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
*/
