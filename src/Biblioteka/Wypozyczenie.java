package Biblioteka;

public class Wypozyczenie {
    /**
     * @param ksiazka
     * @param czytelnik
     */
    public Wypozyczenie(Ksiazka ksiazka, Czytelnik czytelnik) {
        super();
        this.ksiazka = ksiazka;
        this.czytelnik = czytelnik;
    }
    Ksiazka ksiazka;
    Czytelnik czytelnik;
    public Ksiazka getKsiazka() {
        return ksiazka;
    }
    public Czytelnik getCzytelnik() {
        return czytelnik;
    }
    public void setKsiazka(Ksiazka ksiazka) {
        this.ksiazka = ksiazka;
    }
    public void setCzytelnik(Czytelnik czytelnik) {
        this.czytelnik = czytelnik;
    }
    @Override
    public String toString() {
        return "\n" + getKsiazka() + "\n" + getCzytelnik();

			/*"Wypozyczenie [ksiazka=" + ksiazka + ", czytelnik=" + czytelnik
			+ ", getKsiazka()=" + getKsiazka() + ", getCzytelnik()="
			+ getCzytelnik() + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + ", toString()=" + super.toString() + "]";*/
    }
}
// bez generatorow
