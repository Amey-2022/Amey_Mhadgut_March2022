package com.cdac.component;

import org.springframework.stereotype.Component;

@Component("splChkr")
public class SpellChecker {
	
	public void checkSpellingMistake(String document) {
		System.out.println("some code here for checking spelling mistakes in " + document);
	}
	
}
