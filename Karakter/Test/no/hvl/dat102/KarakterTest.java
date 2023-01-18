package no.hvl.dat102;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

/**
 * Tester Karakter.
 * 
 * @Ole Olsen
 */
public class KarakterTest {

	@Test
	public void er100enA() throws FeilKarakterException {
		assertEquals('A', Karakter.beregnKarakter(100),"feil karakter");
	}

	@Test
	public void er95enA() throws FeilKarakterException {
		assertEquals('A', Karakter.beregnKarakter(95),"feil karakter");
	}

	@Test
	public void er90enA() throws FeilKarakterException {
		assertEquals('A', Karakter.beregnKarakter(90),"feil karakter");
	}

	@Test
	public void er89enB() throws FeilKarakterException {
		assertEquals('B', Karakter.beregnKarakter(89),"feil karakter");
	}

	@Test
	public void er82enB() throws FeilKarakterException {
		assertEquals('B', Karakter.beregnKarakter(82),"feil karakter");
	}

	@Test
	public void er80enB() throws FeilKarakterException {
		assertEquals('B', Karakter.beregnKarakter(80),"feil karakter");
	}

	@Test
	public void er79enC() throws FeilKarakterException {
		assertEquals('C', Karakter.beregnKarakter(79),"feil karakter");
	}

	@Test
	public void er66enC() throws FeilKarakterException {
		assertEquals('C', Karakter.beregnKarakter(66),"feil karakter");
	}

	@Test
	public void er60enC() throws FeilKarakterException {
		assertEquals('C', Karakter.beregnKarakter(60),"feil karakter");
	}

	@Test
	public void er59enD() throws FeilKarakterException {
		assertEquals('D', Karakter.beregnKarakter(59),"feil karakter");
	}

	@Test
	public void er54enD() throws FeilKarakterException {
		assertEquals('D', Karakter.beregnKarakter(54),"feil karakter");
	}

	@Test
	public void er50enD() throws FeilKarakterException {
		assertEquals('D', Karakter.beregnKarakter(50),"feil karakter");
	}

	@Test
	public void er49enE() throws FeilKarakterException {
		assertEquals('E', Karakter.beregnKarakter(49),"feil karakter");
	}

	@Test
	public void er45enE() throws FeilKarakterException {
		assertEquals('E', Karakter.beregnKarakter(45),"feil karakter");
	}

	@Test
	public void er40enE() throws FeilKarakterException {
		assertEquals('E', Karakter.beregnKarakter(40),"feil karakter");
	}

	@Test
	public void er39enF() throws FeilKarakterException {
		assertEquals('F', Karakter.beregnKarakter(39),"feil karakter");
	}

	@Test
	public void er37enF() throws FeilKarakterException {
		assertEquals('F', Karakter.beregnKarakter(37),"feil karakter");
	}

	@Test
	public void er0enF() throws FeilKarakterException {
		assertEquals('F', Karakter.beregnKarakter(0),"feil karakter");
	}

	@Test(expected = FeilKarakterException.class)
	// Forventer at metoden skal kaste unntaket for at testen skal være riktig.
	public void er101ulovlig() throws FeilKarakterException {
		Karakter.beregnKarakter(101);
	}

	// ... Samme her
	@Test(expected = FeilKarakterException.class)
	public void erNegativUlovlig() throws FeilKarakterException {
		Karakter.beregnKarakter(-1);
	}

}
