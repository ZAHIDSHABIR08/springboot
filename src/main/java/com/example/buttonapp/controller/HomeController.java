package com.example.buttonapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to Button App!");
        return "index";
    }
    
    @PostMapping("/action")
    public String handleButtonAction(@RequestParam String action, Model model) {
        String message;
        
        switch (action) {
            case "button1":
                message = "You clicked Button 1!";
                break;
            case "button2":
                message = "Button 2 was pressed!";
                break;
            case "button3":
                message = "Action from Button 3 received!";
                break;
            case "button4":
                message = "Button 4 action processed!";
                break;
            default:
                message = "Unknown button action";
                break;
        }
        
        model.addAttribute("message", message);
        return "index";
    }
}
