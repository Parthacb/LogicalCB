package com.sample.datastructures.string;

import java.util.HashMap;
import java.util.HashSet;

public class MorseCode {

	public static void main(String args[]) {
			HashMap<Character, String> map = new HashMap<>();
	
			HashSet<String> hs = new HashSet<String>();
	
			String[] words = { "gin", "zen", "gig", "msg" };
	
			String[] codeForAlpahabets = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-",
					".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
					"--.." };
	
			char c = 97;
	
			for (String s : codeForAlpahabets) {
				map.put(c, s);
				c++;
			}
	
			String outPutString = null;
	
			for (String s1 : words) {
				for (int i = 0; i < s1.length(); i++) {
					outPutString += map.get(s1.charAt(i));
				}
	
				hs.add(outPutString);
				outPutString = null;
			}
	
			System.out.println(hs.size());

	}

}
