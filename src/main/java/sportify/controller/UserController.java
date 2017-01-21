package sportify.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import sportify.model.User;
import sportify.service.UserService;

import javax.validation.Valid;

/**
 * Created by admin on 06/01/17.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String profile() {

        return "profile";
    }

    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public String addUser(User user) {

        userService.save(user);
        return "redirect:/index";
    }
}
