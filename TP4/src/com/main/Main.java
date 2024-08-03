package com.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

	public static void main(String[] args) {

		try {
			FileReader fr = new FileReader("file/entree.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("file/sortie.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			while (br.ready()) {
				System.out.println("br ready");
				bw.write(br.readLine());
				System.out.println("bw closed");
			}
			bw.close();
			br.close();
			System.out.println("br closed");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
