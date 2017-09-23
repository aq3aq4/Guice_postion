package com.jodu.guice.usemethod.service;

import com.jodu.guice.usemethod.domain.Fruit;
import com.jodu.guice.usemethod.domain.FruitParam;

public interface FruitService {
	public Fruit retrieveFruitPrice(FruitParam param);
}
