package com.evergent.CoreJAVA.Sirichandana.Application4;

public abstract class GadgetsBaseClass {
	protected int gadgetCost=0;
	protected int complementaryGoodsCost=0;
	
	public abstract void AddComplementaryGoods(String type, int quantity);
	public abstract void AddComplementaryGoodsCost();
	
	public int CalculationTotalCost() {
		return gadgetCost=complementaryGoodsCost;
	}

}
