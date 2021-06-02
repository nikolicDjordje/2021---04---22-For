package domaci;

import java.util.Scanner;

public class For1 {

	public static void main(String[] args) {
		/*
		 * For1: Napisati program koji omoguciti korisniku da unosi recii, sve dok ne
		 * unese rec “stop”, nebitno da li je koristio mala, velika slova ili
		 * kombinaciju. Mozete pri radu koristiti petlju po izboru.
		 */

		Scanner sc = new Scanner(System.in);

		String s1 = "STOP";
		String s2;
		String s3;

		do {
			System.out.println("Unesite zeljenu rec");
			s2 = sc.nextLine();
			s3 = s2.toUpperCase();
		} while (!s1.equals(s3));

		System.out.println("Dosta je!");
	}
}
