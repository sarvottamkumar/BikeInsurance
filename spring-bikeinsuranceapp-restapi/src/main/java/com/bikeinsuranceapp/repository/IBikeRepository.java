package com.bikeinsuranceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikeinsuranceapp.model.Bike;

@Repository
public interface IBikeRepository extends JpaRepository<Bike, Integer>{

}
