package beginning;

import java.util.Scanner;

public class GameExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input one number: ");
		int number = scanner.nextInt();
		System.out.println("You input is number: " + number);
		scanner.close();

	}

}
