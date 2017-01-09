package sportify.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sportify.model.User;
import sportify.service.UserService;

/**
 * Created by admin on 04/01/17.
 */
@Controller
public class AppController {

    @RequestMapping({"/", "/index"})
    public String homepage() {


        return "index";
    }





}
