package entitidades;

public class QuantityRatedJob extends Job{
	
	private Double quantity;

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public double getCost() {
		return this.getQuantity()*(this.getType().getQuantityRate())+this.getInsuranceCost();
	}

}
