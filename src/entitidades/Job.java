package entitidades;

public abstract class Job {
	private int id;
	private String name;
	private String description;
	private Double estimatedHours;
	private Double insuranceCost;
	
	private WorkType type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getEstimatedHours() {
		return estimatedHours;
	}
	public void setEstimatedHours(Double estimatedHours) {
		this.estimatedHours = estimatedHours;
	}
	public Double getInsuranceCost() {
		return insuranceCost;
	}
	public void setInsuranceCost(Double insuranceCost) {
		this.insuranceCost = insuranceCost;
	}
	public WorkType getType() {
		return type;
	}
	public void setType(WorkType type) {
		this.type = type;
	}
	
	public abstract double getCost();
	
}
