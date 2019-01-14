package com.tax;

import com.model.Budget;

public interface BudgetState {

	public void applyExtraDiscount(Budget budget);
	
	void approve(Budget budget);
	
	void reprove(Budget budget);
	
	void finalize(Budget budget);
	
}
