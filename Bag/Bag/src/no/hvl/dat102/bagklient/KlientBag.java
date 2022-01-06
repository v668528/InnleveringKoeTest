package no.hvl.dat102.bagklient;

import no.hvl.dat102.adt.BagADT;
import no.hvl.dat102.tabell.TabellBag;

public class KlientBag {
	static String personer[] = { "Berit", "Kamil", "Eirik", "Alina", "Marius", "Kurt", "Atle", "Paulina", "Siv",
			"Steinar" };

	public static void main(String[] args) {
		// Noe enkel og mangelfull testing
	
		BagADT<String> bag = new TabellBag<>(10);
		// Legger til
		for (int i = 0; i < personer.length; i++) {
			bag.leggTil(personer[i]);
			//System.out.println(((TabellBag<String>) bag).getBag()[i]); //feil!
		}
		
		System.out.println();
		Object[] nyPersoner = bag.tilTabell(); //Kan ikke stå String[] ...
		// Utskrift
		for (Object pers : nyPersoner) { // Kan ikke står String
			System.out.println("person " + pers);
		}

		// Fjerner personen i posisjon a fra samlingen som fins
		String resultat = null;
		String person = "Alina";
		if (!bag.erTom()) {
			resultat = (String) bag.fjern(person);
		}
		if (resultat != null) {
			System.out.println("\nPersonen " + person + " ble fjernet");
		} else {
			System.out.println("\nPersonenen " + person + " er ikke i samlingen");
		}
		//Bør også teste når personen ikke fins i samlingen
		
        // Test på inneholder
		person = "Ole";
		if (bag.inneholder(person)) {
			System.out.println("\nSamlingen inneholder " + person);
		} else {
			System.out.println("\nSamlingen inneholder ikke " + person);
		}
       // Bør også teste på en person som er i samlingen
		
		// Returnerer en full tabell (mangler en person fra original)
        System.out.println();
		nyPersoner = bag.tilTabell();
		for (Object pers : nyPersoner) {
			System.out.println("person " + pers);
		}
	}

}
