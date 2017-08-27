package com.jodu.guice.usemethod.config;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.jodu.guice.usemethod.service.OrderService;
import com.jodu.guice.usemethod.service.impl.CoffieOrderService;
import com.jodu.guice.usemethod.service.impl.PizzaOrderService;

public class InjectConfig extends AbstractModule {
	/**
	 * 의존성 주입 설정 부분 
	 */
	@Override
	protected void configure() {
		bind(OrderService.class).annotatedWith(Names.named("pizza")).to(PizzaOrderService.class);
		bind(OrderService.class).annotatedWith(Names.named("coffie")).to(CoffieOrderService.class);
	}

}
