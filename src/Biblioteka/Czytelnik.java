package Biblioteka;

public class Czytelnik {
    /**
     * @param imie
     * @param nazwisko
     * @param numer_karty
     */
    public Czytelnik(String imie, String nazwisko, int numer_karty) {
        super();
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numer_karty = numer_karty;
    }

    //Witek dodal jako private - u mnie public
    String imie;
    String nazwisko;
    int numer_karty;

    // gettery
    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public int getNumer_karty() {
        return numer_karty;
    }

    // settery
    public void setImie(String imie) {
        this.imie = imie;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
    public void setNumer_karty(int numer_karty) {
        this.numer_karty = numer_karty;
    }
    // generator toString
    @Override
    public String toString() {
        return "czytelnik " + getImie() + " " + getNazwisko() + " numer karty " + getNumer_karty();


			/*"Czytelnik [imie=" + imie + ", nazwisko=" + nazwisko
			+ ", numer_karty=" + numer_karty + ", getImie()=" + getImie()
			+ ", getNazwisko()=" + getNazwisko() + ", getNumer_karty()="
			+ getNumer_karty() + ", getClass()=" + getClass() + ", hashCode()="
			+ hashCode() + ", toString()=" + super.toString() + "]"; */
    }

}
