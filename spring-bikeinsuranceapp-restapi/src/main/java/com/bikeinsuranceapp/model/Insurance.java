package com.bikeinsuranceapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Insurance {
	
	@Id
	@GeneratedValue(generator = "pn_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "pn_gen", sequenceName = "plan_id")
	private Integer insuranceId;
	
	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	private Set<Plan> planList;
	
	private String insuranceName;
	
	private String type;
	
	private float amount;

	private int number;

	public Insurance() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Insurance(Set<Plan> planList, String insuranceName, String type, float amount, int number) {
		super();
		this.planList = planList;
		this.insuranceName = insuranceName;
		this.type = type;
		this.amount = amount;
		this.number = number;
	}

	public Integer getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(Integer insuranceId) {
		this.insuranceId = insuranceId;
	}

	public Set<Plan> getPlanList() {
		return planList;
	}

	public void setPlanList(Set<Plan> planList) {
		this.planList = planList;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Insurance [insuranceId=" + insuranceId + ", planList=" + planList + ", insuranceName=" + insuranceName
				+ ", type=" + type + ", amount=" + amount + ", number=" + number + "]";
	}

}
