package com.jodu.guice.usemethod.config;

import java.util.Properties;

public interface DBInfoSettable {
	default public Properties createProperties(String schema) {
		final Properties myBatisProperties = new Properties();
		
		myBatisProperties.setProperty("mybatis.environment.id", schema);
		myBatisProperties.setProperty("JDBC.driver", "com.mysql.jdbc.Driver");
		myBatisProperties.setProperty("JDBC.url", "jdbc:mysql://localhost:3306/"+ schema + "?useUnicode=true&characterEncoding=UTF8");
	    myBatisProperties.setProperty("JDBC.username", "root");
	    myBatisProperties.setProperty("JDBC.password", "");
	    myBatisProperties.setProperty("JDBC.autoCommit", "false");
		
		return myBatisProperties;
	}
}
