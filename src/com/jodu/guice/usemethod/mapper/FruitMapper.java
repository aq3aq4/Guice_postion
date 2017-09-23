package com.jodu.guice.usemethod.mapper;

import org.apache.ibatis.annotations.Select;

import com.jodu.guice.usemethod.domain.Fruit;
import com.jodu.guice.usemethod.domain.FruitParam;

public interface FruitMapper {
	@Select("SELECT price"
			+ " FROM fruit_price"
			+ " WHERE fruit_name = #{fruitName}")
	public Fruit selectFruitPrice(FruitParam param);
}
