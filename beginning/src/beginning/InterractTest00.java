package beginning;

import java.util.Scanner;

public class InterractTest00 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = scanner.nextInt();
		System.out.println("You entered number: " + num);
		System.out.println("Enter your name: ");
		String name = scanner.next();
		System.out.println("Your name is: " + name);

		scanner.close();
	}

}
