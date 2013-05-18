package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.domain.Product;
import com.domain.ReflectionFactory;

public class ReflectionFactoryTest {

	
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testProductVip() {
		Product product = ReflectionFactory.getInstance().createProduct("1");
		assertEquals("vip", product.getCategory());
	}

	@Test
	public void testProductCommon() {
		Product product = ReflectionFactory.getInstance().createProduct("2");
		assertEquals("common", product.getCategory());
	}
}
