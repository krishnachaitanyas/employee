package com.java.web.service.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeModel {

	private String id;
	private String name;
	private List<Integer> someValues = new ArrayList<Integer>();
	
	public EmployeeModel(){
		
	}
	
	
	public EmployeeModel(String id, String name, List<Integer> someValues) {
		super();
		this.id = id;
		this.name = name;
		this.someValues = someValues;
	}
	public List<Integer> addValue(Integer value){
		this.someValues.add(value);
		return this.someValues;
		
	}
	public List<Integer> getSomeValues() {
		return this.someValues;
	}
	public void setSomeValues(List<Integer> someValues) {
		this.someValues = someValues;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "EmployeeModel [id=" + id + ", name=" + name + "]";
	}
	
	
}
