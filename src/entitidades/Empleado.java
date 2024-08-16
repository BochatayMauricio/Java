package entitidades;

import java.util.LinkedList;

public class Empleado {
	
	
	public double getReimbursement(LinkedList<Expenditure> expenditures,double reimbursementPorcentage) {
		double reimbursableCost=0.0;
		for(Expenditure ex: expenditures) {
			if(ex.isReimbursable()) {
				reimbursableCost+=ex.getAmount();
			}
		}
		return reimbursableCost*reimbursementPorcentage;
	}
}
