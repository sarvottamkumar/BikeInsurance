package com.bikeinsuranceapp.service;

import java.util.List;

import com.bikeinsuranceapp.model.Bike;

public interface IBikeService {
	
	void addBike(Bike bike);
	void updateBike(Bike bike);
	void deleteBike(int bikeId);
	
	Bike getById(int bikeId);
	
	List<Bike> getByBikeNumber(String bikeNumber);
	List<Bike> getByBikeName(String bikeName);
	List<Bike> getByBikeBrand(String brand);
	List<Bike> getByBikeNumberAndBikeName(String bikeNumber,String bikeName);
	List<Bike> getByBikeNumberAndBrand(String bikeNumber,String brand);
	
	

}
