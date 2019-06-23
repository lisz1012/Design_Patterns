package com.lisz.templatemethod;

public class TransportationCostCalculator extends AbstractCostCalculator {

	@Override
	public boolean isEnactable(CostContext context) {
		return context.isNeedShipping();
	}

	@Override
	public void enactImpl(CostContext context) {
		context.setTransportationCost(context.getProductCost() * 0.2);
	}

}
