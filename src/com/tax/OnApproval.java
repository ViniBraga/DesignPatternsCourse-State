package com.tax;

import com.model.Budget;

public class OnApproval implements BudgetState {

	public void applyExtraDiscount(Budget budget) {
		budget.setValue(budget.getValue() - budget.getValue() * 0.05);
	}

	public void approve(Budget budget) {
		budget.setCurrentState(new Approved());
	}

	public void reprove(Budget budget) {
		budget.setCurrentState(new Reproved());
	}

	public void finalize(Budget budget) {
		throw new RuntimeException("On approval budget cannot go straight to the finalized state!");
	}
	
}
