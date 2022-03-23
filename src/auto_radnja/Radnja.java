package auto_radnja;

import java.util.List;
import auto_radnja.gume.AutoGuma;

/**
 * Interfejs Radnja
 * @author Mihailo Nisavic
 *
 * @version v1.0
 */
public interface Radnja {
	/**
	 * Metoda koja dodaje novu AutoGumu u radnju
	 * @param a - AutoGuma koja se dodaje
	 * 
	 * @throws NullPointerException ako je uneta vrednost null
	 * @throws RuntimeException ako uneta guma vec postoji u listi
	 */
	void dodajGumu(AutoGuma a);

	/**
	 * Metoda koja pronalazi gumu
	 * @param markaModel String po kome se pretrazuje AutoGuma
	 * @return trazeni objekat AutoGuma 
	 */
	List<AutoGuma> pronadjiGumu(String markaModel);

	/**
	 * Metoda koja vraca listu listu svih guma
	 * @return Lista svih guma u radnji 
	 */
	List<AutoGuma> vratiSveGume();
}