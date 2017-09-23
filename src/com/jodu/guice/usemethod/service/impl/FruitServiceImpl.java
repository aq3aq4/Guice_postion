package com.jodu.guice.usemethod.service.impl;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.jodu.guice.usemethod.domain.Fruit;
import com.jodu.guice.usemethod.domain.FruitParam;
import com.jodu.guice.usemethod.repository.FruitDao;
import com.jodu.guice.usemethod.service.FruitService;

@Singleton
public class FruitServiceImpl implements FruitService{
	@Inject private FruitDao fd;
	
	@Override
	public Fruit retrieveFruitPrice(FruitParam param) {
		return fd.selectFruitPrice(param);
	}
	
}
