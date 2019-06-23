package com.lisz.templatemethod;

public class HoldingCostCalculator extends AbstractCostCalculator {

	@Override
	public boolean isEnactable(CostContext context) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void enactImpl(CostContext context) {
		context.setHoldingCost(context.getProductCost() * 0.01);
	}

}
