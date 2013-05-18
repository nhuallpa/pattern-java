package com.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.domain.NoobFactory;
import com.domain.Product;

public class NoobFactoryTest {
	private NoobFactory factory;
	@Before
	public void setUp(){
		factory = new NoobFactory();
	}
	@Test
	public void testCreateVipProduct() {
		Product product = factory.createProduct("1");
		assertEquals("vip", product.getCategory());
	}
	
	@Test
	public void testCreateCommonProduct() {
		Product product = factory.createProduct("2");
		assertEquals("common", product.getCategory());
	}
	
	@Test
	public void testCreateNoProduct() {
		Product product = factory.createProduct("-1");
		assertEquals("vip", product.getCategory());
	}

}
