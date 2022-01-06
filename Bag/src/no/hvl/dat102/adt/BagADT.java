package no.hvl.dat102.adt;

import no.hvl.dat102.exceptions.EmptyCollectionException;

public interface BagADT<T>{

		/* Modifisert noe i forhold til boken med at vi ikke har begrensing på størrelsen.
		 * En bag er en samling av elementer uten noen spesiell rekkefølge.
		 * Disse objektene er av samme type. En bag kan inneholde flere objekter av samme
		 * tilstand (samme data) . Eks: Hvis bag'en inneholder ulike varer, så kan den
		 * samme varen finnes flere ganger i bag'en (flere kopier).
		 *	*/
		/**
		 * Legger til et nytt element.
		 * 
		 * @param el er objektet som blir lagt til.
		 */
		public void leggTil(T el);

		/**
		 * Fjerner en forekomst av el hvis den eksisterer.
		 * 
		 * @param el er objektet som fjernes hvis det eksisterer
		 * @return el er elmentet som fjernes hvis det fins ellers null-referanse
		 * @exception EmptyCollectionException når samlingen er tom
		 */
		public T fjern(T el);

		/**
		 * Teller antall ganger el fins.
		 * 
		 * @param el er objektet som fins
		 * @return Antall ganger el fins i bag'en.
		 */
		// TODO public int hyppighet(T el);

		/**
		 * Undersøker om bag'en inneholder el.
		 * 
		 * @param el er objektet det søkes etter
		 * @return sann hvis bag'en inneholder el, ellers usann
		 */
		public boolean inneholder(T el);

		/**
		 * Gir antall elementer i bag'en.
		 * 
		 * @return antall elementer i bag'en
		 */
		public int antall();

		/**
		 * Undersøker om bag'en er tom
		 * 
		 * @return Sann hvis bag'en er tom, elelsr usann.
		 */
		public boolean erTom();

		/**
		 * Gir en tabell av elementen i tabellen.
		 * 
		 * @return en tabell av elementene i tabell'en
		 */

	      public T[] tilTabell();

		 
	} // enpublicd BagInterface


