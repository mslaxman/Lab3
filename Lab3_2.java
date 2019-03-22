package com;

import java.util.Arrays;

public class Lab3_2 {
	
	public String[] sortS(String[] s) {

		for(String s1:s) {
			s1=s1.toLowerCase();
		}
		Arrays.sort(s);
		int b=s.length;
		for(int i=0;i<b/2;i++) {
			s[i]=s[i].toUpperCase();
		}		
		return s;
	}
	public static void main(String[] as) {
		String[] fruits = new String[] {"Pineapple","Apple", "Orange", "Banana"}; 
		Lab3_2 e=new Lab3_2();
		fruits=e.sortS(fruits);
		for(String s1:fruits) {
			System.out.println(s1);
		}
	}
}
