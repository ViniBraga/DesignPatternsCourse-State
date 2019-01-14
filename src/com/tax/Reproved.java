package com.tax;

import com.model.Budget;

public class Reproved implements BudgetState{
	
	public void applyExtraDiscount(Budget budget) {
		throw new RuntimeException("Reproved budget cannot receive extra discount!");
	}

	public void approve(Budget budget) {
		throw new RuntimeException("Budget is still repproved!");
	}

	public void reprove(Budget budget) {
		throw new RuntimeException("Budget is still repproved!");
		
	}

	public void finalize(Budget budget) {
		budget.setCurrentState(new Finalized());
	}

}
