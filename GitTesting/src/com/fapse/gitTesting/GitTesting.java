package com.fapse.gitTesting;

public class GitTesting {

	public static void main(String[] args) {
		//so many comments...
		//Another comment!
		System.out.println("Hello Git, my darling!");
		//Hey it's obviously working!
		System.out.println("This is my first branch!");
		//Now the merged branch is improved further
		System.out.println("This is the merged branch.");
		boolean test = true;
		if (test) {
			System.out.println("Hello again!");
		} else {
			System.out.println("Test not true!");
		}
		//more comments...
		//new night, new comment!
		System.out.println("New day, new hope!");
		//A comment added on GitHub.com!
		//Here comes the new switch-statement:
		String weekday = "Friday";
		switch(weekday) {
		case "Monday":
			System.out.println("Hey, it's monday!");
			break;
		case "Friday":
			System.out.println("TGIF!");
			break;
		default:
			System.out.println("Whatever!");		
		}
		//Finally, this is beginning to make sense!
		//Now, the really hard do-while demo code:
		int n = 1;
		do {
			System.out.println("Yipee, no. " + n++);
		} while (n <= 5);
	}
}