package sportify.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sportify.model.User;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by admin on 07/01/17.
 */
@Controller
public class LoginController {


    @RequestMapping("/login")
    public String login(Model model, HttpServletRequest request) {

        model.addAttribute("user", new User());

        try {
            Object flash = request.getSession().getAttribute("flash");
            //add message to modelmap and remove it from the session
            model.addAttribute("flash", flash);
            request.getSession().removeAttribute("flash");
        } catch (Exception ex) {
        }
        return "login";
    }

    @RequestMapping("/access_denied")
    public String accessDenied() {
        return "access_denied";
    }



}
