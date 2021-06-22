package com.spring.demo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	//Create an array of strings
	String[] data = {
			"Beware of wolfs!",
			"Second fortune",
			"Another fortune"
	};
	@Override
	public String getDailyFortune() {
		//Pick random string from array
		Random dice = new Random();
		return data[dice.nextInt(data.length)];
	}

}
