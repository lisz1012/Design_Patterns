package com.lisz.templatemethod;

public abstract class AbstractCostCalculator implements CostCalculator {

	@Override
	public void enact(CostContext context) {
		if (isEnactable(context)) {
			enactImpl(context);
		}
	}

	public abstract void enactImpl(CostContext context);
}
