package com.jodu.guice.usemethod.service.impl;

import javax.inject.Singleton;

import com.jodu.guice.usemethod.service.OrderService;

@Singleton
public class PizzaOrderService implements OrderService{
	private final int price = 1000;
	
	@Override
	public int order(int cnt) {
		return price * cnt;
	}
	
}
