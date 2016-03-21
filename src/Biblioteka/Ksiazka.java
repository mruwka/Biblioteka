package Biblioteka;

public class Ksiazka {
    String autor;
    String tytul;
    String isbn;
    int liczba_egzemplarzy;
    int liczna_wypozyczonych_egzemplarzy;

// konstruktor
    /**
     * @param autor
     * @param tytul
     * @param isbn
     * @param liczba_egzemplarzy
     * @param liczna_wypozyczonych_egzemplarzy
     */
    public Ksiazka(String autor, String tytul, String isbn, int liczba_egzemplarzy,
                   int liczna_wypozyczonych_egzemplarzy) {
        super();
        this.autor = autor;
        this.tytul = tytul;
        this.isbn = isbn;
        this.liczba_egzemplarzy = liczba_egzemplarzy;
        this.liczna_wypozyczonych_egzemplarzy = liczna_wypozyczonych_egzemplarzy;
    }
    // gettery
    public String getAutor() {
        return autor;
    }

    public String getTytul() {
        return tytul;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getLiczba_egzemplarzy() {
        return liczba_egzemplarzy;
    }

    public int getLiczna_wypozyczonych_egzemplarzy() {
        return liczna_wypozyczonych_egzemplarzy;
    }
// settery

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setLiczba_egzemplarzy(int liczba_egzemplarzy) {
        this.liczba_egzemplarzy = liczba_egzemplarzy;
    }

    public void setLiczna_wypozyczonych_egzemplarzy(
            int liczna_wypozyczonych_egzemplarzy) {
        this.liczna_wypozyczonych_egzemplarzy = liczna_wypozyczonych_egzemplarzy;
    }
    @Override
    public String toString() {
        return "autor:  " + getAutor() + " tytul : " + getTytul() + " isbn:  " + getIsbn() + " liczba egzemplarzy: " + getLiczba_egzemplarzy() + " liczna wypozyczonych egzemplarzy: " + getLiczna_wypozyczonych_egzemplarzy();

			/*"Ksiazka [autor=" + autor + ", tytul=" + tytul + ", isbn=" + isbn
			+ ", liczba_egzemplarzy=" + liczba_egzemplarzy
			+ ", liczna_wypozyczonych_egzemplarzy="
			+ liczna_wypozyczonych_egzemplarzy + ", getAutor()=" + getAutor()
			+ ", getTytul()=" + getTytul() + ", getIsbn()=" + getIsbn()
			+ ", getLiczba_egzemplarzy()=" + getLiczba_egzemplarzy()
			+ ", getLiczna_wypozyczonych_egzemplarzy()="
			+ getLiczna_wypozyczonych_egzemplarzy() + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";*/
    }
}
