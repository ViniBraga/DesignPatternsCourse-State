package com;

import com.model.Budget;

public class ExtraDiscountTest {

	public static void main(String[] args) {

		Budget renovation = new Budget(500.0);
		
		renovation.applyExtraDiscount();
		
		System.out.println(renovation.getValue());
		
		renovation.approve();
		
		renovation.applyExtraDiscount();
		
		System.out.println(renovation.getValue());
		
		renovation.finalize();
		
		renovation.applyExtraDiscount();
	}

}
