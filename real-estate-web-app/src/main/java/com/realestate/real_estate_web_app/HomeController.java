package com.realestate.real_estate_web_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") // Maps the root URL
    public String home() {
        return "redirect:/index.html"; // Return the view name without the .html extension
    }
}