package no.hvl.dat102.adt;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import no.hvl.dat102.adt.KoeADT;
import no.hvl.dat102.exceptions.EmptyCollectionException;


public abstract class KoeADTTest {

	// Referanse til koe
	private KoeADT<Integer> koe;

	// Testdata
	private Integer e0 = 1;
	private Integer e1 = 2;
	private Integer e2 = 3;
	private Integer e3 = 4;
	private Integer e4 = 5;
	private Integer e5 = 6;
	
	
	protected abstract KoeADT<Integer> reset();
	
	@BeforeEach
	public void setup() {
		koe = reset();
	}

	@Test
	public void nyKoeErTom() {
		assertTrue(koe.erTom());
	}
	
	/**
	 * Test p� push and pop.
	 */
	
	@Test
	public void innOgUtKoe() {

		koe.innKoe(e0);
		koe.innKoe(e1);
		koe.innKoe(e2);
		koe.innKoe(e3);

		try {
			assertEquals(e3, koe.utKoe());
			assertEquals(e2, koe.utKoe());
			assertEquals(e1, koe.utKoe());
			assertEquals(e0, koe.utKoe());
		} catch (EmptyCollectionException e) {
			fail("utKoe feilet uventet " + e.getMessage());
		}
	}
	
	/**
	 * Test p� push og pop med duplikate verdier.
	 */
	@Test
	public void innOgUtKoeMedDuplikater() {

		koe.innKoe(e0);
		koe.innKoe(e1);
		koe.innKoe(e1);
		koe.innKoe(e2);

		try {
			assertEquals(e2, koe.utKoe());
			assertEquals(e1, koe.utKoe());
			assertEquals(e1, koe.utKoe());
			assertEquals(e0, koe.utKoe());
		} catch (EmptyCollectionException e) {
			fail("utKoe feilet uventet " + e.getMessage());
		}
	}
	
	
	
	/**
	 * Testing p� peek.
	 */
	@Test
	public void innUtInnInnUtFoerste() {
		try {
			koe.innKoe(e2);
			koe.utKoe();
			koe.innKoe(e3);
			koe.innKoe(e4);
			koe.utKoe();
			assertEquals(e3, koe.foerste());

		} catch (EmptyCollectionException e) {
			fail("utKoe eller foerste feilet uventet " + e.getMessage());
		}
	}

	
	/**
	 * Test p� at en stabel med noen elementer ikke er tom.
	 */
	@Test
	public final void erIkkeTom() {
		koe.innKoe(e0);
		koe.innKoe(e1);
		assertFalse(koe.erTom());
	}

	/**
	 * Test p� at en stabel med null elementer er tom.
	 */
	@Test
	public void innUtKoeErTom() {
		try {
			koe.innKoe(e0);
			koe.utKoe();
			assertTrue(koe.erTom());

		} catch (EmptyCollectionException e) {
			fail("inn- eller utKoe feilet uventet " + e.getMessage());
		}
	}
	
	@Test
	public void UtKoeFromEmptyIsUnderflowed() {
		/*
		 * Assertions.assertThrows(EmptyCollectionException.class, new Executable() {
		 * 
		 * @Override public void execute() throws Throwable { koe.utKoe(); } });
		 */

		Assertions.assertThrows(EmptyCollectionException.class, () -> {
			koe.utKoe();
		});
	}
	
	
}
