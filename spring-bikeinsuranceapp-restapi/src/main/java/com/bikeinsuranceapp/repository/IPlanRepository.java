package com.bikeinsuranceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikeinsuranceapp.model.Plan;

public interface IPlanRepository extends JpaRepository<Plan, Integer>{

}
