package com.drozdz.jnkins;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CodilityRiddleTest {

	CodilityRiddle iddle;

	@Before
	public void onBefore() {
		iddle= new CodilityRiddle();
	}

	@Test
	public void  basicTest() {
		String  response = iddle.solution("as?cd?");
		assertTrue(pastTest(response));
	}


	@Test
	public void  cornerTest() {
		String  response = iddle.solution("?");
		assertTrue(pastTest(response));

		response = iddle.solution("???????????");
		assertTrue(pastTest(response));

		response = iddle.solution("");
		assertTrue(pastTest(response));
		assertEquals(response, "");
	}


	private boolean pastTest(String  text) {
		char[] chars = text.toCharArray();
		for(int i=0;i<text.length()-1;i++) {
			if(chars[i]==chars[i+1]) {
				return false;
			}
		}
		return true;
	}
}
