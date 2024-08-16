package entitidades;

public class HourlyRatedJob extends Job{
	
	private Contratist contrat;

	public Contratist getContrat() {
		return contrat;
	}

	public void setContrat(Contratist contrat) {
		this.contrat = contrat;
	}

	@Override
	public double getCost() {
		return this.getEstimatedHours()*(this.getContrat().getHourlyRate())+this.getInsuranceCost();
	}
	
}
