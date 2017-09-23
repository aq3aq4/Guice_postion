package com.jodu.guice.usemethod.repository.impl;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import org.apache.ibatis.session.SqlSession;

import com.jodu.guice.usemethod.domain.Fruit;
import com.jodu.guice.usemethod.domain.FruitParam;
import com.jodu.guice.usemethod.mapper.FruitMapper;
import com.jodu.guice.usemethod.repository.FruitDao;


@Singleton
public class FruitDaoImpl implements FruitDao {
	private static final String namespace = FruitMapper.class.getName() + ".";
	@Inject @Named("fruitDB")
	private SqlSession sqlSession;
	
	@Override
	public Fruit selectFruitPrice(FruitParam param) {
		return sqlSession.selectOne(namespace + "selectFruitPrice", param);
	}
}