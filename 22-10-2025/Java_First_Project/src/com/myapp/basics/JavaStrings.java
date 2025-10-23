package com.myapp.basics;

public class JavaStrings {

	public static void main(String[] args) {
		String str = "hello..!";

		System.out.println(str.length());

		// Lower Case:
		System.out.println(str.toLowerCase());

		// Upper Case:
		System.out.println(str.toUpperCase());

		// indexOf() -> returns the index(the position) of the first occurence of
		// specified text in a string(include whitespace)

		String txt = "Please locate where 'locate' occurs!";
		System.out.println(txt.indexOf("locate"));

		// charAt() -> method to access a character at a specific index of the string
		System.out.println(txt.charAt(12));

		// Comparing Strings
		// 1. equals() -> compares the actual content(returns true or false)
		String str1 = "hello";
		String str2 = "hello";

		System.out.println(str1.equals(str2));

		// 2. '==' operator:
		// - For objects: checks whether the references point to the same memory address.
		// - For primitives: compares the actual values.
		// Example with strings:
		System.out.println(str1 == str2); // true because string literals with the same value are stored in the string
											// pool, so they reference the same object.

		// trim() -> removing the whitespaces
		String str3="  Hello World   ";
		System.out.println(str3);
		System.out.println(str3.trim());
	}

}
