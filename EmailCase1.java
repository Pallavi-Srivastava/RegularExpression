package com.bridgelab.patthern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class EmailCase1 {
	public void isValidEmail() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter email address :");
		String mailAddress = input.nextLine();
		String regex = "^[A-Za-z0-9+_.]+@[A-Za-z0-9+_.]+$";
		Pattern p = Pattern.compile(regex);

		Matcher m = p.matcher(mailAddress);
		System.out.println(mailAddress + " " + m.matches());
	}

	public static void main(String args[]) {
		EmailCase1 obj = new EmailCase1();
		obj.isValidEmail();
	}
}