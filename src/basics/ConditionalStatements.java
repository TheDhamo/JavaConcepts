/*Conditional Statements*/
package basics;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		/*
		 * if statement - checks for condition. If condition returns boolean
		 * true it executes the code within. For single statement within the if
		 * condition, curly braces is not required.
		 */
		String morningAffirmation = "Today is my day and it will be good";
		boolean wokeUpEarly = true;
		boolean hadGoodSleep = true;
		if (wokeUpEarly && hadGoodSleep) {
			System.out.println("Feeling Fresh.");
		}
		System.out.println("***************************************************************");

		/* nested if statement - if statements within if block */
		if (wokeUpEarly) {
			if (hadGoodSleep && morningAffirmation.startsWith("Today is my day")) {
				System.out.println("Feeling Fresh and Good.");
			}
		}
		System.out.println("***************************************************************");

		/* if else statement */
		wokeUpEarly = true;
		hadGoodSleep = false;
		if (wokeUpEarly && hadGoodSleep) {
			System.out.println("Feeling Fresh.");
		} else {
			System.out.println("Need to get more motivation.");
		}
		System.out.println("***************************************************************");

		/* if-else if-else statement */
		wokeUpEarly = true;
		hadGoodSleep = false;
		if (wokeUpEarly && hadGoodSleep) {
			System.out.println("Feeling Fresh.");
		} else if (wokeUpEarly && !hadGoodSleep) {
			System.out.println("Need to have good sleep.");
		} else {
			System.out.println("Need to get more motivation.");
		}
		System.out.println("***************************************************************");

		/*
		 * switch-case statement - works with some primitive data types (byte,
		 * short, int, char), enumerations/enums, String data type and Wrapper
		 * classes like Integer, Byte, Short, Character
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the month name:");
		String month = scanner.nextLine();
		switch (month.toLowerCase()) {
		case "january":
			System.out.println("You are in January.");
			break;
		case "february":
			System.out.println("You are in February.");
			break;
		case "march":
			System.out.println("You are in March.");
			break;
		case "april":
			System.out.println("You are in April.");
			break;
		case "may":
			System.out.println("You are in May.");
			break;
		case "june":
			System.out.println("You are in June.");
			break;
		case "july":
			System.out.println("You are in July.");
			break;
		case "august":
			System.out.println("You are in August.");
			break;
		case "september":
			System.out.println("You are in September.");
			break;
		case "october":
			System.out.println("You are in October.");
			break;
		case "november":
			System.out.println("You are in November.");
			break;
		case "december":
			System.out.println("You are in December.");
			break;
		default:
			System.out.println("You have not entered the correct month name.");
			break;
		}
		System.out.println("***************************************************************");

	}

}
