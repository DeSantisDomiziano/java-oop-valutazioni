package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Studente[] studenti = new Studente[20];
		Random rnd = new Random();
		
		for(int i = 1; i <= studenti.length; i++) {
			studenti[i - 1] = new Studente(i, rnd.nextInt(0, 101), rnd.nextDouble(0, 5.1));
			System.out.println(studenti[i - 1].id + " | " + studenti[i - 1].assenze + " | " + String.format("%02f", studenti[i - 1].avg) + "\n-------------------");
		}
	}
} 
