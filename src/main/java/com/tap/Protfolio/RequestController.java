package com.tap.Protfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestController {

    @RequestMapping("/")
    public String homePage() {
        return "redirect:/home.html";
    }

    @RequestMapping("/education")
    public String educationPage() {
        return "redirect:/education.html";
    }

    @RequestMapping("/skills")
    public String skillPage() {
        return "redirect:/skills.html";
    }

    @RequestMapping("/projects")
    public String projectPage() {
        return "redirect:/projects.html";
    }

    @RequestMapping("/contact")
    public String contactPage() {
        return "redirect:/contact.html";
    }
}
