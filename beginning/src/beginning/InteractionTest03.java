package beginning;

import java.util.Scanner;

public class InteractionTest03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(
				"Idemo probati zbrajanje i dodavanje svega i svacega !");
		// input x
		System.out.print("Unesi vrijednost za 'x': ");
		int x = scanner.nextInt();
		// input y
		System.out.print("Unesi vrijednost za 'y': ");
		int y = scanner.nextInt();

		int sum = x + y;
		if (y != 0) {

			int sub = x / y;
			System.out.println("x = " + x);
			System.out.println("y = " + y);

			System.out.println("Zbroj vrijednosti je:" + sum);

			System.out.println("Podijeljena vrijednost je:" + sub);
		} else {
			System.out.println("Dijeljenje nije moguce sa nulom !");

		}
		scanner.close();

	}

}
