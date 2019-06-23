package com.lisz.templatemethod;

public interface CostCalculator {
	boolean isEnactable(CostContext context);
	void enact(CostContext context);
}
