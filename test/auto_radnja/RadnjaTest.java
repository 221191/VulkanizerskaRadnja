package auto_radnja;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;
import auto_radnja.gume.AutoGuma;

public abstract class RadnjaTest {

	protected Radnja radnja;

	@Test
	void testDodajGumu() {
		AutoGuma a = new AutoGuma("195/50ZR20", 20, 195, 80);
		radnja.dodajGumu(a);

		assertEquals(1, radnja.vratiSveGume().size());
		assertEquals(a, radnja.vratiSveGume().get(0));
	}

	@Test
	void testDodajGumuNull() {
		assertThrows(java.lang.NullPointerException.class, () -> radnja.dodajGumu(null));
	}

	@Test
	void testDodajGumuKopija() {
		AutoGuma a = new AutoGuma("195/50ZR20", 20, 195, 80);
		AutoGuma a1 = new AutoGuma("195/50ZR20", 20, 195, 80);

		radnja.dodajGumu(a);
		assertThrows(java.lang.RuntimeException.class, () -> radnja.dodajGumu(a1));
	}

	@Test
	void testPronadjiGumu() {
		AutoGuma a1 = new AutoGuma();
		a1.setMarkaModel("195/50ZR20");
		radnja.dodajGumu(a1);
		List<AutoGuma> lista = radnja.pronadjiGumu(a1.getMarkaModel());
		assertTrue(lista.contains(a1));
	}

	@Test
	void testPronadjiGumuNull() {
		assertEquals(null, radnja.pronadjiGumu(null));
	}
	
	@Test
	void testPronadjiGumuNePostoji() {
		AutoGuma a1 = new AutoGuma();
		a1.setMarkaModel("195/50ZR20");
		AutoGuma a2 = new AutoGuma();
		String markaGume2 = "195/65HJI0";
		a2.setMarkaModel(markaGume2);
		radnja.dodajGumu(a1);
		assertEquals(0, radnja.pronadjiGumu(markaGume2).size());
	}

	@Test
	void testVratiSveGume() {
		AutoGuma a1 = new AutoGuma("195/50ZR20", 20, 195, 80);
		AutoGuma a2 = new AutoGuma("195/50ZR20", 19, 190, 77);
		AutoGuma a3 = new AutoGuma("195/50ZR20", 20, 160, 75);
		radnja.dodajGumu(a1);
		radnja.dodajGumu(a2);
		radnja.dodajGumu(a3);
				
		assertEquals(3, radnja.vratiSveGume().size());
	}
	
	@Test
	void testPronadjiGumuViseGuma() {
		AutoGuma a1 = new AutoGuma("195/50ZR20", 20, 195, 80);
		AutoGuma a2 = new AutoGuma("195/50ZR20", 19, 190, 77);
		radnja.dodajGumu(a1);
		radnja.dodajGumu(a2);
		List<AutoGuma> pom = radnja.pronadjiGumu("195/50ZR20");
		
		assertEquals(2, pom.size());
		assertTrue(pom.contains(a1));
		assertTrue(pom.contains(a2));
		
	}

}