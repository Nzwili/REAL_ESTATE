package com.realestate.real_estate_web_app.controller;

import com.realestate.real_estate_web_app.model.User;
import com.realestate.real_estate_web_app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(User user) {
        user.setRole("buyer"); // Default role for new users
        userService.registerUser(user);
        return "redirect:/login"; // Redirect to login after registration
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
}
