package com.domain;

public class NoobFactory {

	public Product createProduct(String productId) {
		
		if (productId.equals("1")) {
			return new VipProduct();
		} else if (productId.equals("2")) {
			return new CommonProduct();
		}
		
		return null;
	}

}
