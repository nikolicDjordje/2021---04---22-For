package domaci;

import java.util.Scanner;

public class DomaciTrougaZvezdice {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj: ");
		int broj = sc.nextInt();
		

		for (int i = 1; i <= broj; i++) {
			for (int k = 1; k < i; k++)  {
				System.out.print(" ");
			}
			for (int j = broj; j >= i; j--) {
				System.out.print("*");
				}
		    
		     	System.out.println();
				}
	
				
			
		}

	}

