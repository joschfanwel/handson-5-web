package com.example.spring_mvc_lab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController  {
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("textHello","Hello Josch from about page");
        model.addAttribute("tempatTanggalLahir","Jakarta 14 juli");
        model.addAttribute("Alamat","jakarta");
        model.addAttribute("Email","joschmatanari4@gmail.com");
        model.addAttribute("noTelepon","085781430389");
        model.addAttribute("Pendidikan", "Sma");
        model.addAttribute("Hobi","Olahraga,nonton,traveling");
        return "about";
    }
}