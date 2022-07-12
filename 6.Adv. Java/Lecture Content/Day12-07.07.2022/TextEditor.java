package com.cdac.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("txtEdtr")
public class TextEditor {

	@Autowired //DI
	private SpellChecker sp;
	
	public void load(String document) {
		System.out.println("some code here for loading " + document);
		//from here we want to invoke the spell checker
		//SpellChecker sp = new SpellChecker();
		//but we want Spring to create the required object for us
		sp.checkSpellingMistakes(document);
	}
}
