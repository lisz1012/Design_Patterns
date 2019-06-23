package com.lisz.templatemethod;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		CostContext context = new CostContext.CostContextBuilder()
							 .withSourceCountryCode("CN")
							 .withDestCountryCode("US")
							 .withNeedShipping(true)
							 .build();
		
		List<CostCalculator> list = new ArrayList<>();
		list.add(new ProductCostCalculator());
		list.add(new HoldingCostCalculator());
		list.add(new TransportationCostCalculator());
		list.add(new ImportCostCalculator());
		
		for (CostCalculator costCalculator : list) {
			costCalculator.enact(context);
		}
		
		System.out.println("Total cost is " + context.getTotalCost());
	}

}
