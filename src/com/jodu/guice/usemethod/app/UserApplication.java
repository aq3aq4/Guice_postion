package com.jodu.guice.usemethod.app;

import javax.inject.Inject;
import javax.inject.Named;

import com.jodu.guice.usemethod.service.OrderService;

public class UserApplication {
	/**
	 * Inject와 Named를 이용한 의존성 주입!!
	 */
	@Inject @Named("pizza") private OrderService pOs;
	@Inject @Named("coffie") private OrderService cOs;
	
	public void use() {
		int totalPrice = pOs.order(10);
		int coffiePrice = cOs.order(10);
		System.out.print(pOs.getClass().getName() + ", price : " + totalPrice + "  ");
		System.out.println(cOs.getClass().getName() + ", price : " + coffiePrice);
	}
}
