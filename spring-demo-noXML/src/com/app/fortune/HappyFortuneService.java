package com.app.fortune;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "\nThis is HappyFortuneService \nand today is your lucky day!";
	}

}
