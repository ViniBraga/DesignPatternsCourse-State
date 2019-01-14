package com.tax;

import com.model.Budget;

public class Approved implements BudgetState{
	
	public void applyExtraDiscount(Budget budget) {
		budget.setValue(budget.getValue() - budget.getValue() * 0.02);
	}

	public void approve(Budget budget) {
		throw new RuntimeException("Budget is still approved!");
	}

	public void reprove(Budget budget) {
		throw new RuntimeException("Budget approved cannot go to the reproved state!");
	}

	public void finalize(Budget budget) {
		budget.setCurrentState(new Finalized());
	}
	
}
