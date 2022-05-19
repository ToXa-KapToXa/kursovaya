package com.example.kursovaya.controllers;

import com.example.kursovaya.dto.UserDTO;
import com.example.kursovaya.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ModelAttribute("user")
    public UserDTO userDTO() {
        return new UserDTO();
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") UserDTO userDTO) {
        userService.save(userDTO);
        return "redirect:/registration?success";
    }

    @GetMapping
    public String showRegistrationForm() {
        return "registration";
    }
}
