package com.bridgelab.patthern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class EmailCase2 {
	public void isValidEmail() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter email address :");
		String mailAddress = input.nextLine();
		String regex = "^[A-Za-z0-9+_.]+@{1}[A-Za-z]{10}[.]*[a-zA-Z]*[.]*[a-zA-Z]*$";
		Pattern p = Pattern.compile(regex);

		Matcher m = p.matcher(mailAddress);
		System.out.println(mailAddress + " " + m.matches());
	}

	public static void main(String args[]) {
		EmailCase2 obj = new EmailCase2();
		obj.isValidEmail();
	}
}