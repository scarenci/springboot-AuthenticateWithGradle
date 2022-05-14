package com.example.springboot.Service;

import com.example.springboot.Model.Bike;
import com.example.springboot.Repository.BikeRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BikeService {
    
    private BikeRepository bikeRepository;

    public BikeService(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    public Page<Bike> getBikes(Pageable page) {
        return bikeRepository.findAll(page);
    }

    public void saveBike(Bike bike) {
        this.bikeRepository.save(bike);
    }
}
