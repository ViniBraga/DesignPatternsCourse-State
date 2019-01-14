package com.tax;

import com.model.Budget;

public class Finalized implements BudgetState{

	public void applyExtraDiscount(Budget budget) {
		throw new RuntimeException("Finalized budget cannot receive extra discount!");
	}

	public void approve(Budget budget) {
		throw new RuntimeException("Budget is finalized!");
	}

	public void reprove(Budget budget) {
		throw new RuntimeException("Budget is finalized!");
	}

	public void finalize(Budget budget) {
		throw new RuntimeException("Budget is finalized!");
	}

}
