package com.spring.demo;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennnisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
