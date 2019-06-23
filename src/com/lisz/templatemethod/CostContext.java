package com.lisz.templatemethod;

public class CostContext {
	private double productCost;
	private double holdingCost;
	private double transportationCost;
	private String sourceCountryCode;
	private String destCountryCode;
	private boolean needShipping;
	private double duty;
	
	public static class CostContextBuilder {
		private CostContext context = new CostContext();
		
		public CostContextBuilder withProductCost(double productCost) {
			context.productCost = productCost;
			return this;
		}
		
		public CostContextBuilder withHoldingCost(double holdingCost) {
			context.holdingCost = holdingCost;
			return this;
		}
		
		public CostContextBuilder withTransportationCost(double transportationCost) {
			context.transportationCost = transportationCost;
			return this;
		}
		
		public CostContextBuilder withSourceCountryCode(String sourceCountryCode) {
			context.sourceCountryCode = sourceCountryCode;
			return this;
		}
		
		public CostContextBuilder withDestCountryCode(String destCountryCode) {
			context.destCountryCode = destCountryCode;
			return this;
		}
		
		public CostContextBuilder withNeedShipping(boolean needShipping) {
			context.needShipping = needShipping;
			return this;
		}
		
		public CostContextBuilder withDuty(double duty) {
			context.duty = duty;
			return this;
		}
		
		public CostContext build() {
			return context;
		}
	}

	public double getProductCost() {
		return productCost;
	}

	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}

	public double getHoldingCost() {
		return holdingCost;
	}

	public void setHoldingCost(double holdingCost) {
		this.holdingCost = holdingCost;
	}

	public double getTransportationCost() {
		return transportationCost;
	}

	public void setTransportationCost(double transportationCost) {
		this.transportationCost = transportationCost;
	}

	public String getSourceCountryCode() {
		return sourceCountryCode;
	}

	public void setSourceCountryCode(String sourceCountryCode) {
		this.sourceCountryCode = sourceCountryCode;
	}

	public String getDestCountryCode() {
		return destCountryCode;
	}

	public void setDestCountryCode(String destCountryCode) {
		this.destCountryCode = destCountryCode;
	}

	public boolean isNeedShipping() {
		return needShipping;
	}

	public void setNeedShipping(boolean needShipping) {
		this.needShipping = needShipping;
	}
	
	public double getDuty() {
		return duty;
	}

	public void setDuty(double duty) {
		this.duty = duty;
	}
	
	public double getTotalCost() {
		return productCost + holdingCost + transportationCost + duty;
	}
}
