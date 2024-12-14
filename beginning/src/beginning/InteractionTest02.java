package beginning;

import java.util.Scanner;

public class InteractionTest02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = scanner.next();
		System.out.println("Please enter your age: ");
		int age = scanner.nextInt();
		System.out.println("Your name is " + name + " and you are " + age + " years old.");
		scanner.close();
	}

}
