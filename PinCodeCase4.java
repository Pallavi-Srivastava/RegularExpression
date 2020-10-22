package com.bridgelab.patthern;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeCase4 {
	public void isValidPincode() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the 6 digit pincode :");
		String zipcode = input.nextLine();
		String regex = "^[0-9]{3}[: :]{1}[0-9]{3}$|[0-9]{6}$";// 789 987
		Pattern p = Pattern.compile(regex);// Compile the regex Pattern

		Matcher m = p.matcher(zipcode);// match with given value
		System.out.println(zipcode + " " + m.matches());
	}

	public static void main(String args[]) {
		PinCodeCase4 pin = new PinCodeCase4();
		pin.isValidPincode();
	}
}