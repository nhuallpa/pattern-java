package com.domain;

import java.util.HashMap;
import java.util.Map;
import com.domain.*;

public class ReflectionFactory {
	private Map<String, Product> m_registeredProducts = null;
	private static ReflectionFactory instance = null;
	private ReflectionFactory() {
		m_registeredProducts = new HashMap<String, Product>();
	}
	public static ReflectionFactory getInstance() {
		if (instance == null) {
			instance = new ReflectionFactory();
		}
		return instance;
	}
	public Product createProduct(String productId) {
		return m_registeredProducts.get(productId).createProduct();
	}
	public void registerProduct(String productId, Product p) {
		m_registeredProducts.put(productId, p);
	}
}
