package com.simpli;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {

	public static void main(String[] args) {
		String str = "Regular ERRRxpressions CAT DOg";
		
		// check for all lowercase letters
		// String patternStr = "[a-z]+";
		
		Pattern pattern = Pattern.compile("[A-Z5-9]+");
		Matcher matcher = pattern.matcher(str);
		
		//System.out.println(" Matcher found something match? : "+ matcher.find());
		
		while(matcher.find()) {
			int start = matcher.start();
			int end = matcher.end();
			
			System.out.println(str.substring(start,end));
			
			System.out.println("Found a match!");
		};
		
		
		String biodata = "This is my mob 7544353007. Also another 5674676544 Note it down";
		Pattern pattern1 = Pattern.compile("[0-9]{10}");
		Matcher matcher2 = pattern1.matcher(biodata);
		while(matcher2.find()) {
			System.out.println("\n Found a mobile number in the biodata!");
			
			int start = matcher2.start();
			int end = matcher2.end();
			
			System.out.println(biodata.substring(start,end));
		}

	}

}
