package com.tp;

import java.util.Random;
import java.util.Scanner;

public class TP2 {

	public static void main(String[] args) {
		System.out.print("\nSum :" + sum(new int[] { 1, 2, 3, 4, 5 }));
		System.out.print("\nMin :" + min(new int[] { 7, 22, 3, 9, 15 }));
		ChercherNumero();
	}

	public static int sum(int[] tab) {
		int sum = 0;
		for (int i = 0; i < tab.length; i++) {
			sum += tab[i];
		}
		return sum;
	}

	public static int min(int[] tab) {
		int min = tab[0];
		for (int i = 0; i < tab.length; i++) {
			if (min > tab[i]) {
				min = tab[i];
			}
		}

		return min;
	}

	public static void ChercherNumero() {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int randomNum = random.nextInt(20);
		System.out.println("\n*********************");

		int coups = 0;
		boolean isFound = false;

		while (!isFound) {

			System.out.print("Enter a number: ");
			int input = sc.nextInt();
			coups++;
			if (input < randomNum) {
				System.out.println("smaller!");
			} else if (input > randomNum) {
				System.out.println("bigger!");
			} else {
				isFound = true;
				System.out.println("Well done, you found the right number in " + coups + " moves!");
			}
		}

		sc.close();
	}

}
