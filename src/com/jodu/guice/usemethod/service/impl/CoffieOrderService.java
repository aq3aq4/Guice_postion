package com.jodu.guice.usemethod.service.impl;

import com.jodu.guice.usemethod.service.OrderService;

public class CoffieOrderService implements OrderService {
	private final int price = 100;
	@Override
	public int order(int cnt) {
		return cnt * price;
	}

}
