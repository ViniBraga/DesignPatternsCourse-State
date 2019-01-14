package com.model;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.tax.BudgetState;
import com.tax.OnApproval;

public class Budget {

	protected double value;
	private final List<Item> items;
	
	protected BudgetState currentState;
	
	public Budget(double value) {
		this.value = value;
		this.items = new ArrayList<>();
		this.currentState = new OnApproval();
	}

	public double getValue() {
		return value;
	}
	
	public void setValue(double value) {
		this.value = value;
	}

	public void addItem(Item item) {
		items.add(item);
	}
	
	public List<Item> getItems() {
		return Collections.unmodifiableList(items);
	}

	public void applyExtraDiscount() {
		currentState.applyExtraDiscount(this);
	}
	
	public BudgetState getCurrentState() {
		return currentState;
	}
	
	public void setCurrentState(BudgetState currentState) {
		this.currentState = currentState;
	}
	
	public void approve() {
		this.currentState.approve(this);
	}
	
	public void reprove() {
		this.currentState.reprove(this);
	}
	
	public void finalize() {
		this.currentState.finalize(this);
	}

}