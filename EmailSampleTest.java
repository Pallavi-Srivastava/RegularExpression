package com.bridgelab.patthern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class EmailSampleTest 
{
		public void isValidEmail() {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter email address :");
			String mailAddress = input.nextLine();
			String regex = "^[A-Za-z0-9]+([-\\\\.\\\\+\\\\_][0-9A-Za-z]+)*[@][A-Za-z0-9]+.[a-zA-Z]{2,4}([\\\\.\\\\,][a-z]{2,3})?$";
			Pattern p = Pattern.compile(regex);

			Matcher m = p.matcher(mailAddress);
			System.out.println(mailAddress + " " + m.matches());
		}

		public static void main(String args[]) {
			EmailSampleTest obj = new EmailSampleTest();
			obj.isValidEmail();
		}
}
