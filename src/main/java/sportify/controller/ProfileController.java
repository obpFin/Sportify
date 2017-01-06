package sportify.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by admin on 06/01/17.
 */
@Controller
public class ProfileController {

    @Autowired
    private SessionFactory sessionFactory;

    @RequestMapping("/profile")
    public String profile() {


        Session session = sessionFactory.openSession();
        return "profile";
    }
}
