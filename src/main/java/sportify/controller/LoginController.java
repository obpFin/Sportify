package sportify.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sportify.model.User;

/**
 * Created by admin on 07/01/17.
 */
@Controller
public class LoginController {


    @RequestMapping("/login")
    public String login(Model model) {

        model.addAttribute("user", new User());
        return "login";
    }

}
