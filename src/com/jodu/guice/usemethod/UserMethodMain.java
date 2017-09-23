package com.jodu.guice.usemethod;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.jodu.guice.usemethod.app.UserApplication;
import com.jodu.guice.usemethod.config.InjectConfig;
import com.jodu.guice.usemethod.config.MyBatisConfigModule;

public class UserMethodMain {
	/** main */
	public static void main(String[] args) {
		Injector ij = Guice.createInjector(new InjectConfig(), new MyBatisConfigModule());
		UserApplication ua = ij.getInstance(UserApplication.class);
		
		ua.use();
		/** We must not use under case*/
//		UserApplication ua = new UserApplication();
//		ua.use();
		
		
		//Blogging no.2
		System.out.println("사과 구입 가격 : " + ua.calcPrice("apple", 5));
		System.out.println("바나나 구입 가격 : " + ua.calcPrice("banana", 10));
	}
}
