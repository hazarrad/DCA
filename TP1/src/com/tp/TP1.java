package com.tp;

public class TP1 {

	public static void main(String[] args) {

		dissinerLigne(3, 5, 2);
		System.out.print("\n nbValuesImpairs :" + nbValuesImpairs(new int[] { 18, -7, 9, 0, 3, 33 }));

	}

	public static void dissinerLigne(int n_repeter, int n_tirer, int n_espace) {

		for (int i = 0; i < n_repeter; i++) {
			for (int j = 0; j < n_tirer; j++) {
				System.out.print("-");
			}
			for (int j2 = 0; j2 < n_espace; j2++) {
				System.out.print(" ");
			}
		}

	}

	public static int nbValuesImpairs(int[] tab) {

		int count = 0;
		for (int i = 0; i < tab.length; i++) {
			if (tab[i] % 2 != 0) {
				count++;
			}
		}

		return count;
	}

}
