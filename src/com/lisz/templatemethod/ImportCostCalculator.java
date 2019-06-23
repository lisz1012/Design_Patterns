package com.lisz.templatemethod;

public class ImportCostCalculator extends AbstractCostCalculator {

	@Override
	public boolean isEnactable(CostContext context) {
		return !context.getSourceCountryCode().equals(context.getDestCountryCode());
	}

	@Override
	public void enactImpl(CostContext context) {
		context.setDuty(context.getProductCost() * 0.25);
	}

}
