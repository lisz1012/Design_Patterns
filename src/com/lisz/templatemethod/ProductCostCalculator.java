package com.lisz.templatemethod;

public class ProductCostCalculator extends AbstractCostCalculator {

	@Override
	public boolean isEnactable(CostContext context) {
		return true;
	}

	@Override
	public void enactImpl(CostContext context) {
		context.setProductCost(context.getProductCost() + 1000);
	}

}
