package com.example.doiwebservice.controller;

import com.example.doiwebservice.service.IDoiService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DoiController {

    private IDoiService doiservice;

    public DoiController(IDoiService doiservice) {
        this.doiservice = doiservice;
    }

    @RequestMapping("/list-all-dois")
    public String findAllDois(Model model) {
        model.addAttribute("data", doiservice.requestAllDois().getBody());
        model.addAttribute("all", "active");
        return "list-all-dois";
    }
}
