package com.example.exam_spring.controllers;

import com.example.exam_spring.services.PhoneService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class MyController {
    private final PhoneService service;

    public MyController(PhoneService service) {
        this.service = service;
    }

    @GetMapping("/test")
    public String products() {
        System.out.println(service.findEntityById(11));
        System.out.println(service.findAll());
        service.delete(11);
        return "asd";
    }
}
