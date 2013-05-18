package com.domain;

public class VipProduct extends Product {

	static
	{
		ReflectionFactory.getInstance().registerProduct("1", new VipProduct());
	}
	
	@Override
	public Object getCategory() {
		return "vip";
	}

	@Override
	public Product createProduct() {
		return new VipProduct();
	}
}
