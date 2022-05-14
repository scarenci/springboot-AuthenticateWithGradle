package com.example.springboot.Controller;

import javax.validation.Valid;

import com.example.springboot.Model.Bike;
import com.example.springboot.Repository.BikeRepository;
import com.example.springboot.Service.BikeService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping(path = "/bikes")
public class BikeController
 {
    private BikeService bikeService;

    public BikeController (BikeService bikeService) {
        this.bikeService = bikeService;
    }

    @GetMapping
    public Page<Bike> getBikes() {
        Pageable pageable = PageRequest.of(0, 10);
        return bikeService.getBikes(pageable);
    }
    
    @PostMapping
    public void setBikes(@Valid Bike bike) {
        bikeService.saveBike(bike);
    } 
}
