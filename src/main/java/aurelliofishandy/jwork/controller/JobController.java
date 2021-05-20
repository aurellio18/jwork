package aurelliofishandy.jwork.controller;

import aurelliofishandy.jwork.*;
import jdk.jfr.Category;
import org.springframework.web.bind.annotation.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

@RequestMapping("/job")
@RestController
public class JobController {

    @RequestMapping("")
    public ArrayList<Job> getAllJob(){
        return DatabaseJob.getJobDatabase();
    }

    @RequestMapping("/{id}")
    public Job getJobById(@PathVariable int id) {
        Job job = null;
        try {
            job = DatabaseJob.getJobById(id);
        } catch (JobNotFoundException e) {
            e.getMessage();
            return null;
        }
        return job;
    }

    @RequestMapping("/recruiter/{recruiterId}")
    public ArrayList<Job> getJobByRecruiter(@PathVariable int recruiterId) {
        ArrayList<Job> job = null;
        job = DatabaseJob.getJobByRecruiter(recruiterId);
        return job;
    }

    @RequestMapping("/category/{category}")
    public ArrayList<Job> getJobByCategory(@PathVariable JobCategory category){
        return DatabaseJob.getJobByCategory(category);
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Job addJob(@RequestParam(value="name") String name,
                      @RequestParam(value="fee") int fee,
                      @RequestParam(value="category") JobCategory category,
                      @RequestParam(value="recruiter id") int recruiterId) throws RecruiterNotFoundException
    {
        Recruiter recruiter = null;
        try {
            recruiter = DatabaseRecruiter.getRecruiterById(recruiterId);
        } catch (RecruiterNotFoundException e)
        {
            throw e;
        }
        Job job = new Job(DatabaseJob.getLastId(), name, recruiter, fee, category);
        boolean success = DatabaseJob.addJob(job);

        if (success)
        {
            return job;
        } else
        {
            return null;
        }
    }


}
