package entitidades;

public class FixedPriceJob extends Job{
	
	private Double agreedBudget;

	public Double getAgreedBudget() {
		return agreedBudget;
	}

	public void setAgreedBudget(Double agreedBudget) {
		this.agreedBudget = agreedBudget;
	}
	
	@Override
	public double getCost() {
		return this.getAgreedBudget()+this.getInsuranceCost();
	}

}
