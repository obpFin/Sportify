package sportify.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by admin on 09/01/17.
 */
@Controller
public class StatisticsController {

    @RequestMapping(value = "/statistics")
    public String statistics() {
        return "statistics";
    }
}


