package com.drozdz.jnkins;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodilityRiddle {
	public String solution(String riddle) {

	      char[] chars = riddle.toCharArray();
	      Pattern pattern = Pattern.compile("\\?{1}");
	      Matcher matcher = pattern.matcher(riddle);
	      int poz;
	      while (matcher.find()) {
	         poz = matcher.start();
	         char before = 0;
	         char after = 0;
	         if (poz > 0) {
	            before = chars[poz - 1];
	         }
	         if(poz<riddle.length()-1) {
	            after =chars[poz+1];
	         }


	         boolean find = false;
	         char c = 0;
	         while(!find) {
	            Random rnd = new Random();
	            c = (char) (rnd.nextInt(26) + 'a');
	            if(c !=  before && c!=after) {
	               find = true;
	            }
	         }

	         chars[poz]=c;
	      }

	      return new String(chars);
	   }
}
