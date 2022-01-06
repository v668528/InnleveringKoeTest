package no.hvl.dat102.bagklient;

import no.hvl.dat102.adt.BagADT;
import no.hvl.dat102.tabell.TabellBag;

public class Klient2TabellBag {
	static Person personer[] = { new Person("Berit", 4), new Person("Kamil", 2), new Person("Eirik", 1),
			new Person("Alina", 3), new Person("Marius", 5) };

	public static void main(String[] args) {
// Noe enkel og mangelfull testing

		BagADT<Person> bag = new TabellBag<>(5);
		//Legger til
		for (int i = 0; i < personer.length; i++) {
			bag.leggTil(personer[i]);
		}

		// Utskrift
		int antall = bag.antall();
		for (int i = 0; i < antall; i++) {
			// System.out.println(((TabellBag<Person>) bag).getBag()[i]); //feil

		}

		// Utskrift
		System.out.println();
		Object[] nyPersoner = bag.tilTabell();// Kan ikke stå String[]...
		// Utskrift
		for (Object pers : nyPersoner) { // Kan ikke stå Person
			System.out.println("person " + pers);
		}

// Fjerner personen i posisjon i = 2 fra samlingen som fins
		Person resultat = null;
		Person person = personer[2];
		if (!bag.erTom()) {
			resultat = (Person) bag.fjern(person);
		}
		if (resultat != null) {
			System.out.println("\nPersonen " + person + " ble fjernet");
		} else {
			System.out.println("\nPersonenen " + person + " er ikke i samlingen");
		}
//Bør også teste når personen ikke fins i samlingen

// Test på inneholder
		person = new Person("Berit", 4);
		if (bag.inneholder(person)) {
			System.out.println("\nSamlingen inneholder " + person);
		} else {
			System.out.println("\nSamlingen inneholder ikke " + person);
		}
// Bør også teste på en person som ikke er med i samlingen

// Returnerer en full tabell (mangler en person fra original)
		System.out.println();
		nyPersoner = bag.tilTabell();
		for (Object pers : nyPersoner) {
			System.out.println("person " + pers);
		}
	}

}
