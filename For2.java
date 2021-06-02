package domaci;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		/*
		 * For2: Napisati program koji ce na standardnom izlazu ispisati zbir prirodnih
		 * brojeva do n na sledeci nacin: 1) u zbir nece ulaziti brojevi deljivi brojem
		 * 5 2) ako se naidje na broj 13, sabiranje ce se zavrsiti i ispisace se zbir
		 * brojeva do tog trenutka.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite prirodan broj: ");
		int broj = sc.nextInt();
		int zbir = 0;

		for (int i = 1; i < broj; i++) {
			if (i % 5 == 0)
				continue;
			if (i == 13)
				break;
			zbir = zbir + i;

		}
		System.out.println("Zbir unetih brojeva je: " + zbir);
	}

}
