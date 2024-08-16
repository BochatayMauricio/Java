package entitidades;

import java.util.Date;


public class Expenditure {

	private boolean reimbursable;
	private Double amount;
	private Date date;
	
	public boolean isReimbursable() {
		return this.reimbursable;
	}
	
	public void setReimbursable(boolean reimbursable) {
		this.reimbursable = reimbursable;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
}
