/*@Purpose :Given 3 string value find the maximum
 *Use String object and compareTo method to test the maximum number 
 * @file : Maximum Using Generics
 * @author : Akshay Kumar
 */
package com.blz.maximumgenerics;

public class Maximum {
	/*
	 * @Purpose : Creating Maximum Constructor using Parameterized Value x,y,z Using
	 * Generics With String And CompareTo
	 * 
	 * @param : Stream Function With String As Generics
	 */
	String x, y, z;

	public Maximum(String x, String y, String z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static String testMaximum(String x, String y, String z) {
		String max = x;
		if (y.compareTo(max) > 0)
			max = y;

		if (z.compareTo(max) > 0)
			max = z;
		printMax(x, y, z, max);
		return max;

	}

	public static void printMax(String x, String y, String z, String max) {
		System.out.printf("The maximum from string of %s , %s and %s is:- %s\n", x, y, z, max);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Check maximum of three variables");
		String x = "Apple", y = "Peach", z = "Banana";
		Maximum.testMaximum(x, y, z);
	}
}