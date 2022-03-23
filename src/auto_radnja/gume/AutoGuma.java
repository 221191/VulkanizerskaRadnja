package auto_radnja.gume;

/**
 * AutoGuma klasa
 * 
 * @author Mihailo Nisavic
 * 
 * @version v0.1
 */

public class AutoGuma {

	/**
	 * Atribut predstavlja marku i model gume. 
	 * Minimum 3 karaktera dug
	 */
	private String markaModel = null;
	/**
	 * Atribut predstavlja precnik auto gume. 
	 * Domen je atributa je [13,21]
	 */
	private int precnik = -1;
	/**
	 * Atribut predstavlja sirinu auto gume. 
	 * Domen je atributa je [135,355]
	 */
	private int sirina = -1;
	/**
	 * Atribut predstavlja visinu auto gume. 
	 * Domen je atributa je [25,95]
	 */
	private int visina = -1;

	/**
	 * Bezparametarski konstruktor AutoGuma
	 */
	public AutoGuma() {
	}

	/**
	 * Parametarski konstruktor AutoGuma
	 * 
	 * 
	 * @param markaModel - marka i model gume kao String
	 * @param precnik -  precnik gume kao int
	 * @param sirina -  sirina gume kao int
	 * @param visina -  visina gume kao int
	 */
	public AutoGuma(String markaModel, int precnik, int sirina, int visina) {
		super();
		setMarkaModel(markaModel);
		setPrecnik(precnik);
		setSirina(sirina);
		setVisina(visina);
	}

	/**
	 * Metoda koja vraca marku i model gume
	 * 
	 * @return marka i model kao String 
	 */
	public String getMarkaModel() {
		return markaModel;
	}

	/**
	 * Metoda koja postavlja vrednost atributa markaModel
	 * 
	 * @param markaModel -  marka i model gume kao String
	 * 
	 * @throws NullPointerException ako nije uneta String vrednost za marku i model
	 * @throws IllegalArgumentException ako je uneti String 2 karaktera ili manji
	 */
	public void setMarkaModel(String markaModel) {
		if (markaModel == null)
			throw new NullPointerException("Morate uneti marku i model");
		if (markaModel.length() < 3)
			throw new IllegalArgumentException("Marka i model moraju sadrzati bar 3 znaka");
		this.markaModel = markaModel;
	}

	/**
	 * Metoda koja vraca vrednost atributa precnik gume
	 * @return precnik kao int
	 */
	public int getPrecnik() {
		return precnik;
	}

	/**
	 * Metoda koja postavlja vrednost atributa precnik gume
	 * @param - precnik kao int
	 * 
	 * @throws IllegalArgumentException ako je uneti precnik manji od 13 ili veci od 22
	 */
	public void setPrecnik(int precnik) {
		if (precnik < 13 || precnik > 22)
			throw new IllegalArgumentException("Precnik van opsega");
		this.precnik = precnik;
	}

	/**
	 * Metoda koja vraca vrednost atributa sirina gume
	 * @return - sirina kao int
	 */
	public int getSirina() {
		return sirina;
	}

	/**
	 * Metoda koja postavlja vrednost atributa sirina gume
	 * @param - sirina kao int
	 * 
	 * @throws IllegalArgumentException ako je uneti broj manji od 135 ili veci od 355 
	 */
	public void setSirina(int sirina) {
		if (sirina < 135 || sirina > 355)
			throw new IllegalArgumentException("Sirina van opsega");
		this.sirina = sirina;
	}

	/**
	 * Metoda koja vraca vrednost atributa visina gume
	 * @return visina kao int vrednost gume
	 */
	public int getVisina() {
		return visina;
	}

	/**
	 * Metoda koja postavlja vrednost atributa visina gume
	 * @param - visina kao int
	 * 
	 * @throws IllegalArgumentException ako je uneti broj manji od 25 ili veci od 95
	 */
	public void setVisina(int visina) {
		if (visina < 25 || visina > 95)
			throw new IllegalArgumentException("Visina van opsega");
		this.visina = visina;
	}

	
	/**
	 * Metoda koja vraca sve vrednosti atributa klase AutoGuma u String formatu
	 * @return sve vrednosti atributa klase AutoGuma kao String vrednost
	 */
	@Override
	public String toString() {
		return "AutoGuma [markaModel=" + markaModel + ", precnik=" + precnik + ", sirina=" + sirina + ", visina="
				+ visina + "]";
	}

	/**
	 * Metoda koja proverava da li su dva objekta AutoGuma isti.
	 * 
	 * @return <ul>
	 * <li>true ako su svi atributi isti</li>
	 * <li>false u suptornom </li>
	 * </ul>
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AutoGuma other = (AutoGuma) obj;
		if (markaModel == null) {
			if (other.markaModel != null)
				return false;
		} else if (!markaModel.equals(other.markaModel))
			return false;
		if (precnik != other.precnik)
			return false;
		if (sirina != other.sirina)
			return false;
		if (visina != other.visina)
			return false;
		return true;
	}
}