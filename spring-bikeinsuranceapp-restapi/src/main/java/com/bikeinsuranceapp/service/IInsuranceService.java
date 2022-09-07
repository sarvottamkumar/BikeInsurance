package com.bikeinsuranceapp.service;

import com.bikeinsuranceapp.model.Bike;
import com.bikeinsuranceapp.model.Insurance;

public interface IInsuranceService {
	
	void addInsurance(Insurance insurance);
	void updateInsurance(Insurance insurance);
	void deleteInsurance(int insuranceId);
	
	Bike getInsuranceById(int insuranceId);

}
