package sportify.controller;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by admin on 04/01/17.
 */
@Controller
public class WorkoutController {


    @RequestMapping("/workout")
    public String workout(ModelMap modelMap) {

        return "workout";
    }

    @RequestMapping("/workout-submit")
    public String workoutSub() {



        return "workout-submit";
    }
}
