package com.oskaripeltonen.sportify.app.controller;

/**
 * Created by admin on 03/01/17.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @RequestMapping("/")
    public String homepage() {


        return "index";
    }

    @RequestMapping("/login")
    public String login() {


        return "login";
    }
}
