package com.application.travelbus.controller;

import com.application.travelbus.model.Bus;
import com.application.travelbus.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/index")
public class BusController {
    @Autowired
    BusRepository busRepository;

    @GetMapping("/")
    public List<Bus> getAllBus() {
        return busRepository.findAll();
    }
}
