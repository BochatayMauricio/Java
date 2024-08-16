package entitidades;

import java.util.ArrayList;

public class BuildingSite {
	private int id;
	private String address;
	private ArrayList<Job> jobs = new ArrayList<>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Double getOveralBudget() {
		Double cost=0.0;
		for(Job j:jobs) {
			cost+=j.getCost();
		}
		return cost;
	}
	
	
}
