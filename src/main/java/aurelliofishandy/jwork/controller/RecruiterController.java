package aurelliofishandy.jwork.controller;

import aurelliofishandy.jwork.*;
import jdk.jfr.Category;
import org.springframework.web.bind.annotation.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

@RequestMapping("/recruiter")
@RestController
public class RecruiterController {
    @RequestMapping("")
    public ArrayList<Recruiter> getAllRecruiter(){
        return DatabaseRecruiter.getRecruiterDatabase();
    }

    @RequestMapping("/{id}")
    public Recruiter getRecruiterById(@PathVariable int id) {
        Recruiter recruiter = null;
        try {
            recruiter = DatabaseRecruiter.getRecruiterById(id);
        } catch (RecruiterNotFoundException e) {
            e.getMessage();
            return null;
        }
        return recruiter;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Recruiter addRecruiter(@RequestParam(value="name") String name,
                                  @RequestParam(value="email") String email,
                                  @RequestParam(value="phoneNumber") String phoneNumber,
                                  @RequestParam(value="province") String province,
                                  @RequestParam(value="city") String city,
                                  @RequestParam(value="description") String description)
    {
        Location location = new Location(province, city, description);
        Recruiter recruiter = new Recruiter(DatabaseRecruiter.getLastId()+1, name, email, phoneNumber, location);

        boolean success = DatabaseRecruiter.addRecruiter(recruiter);

        if (success)
        {
            return recruiter;
        } else
        {
            return null;
        }
    }


}
