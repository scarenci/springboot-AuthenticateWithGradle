package com.example.springboot.Repository;

import com.example.springboot.Model.Bike;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BikeRepository extends JpaRepository<Bike, Long> {


}
    
