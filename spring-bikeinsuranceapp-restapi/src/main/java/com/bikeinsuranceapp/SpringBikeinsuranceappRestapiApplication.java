package com.bikeinsuranceapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bikeinsuranceapp.model.Bike;
import com.bikeinsuranceapp.model.Category;
import com.bikeinsuranceapp.model.Insurance;
import com.bikeinsuranceapp.model.Plan;
import com.bikeinsuranceapp.service.IBikeService;

@SpringBootApplication
public class SpringBikeinsuranceappRestapiApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBikeinsuranceappRestapiApplication.class, args);
	}
	
	@Autowired
	IBikeService bikeService;

	@Override
	public void run(String... args) throws Exception {
		
		Category categorys = new Category("Fire", "Bangalore", "27.05.2022", "4:14pm");
		
		Set<Category> category= new HashSet<>(Arrays.asList(categorys));
		
		Plan plan1 =new Plan("1st person", 3500, 150000, 1, category);
		
		Set<Plan> plan= new HashSet<>(Arrays.asList(plan1));
		
		Insurance insurance = new Insurance(plan, "Acko", "bike", 3355, 1);
		
		Bike bike = new Bike("duke390","KA04KE0390","Sarva","KTM",insurance);
		
		
		bikeService.addBike(bike);
		
		
		
		
	}

}
