package com.example.kursovaya.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping({"","/"})
    public String index(){
        return "index";
    }

    @RequestMapping({"/discounts"})
    public String discounts(Model model){
        return "discounts";
    }

    @RequestMapping({"/drums"})
    public String drums(){
        return "drums";
    }

    @RequestMapping({"/guitars"})
    public String guitars(){
        return "guitars";
    }

    @RequestMapping({"/muzobr"})
    public String muzobr(){
        return "muzobr";
    }

    @RequestMapping({"/piano"})
    public String piano(){
        return "piano";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
