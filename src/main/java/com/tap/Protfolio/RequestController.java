package com.tap.Protfolio;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RequestController {

    @RequestMapping("/")
    public String homePage() {
        return "home";  // This will map to /static/home.html
    }

    @RequestMapping("/education")
    public String educationPage() {
        return "education";  // This will map to /static/education.html
    }

    @RequestMapping("/skills")
    public String skillPage() {
        return "skills";  // This will map to /static/skills.html
    }

    @RequestMapping("/projects")
    public String projectPage() {
        return "projects";  // This will map to /static/projects.html
    }

    @RequestMapping("/contact")
    public String contactPage() {
        return "contact";  // This will map to /static/contact.html
    }
}
