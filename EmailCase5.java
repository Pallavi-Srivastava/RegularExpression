package com.bridgelab.patthern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class EmailCase5 {
	public void isValidEmail() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter email address :");
		String mailAddress = input.nextLine();
		String regex = "^[A-Za-z0-9+_.+-]+@{1}[A-Za-z]{1,10}[.]{1}[a-zA-Z]{1,6}[.]*[a-zA-Z]{2}$";
		Pattern p = Pattern.compile(regex);

		Matcher m = p.matcher(mailAddress);
		System.out.println(mailAddress + " " + m.matches());
	}

	public static void main(String args[]) {
		EmailCase5 obj = new EmailCase5();
		obj.isValidEmail();
	}
}