package com.bikeinsuranceapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikeinsuranceapp.model.Bike;
import com.bikeinsuranceapp.repository.IBikeRepository;

@Service
public class BikeServiceImpl implements IBikeService{
	
	@Autowired
	IBikeRepository bikeRepository;

	@Override
	public void addBike(Bike bike) {
		
		bikeRepository.save(bike);
	}

	@Override
	public void updateBike(Bike bike) {
		bikeRepository.save(bike);
		
	}

	@Override
	public void deleteBike(int bikeId) {
		bikeRepository.deleteById(bikeId);
		
	}

	@Override
	public Bike getById(int bikeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bike> getByBikeNumber(String bikeNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bike> getByBikeName(String bikeName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bike> getByBikeBrand(String brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bike> getByBikeNumberAndBikeName(String bikeNumber, String bikeName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Bike> getByBikeNumberAndBrand(String bikeNumber, String brand) {
		// TODO Auto-generated method stub
		return null;
	}

}
