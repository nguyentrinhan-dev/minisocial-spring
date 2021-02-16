package com.nguyentrinhan.minisocial.core.web.controller;

import com.nguyentrinhan.minisocial.config.constant.Resources;
import com.nguyentrinhan.minisocial.core.service.UserService;
import com.nguyentrinhan.minisocial.core.web.dto.UserRegistrationDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(Resources.REGISTRATION)
public class UserRegistrationController {
    private UserService userService;

    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }

    @ModelAttribute("user")
    public UserRegistrationDTO userRegistrationDTO(){
        return new UserRegistrationDTO();
    }

    @GetMapping
    public String showRegisterForm() {
        return "registration";
    }

    @PostMapping
    public String registerAccount(@ModelAttribute("user") UserRegistrationDTO registrationDTO) {
        userService.save(registrationDTO);
        return "redirect:"+Resources.REGISTRATION+"?success";
    }
}
