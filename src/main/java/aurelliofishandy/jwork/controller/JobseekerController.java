package aurelliofishandy.jwork.controller;

import aurelliofishandy.jwork.*;
import org.springframework.web.bind.annotation.*;

/**
* @author (Aurellio Fishandy)
* @version (Modul 2 - 29-Jun-2021)
*/
@RequestMapping("/jobseeker")
@RestController
public class JobseekerController {

    
    /** 
     * Mendapatkan Seluruh informasi
     * @param @RequestParam(value="name"
     * @param name
     * @return String
     */
    @RequestMapping("")
    public String indexPage(@RequestParam(value="name", defaultValue="world") String name) {
        return "Hello " + name;
    }

    
    /**
     * Mendapatkan ID 
     * @param id
     * @return Jobseeker
     */
    @RequestMapping("/{id}")
    public Jobseeker getJobseekerById(@PathVariable int id) {
        Jobseeker jobseeker = null;
        try {
            jobseeker = DatabaseJobseekerPostgre.getJobseekerById(id);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return jobseeker;
    }

    
    /** 
     * Menambahkan jobseeker dengan register
     * @param @RequestParam(value="name"
     * @return Jobseeker
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Jobseeker registerJobseeker(@RequestParam(value="name") String name,
                                  @RequestParam(value="email") String email,
                                  @RequestParam(value="password") String password)
    {
        Jobseeker jobseeker = new Jobseeker(DatabaseJobseekerPostgre.getLastId()+1, name, email, password);
        try {
            DatabaseJobseekerPostgre.addJobseeker(jobseeker);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
        return jobseeker;
    }

    
    /** 
     * Mengecek email & password sudah terdapat pada database atau belum
     * @param @RequestParam(value="email"
     * @return Jobseeker
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Jobseeker loginJobseeker(@RequestParam(value="email") String email,
                                    @RequestParam(value="password") String password)
    {
        Jobseeker jobs = DatabaseJobseekerPostgre.getJobSeekerLogin(email, password);
        return jobs;
    }

}