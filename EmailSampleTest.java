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
			String regex="^[a-z]{3}[-.+]*[0-9]*[@]{1}[a-z]*[0-9]*[.]{1}[a-z]{1,3}[.]*[a-z]*[,]*";
			Pattern p = Pattern.compile(regex);

			Matcher m = p.matcher(mailAddress);
			System.out.println(mailAddress + " " + m.matches());
		}

		public static void main(String args[]) {
			EmailSampleTest obj = new EmailSampleTest();
			obj.isValidEmail();
		}
}
