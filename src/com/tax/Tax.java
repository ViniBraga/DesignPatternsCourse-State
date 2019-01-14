package com.tax;
import com.model.Budget;

public abstract class Tax {

	protected Tax otherTax;
	
	public Tax(Tax otherTax) {
		this.otherTax = otherTax;
	}
	
	public Tax() {}
	
	public abstract double calculate(Budget budget);
	
	protected double calculateOtherTax(Budget budget) {
		if (otherTax == null) {
			return 0;
		}
		return otherTax.calculate(budget);
	}
	
}