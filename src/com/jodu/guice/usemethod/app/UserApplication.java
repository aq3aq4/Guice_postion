package com.jodu.guice.usemethod.app;

import javax.inject.Inject;
import javax.inject.Named;

import com.jodu.guice.usemethod.domain.Fruit;
import com.jodu.guice.usemethod.domain.FruitParam;
import com.jodu.guice.usemethod.service.FruitService;
import com.jodu.guice.usemethod.service.OrderService;

public class UserApplication {
	/**
	 * Inject와 Named를 이용한 의존성 주입!!
	 */
	@Inject @Named("pizza") private OrderService pOs;
	@Inject @Named("coffie") private OrderService cOs;
	@Inject @Named("fruitService")private FruitService fs;
	
	public void use() {
		int totalPrice = pOs.order(10);
		int coffiePrice = cOs.order(10);
		System.out.print(pOs.getClass().getName() + ", price : " + totalPrice + "  ");
		System.out.println(cOs.getClass().getName() + ", price : " + coffiePrice);
	}
	
	public int calcPrice(String fruitName, int cnt) {
		FruitParam fp = new FruitParam();
		fp.setFruitName(fruitName);
		
		Fruit f = fs.retrieveFruitPrice(fp);
		
		int price = f.getPrice();
		
		return price * cnt;
	}
}
