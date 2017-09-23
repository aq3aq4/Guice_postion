package com.jodu.guice.usemethod.config;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.guice.MyBatisModule;
import org.mybatis.guice.datasource.builtin.PooledDataSourceProvider;
import org.mybatis.guice.session.SqlSessionManagerProvider;

import com.google.inject.PrivateModule;
import com.google.inject.Scopes;
import com.google.inject.name.Names;
import com.jodu.guice.usemethod.mapper.FruitMapper;

import static com.google.inject.name.Names.bindProperties;

/**
 * PrivateModule을 상속하여 MybatisConfigModule을 생성한다. 
 * @author birdhead
 *
 */
public class MyBatisConfigModule extends PrivateModule implements DBInfoSettable{
	
	@Override
	protected void configure() {
		install(new MyBatisModule() {
			@Override
			protected void initialize() {
				bindDataSourceProviderType(PooledDataSourceProvider.class);
				bindTransactionFactoryType(JdbcTransactionFactory.class);
				
				/**
				 * 사용할 쿼리가 있는 MapperInterface 정의
				 */
				addMapperClass(FruitMapper.class);
			}
		});
		
		bindProperties(this.binder(), createProperties("test"));
		
		bind(SqlSession.class)
			.annotatedWith(Names.named("fruitDB"))
			.toProvider(SqlSessionManagerProvider.class)
			.in(Scopes.SINGLETON);
		expose(SqlSession.class).annotatedWith(Names.named("fruitDB"));
	}
	
}