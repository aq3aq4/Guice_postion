package com.jodu.guice.usemethod;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.jodu.guice.usemethod.app.UserApplication;
import com.jodu.guice.usemethod.config.InjectConfig;

public class UserMethodMain {
	
	public static void main(String[] args) {
		Injector ij = Guice.createInjector(new InjectConfig());
		UserApplication ua = ij.getInstance(UserApplication.class);
		
		ua.use();
		/** We must not use under case*/
//		UserApplication ua = new UserApplication();
//		ua.use();
	}
}
