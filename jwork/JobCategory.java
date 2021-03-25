
public enum JobCategory
{
    WebDeveloper("Web Developer"),
    FrontEnd("Front End"),
    BackEnd("Back End"),
    UI("UI"),
    UX("UX"),
    Devops("Devops"),
    DataScientist("Data Scientist"),
    DataAnalyst("Data Analyst");
    
    private String jobcategory;
    
    JobCategory(String jobcategory){
        this.jobcategory = jobcategory;
    }
    
    @Override
    public String toString(){
        return jobcategory;
    }
    
}
