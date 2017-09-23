package com.jodu.guice.usemethod.repository;

import com.jodu.guice.usemethod.domain.Fruit;
import com.jodu.guice.usemethod.domain.FruitParam;

public interface FruitDao {
	public Fruit selectFruitPrice(FruitParam param);
}
