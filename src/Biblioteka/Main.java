package Biblioteka;

import java.util.ArrayList;
import java.io.*;

public class Main {

    static ArrayList<Czytelnik> czytelnicy = new ArrayList<Czytelnik>(); // lista
    // obiektow
    // klasy
    // czytelnik
    // o
    // nazwie czytelnicy
    static ArrayList<Ksiazka> ksiazki = new ArrayList<Ksiazka>(); // lista
    // obiektow
    // klasy
    // ksiazka o
    // nazwie
    // ksiazki
    static ArrayList<Wypozyczenie> wypozyczenia = new ArrayList<Wypozyczenie>(); // lista
    // obiektow
    // wypozyczenia

    // czytelnik o nazwie
    // wypozyczenie

    public static int wyborMenu() throws NumberFormatException, IOException {

        System.out
                .println("\n1 dodaj czytelnika\n2 usun czytelnika\n3 wyswietl czytelnikow\n4 dodaj ksiazke\n5 usun ksiazke\n"
                        + "6 wyswietl ksiazki\n7 dodaj wypozyczenia\n8 usun wypozyczenia\n9 wyswietl wypozyczenia\n10 Konto Czytelnika\n0 koniec\n\n");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int wybor = 0;

        wybor = Integer.parseInt(in.readLine());

        return wybor;
    }

    public static void dodawanieCzytelnika() throws IOException {

        System.out.println("wybrales opcje: 1 \n");
        System.out.println("podaj imie ");

        BufferedReader podaj_imie = new BufferedReader(new InputStreamReader(
                System.in)); // wczytywanie
        // imienia
        String wczytane_imie;
        wczytane_imie = (podaj_imie.readLine());

        System.out.println("podaj nazwisko ");

        BufferedReader podaj_nazwisko = new BufferedReader(
                new InputStreamReader(System.in)); // wczytywanie
        // nazwiska
        String wczytane_nazwisko;
        wczytane_nazwisko = (podaj_nazwisko.readLine());

        int wczytane_numer_karty;

        wczytane_numer_karty = (czytelnicy.size());

        System.out.println("wczytales imie " + wczytane_imie
                + " wczytales nazwisko " + wczytane_nazwisko
                + " podales numer karty " + wczytane_numer_karty);

        Czytelnik dodanie_czytelnika = new Czytelnik(wczytane_imie,
                wczytane_nazwisko, wczytane_numer_karty); //
        czytelnicy.add(dodanie_czytelnika);

    }

    public static void usuwanieCzytelnika() throws NumberFormatException,
            IOException {

        System.out.println("wybrales opcje: 2 \n");

        if (czytelnicy.size() < 1) {
            System.out.println("pusta lista");

        } else {

            System.out.println("wybierz czytelnika o numerze (index): ");

            BufferedReader numer_karty_do_usuniecia = new BufferedReader(
                    new InputStreamReader(System.in));
            int wybrana_karta_do_usuniecia;
            wybrana_karta_do_usuniecia = Integer
                    .parseInt(numer_karty_do_usuniecia.readLine());

            if (wybrana_karta_do_usuniecia < 0) {
                System.out.println("za mala liczba");

            }

            if (czytelnicy.size() < 1) {
                System.out.println("pusta lista");
            }

            else if (wybrana_karta_do_usuniecia <= czytelnicy.size()) {
                czytelnicy.remove(wybrana_karta_do_usuniecia);

            } else {
                System.out.println("podales za duzy numer");
            }
        }

    }

    public static void wyswietlenieCzytelnikow() {

        System.out.println("wybrales opcje: 3 \n");
        System.out.println("lista czytelnikow: \n");

        for (int i = 0; i < czytelnicy.size(); i++) {
            System.out.println(czytelnicy.get(i) + "\nma on ID: " + i);

        }
    }

    public static void dodawanieKsiazki() throws IOException {

        System.out.println("wybrales opcje: 4 \n");
        System.out.println("podaj autora ");

        BufferedReader podaj_autora = new BufferedReader(new InputStreamReader(
                System.in)); // wczytywanie
        // autora
        String wczytanie_autora;
        wczytanie_autora = (podaj_autora.readLine());

        System.out.println("podaj tytul ");

        BufferedReader podaj_tytul = new BufferedReader(new InputStreamReader(
                System.in)); // wczytywanie
        // tytulu
        String wczytanie_tytulu;
        wczytanie_tytulu = (podaj_tytul.readLine());

        System.out.println("podaj isbn ");

        BufferedReader podaj_isbn = new BufferedReader(new InputStreamReader(
                System.in)); // wczytywanie
        // isbn
        String wczytanie_isbn;

        wczytanie_isbn = (podaj_isbn.readLine());

        System.out.println("podaj liczbe egzemplarzy ");

        BufferedReader podaj_liczbe_egzemplarzy = new BufferedReader(
                new InputStreamReader(System.in)); // wczytywanie
        // listy
        // egzemplarzy
        int wczytanie_liczby_egzemplarzy;

        wczytanie_liczby_egzemplarzy = Integer
                .parseInt(podaj_liczbe_egzemplarzy.readLine());

        System.out.println("podaj liczbe wypozyczonych egzemplarzy ");

        System.out.println("wczytales autora " + wczytanie_autora
                + " podales tytul: " + wczytanie_tytulu + " podales isbn "
                + wczytanie_isbn + " podales liczbe egzemplarzy : "
                + wczytanie_liczby_egzemplarzy);

        Ksiazka dodanie_ksiazki = new Ksiazka(wczytanie_autora,
                wczytanie_tytulu, wczytanie_isbn, wczytanie_liczby_egzemplarzy,
                0); // zero - stan
        // poczatkowy
        ksiazki.add(dodanie_ksiazki);

    }

    public static void UsuwanieKsiazki() throws NumberFormatException,
            IOException {

        System.out.println("wybrales opcje: 5 \n");

        if (ksiazki.size() < 1) {
            System.out.println("pusta lista");

        } else {

            System.out.println("wybierz ksiazke o numerze (index): ");

            BufferedReader numer_karty_do_usuniecia = new BufferedReader(
                    new InputStreamReader(System.in));
            int wybrana_karta_do_usuniecia;
            wybrana_karta_do_usuniecia = Integer
                    .parseInt(numer_karty_do_usuniecia.readLine());

            if (wybrana_karta_do_usuniecia < 0) {
                System.out.println("za mala liczba");

            }

            if (czytelnicy.size() < 1) {
                System.out.println("pusta lista");
            }

            else if (wybrana_karta_do_usuniecia <= ksiazki.size()) {
                ksiazki.remove(wybrana_karta_do_usuniecia);

            } else {
                System.out.println("podales za duzy numer");
            }
        }

    }

    public static void wyswietlenieKsiazki() {

        System.out.println("wybrales opcje: 6 \n");
        int wielkoscTablicyksiazek = ksiazki.size();
        if (wielkoscTablicyksiazek > 0) {

            System.out.println("lista ksiazek: ");

            for (int i = 0; i < ksiazki.size(); i++) {
                System.out
                        .println(ksiazki.get(i) + "\n ksiazka o numerze " + i);
            }
        } else {
            System.out.println("lista ksiazek jest pusta!");
        }
    }

    public static void dodanieWypozyczenia() throws NumberFormatException,
            IOException {
        System.out.println("wybrales opcje: 7 \n");
        System.out.println("podaj pozycje (na liscie) ksiazki ");

        BufferedReader podaj_ksiazke = new BufferedReader(
                new InputStreamReader(System.in)); // wczytywanie
        // ksiazke
        int sprawdzListeKsiazek = ksiazki.size();
        int sprawdzListeCzytelnikow = czytelnicy.size();

        int wczytana_ksiazka;
        wczytana_ksiazka = Integer.parseInt(podaj_ksiazke.readLine());

        if (wczytana_ksiazka < 0) {
            System.out.println("za maly numer ksiazki!");
        }

        else {

            if (wczytana_ksiazka > (sprawdzListeKsiazek - 1)) {
                System.out.println("za duzy numer ksiazki");
            } else {

                System.out.println("podaj pozycje (na liscie) czytelnika");

                BufferedReader podaj_czytelnika = new BufferedReader(
                        new InputStreamReader(System.in)); // wczytywanie
                // czytelnika

                int wczytanie_czytelnika;
                wczytanie_czytelnika = Integer.parseInt(podaj_czytelnika
                        .readLine());

                if (wczytanie_czytelnika < 0) {
                    System.out.println("za maly numer czytelnika!");
                } else {

                    if (wczytanie_czytelnika > (sprawdzListeCzytelnikow - 1)) {
                        System.out.println("za duzy numer czytelnika");
                    } else {

                        Ksiazka pierwotnaKsiazka = ksiazki
                                .get(wczytana_ksiazka);

                        int obecnaLiczbawypozyczonychEgzemplarzy = pierwotnaKsiazka
                                .getLiczna_wypozyczonych_egzemplarzy();
                        int obecnaLiczbaEgzemplarzy = pierwotnaKsiazka
                                .getLiczba_egzemplarzy();

                        if (obecnaLiczbaEgzemplarzy > obecnaLiczbawypozyczonychEgzemplarzy) {
                            pierwotnaKsiazka
                                    .setLiczna_wypozyczonych_egzemplarzy(obecnaLiczbawypozyczonychEgzemplarzy + 1);

                            Wypozyczenie dodanie_wypozyczenia = new Wypozyczenie(
                                    ksiazki.get(wczytana_ksiazka),
                                    czytelnicy.get(wczytanie_czytelnika));
                            wypozyczenia.add(dodanie_wypozyczenia);

                            System.out.println("Dodales: "
                                    + ksiazki.get(wczytana_ksiazka)
                                    + czytelnicy.get(wczytanie_czytelnika));
                        }

                        else {
                            System.out
                                    .println("Wszystkie Egzemplarze są wyporzyczone!");
                        }
                    }
                }

            }
        }

    }

    public static void usuwanieWypozyczenia() throws NumberFormatException,
            IOException {

        System.out.println("wybrales opcje: 8 \n");

        if (wypozyczenia.size() < 1) {
            System.out.println("pusta lista");
        }

        else {

            int wielkosc_listy;
            wielkosc_listy = wypozyczenia.size();

            if (wielkosc_listy != 0) {

                for (int i = 0; i < wypozyczenia.size(); i++) {
                    System.out.println(" " + i + wypozyczenia.get(i));

                }
            } else {
                System.out.println("brak wypozyczen");
            }

            System.out.println("wybierz wypozyczenie o numerze (index): ");

            BufferedReader numer_wypozyczenia_do_usuniecia = new BufferedReader(
                    new InputStreamReader(System.in));

            int wybrane_wypozyczenie_do_usuniecia;
            int wielkoscListyWypozyczenDoUsuniecia;
            wielkoscListyWypozyczenDoUsuniecia = wypozyczenia.size();

            wybrane_wypozyczenie_do_usuniecia = Integer
                    .parseInt(numer_wypozyczenia_do_usuniecia.readLine());

            if (wybrane_wypozyczenie_do_usuniecia < 0) {
                System.out.println("za maly numer, bo "
                        + wybrane_wypozyczenie_do_usuniecia + "<"
                        + wielkoscListyWypozyczenDoUsuniecia);
            }

            else {

                if (wybrane_wypozyczenie_do_usuniecia > (wielkoscListyWypozyczenDoUsuniecia - 1)) {
                    System.out.println("za duza liczba.");
                }

                else {
                    if (wybrane_wypozyczenie_do_usuniecia < wypozyczenia.size()) {
                        System.out.println("usuwasz wypozyczenie: \n"
                                + wybrane_wypozyczenie_do_usuniecia);

                        wypozyczenia.remove(wybrane_wypozyczenie_do_usuniecia);

                    } else {
                        System.out.println("podales zly numer wypozyczenia");
                    }
                }
            }
        }

    }

    public static void wyswietlenieWypozyczenia() {
        System.out.println("wybrales opcje: 9 \n");
        System.out.println("lista wypozyczen: ");
        int wielkosc_listy;
        wielkosc_listy = wypozyczenia.size();

        if (wielkosc_listy != 0) {

            for (int i = 0; i < wypozyczenia.size(); i++) {
                System.out.println("\nwypozyczenie numer " + i
                        + wypozyczenia.get(i));

            }
        } else {
            System.out.println("brak wypozyczen");
        }

    }

    public static void kontoCzytelnika() throws NumberFormatException,
            IOException {
        System.out.println("wybrales opcje: 10 \n");
        int listaCzytelnikowDoCase10 = czytelnicy.size();
        if (listaCzytelnikowDoCase10 == 0) {
            System.out.println("Lista jest pusta");
        } else {

            System.out.println("Podaj numer karty do wyswietlenia");
            BufferedReader podajCzytelnikaDoWyswietlenia = new BufferedReader(
                    new InputStreamReader(System.in));

            int wczytanieCzytelnikaDoWyswietlenia;
            wczytanieCzytelnikaDoWyswietlenia = Integer
                    .parseInt(podajCzytelnikaDoWyswietlenia.readLine());

            if (wczytanieCzytelnikaDoWyswietlenia > (listaCzytelnikowDoCase10 - 1)) {
                System.out.println("za duzy numer czytlnika");

            } else {
                if (wczytanieCzytelnikaDoWyswietlenia < 0) {
                    System.out.println("za mały numer czytelnika!");
                } else {

                    System.out.println("wybrales czytelnika o danych: \n"
                            + czytelnicy.get(wczytanieCzytelnikaDoWyswietlenia)
                            + "\nOto jego wypozyczenia:");

                    if (wypozyczenia.size() > 0) {

                        for (int i = 0; i < wypozyczenia.size(); i++) {

                            // uzupelnic wiekszosc kodu

                            Wypozyczenie obiektWypozyczenieUzytkownika = wypozyczenia
                                    .get(i);
                            Czytelnik obiektCzytelnikDlaWypozyczenia = obiektWypozyczenieUzytkownika
                                    .getCzytelnik();
                            int numerKartyWybranegoCzytelnika = obiektCzytelnikDlaWypozyczenia
                                    .getNumer_karty();

                            if (numerKartyWybranegoCzytelnika == wczytanieCzytelnikaDoWyswietlenia) { // druga
                                // czesc
                                // jest
                                // wpisywana
                                // z
                                // klawiatury
                                System.out.println(i + " "
                                        + obiektWypozyczenieUzytkownika
                                        + "\n\n");

                            }
                        }
                    } else {
                        System.out.println("\nten czytelnik nie ma wypozyczen");
                    }
                }
            }
        }

    }

    public static void main(String[] args) {

        try {

            Czytelnik jas = new Czytelnik("Jan", "Kowalski", 0); // konstruktor
            // klasy
            // czytelnik
            // o
            // atrybutach
            // imie,
            // nazwisko,
            // numer
            Czytelnik ktos = new Czytelnik("Piotr", "Nowak", 1);

            Ksiazka koran = new Ksiazka("Allah", "Koran", "9874", 8, 2); // konstruktor
            // klasy
            // ksiazka
            // o
            // atrybutach
            // autor,
            // tytul,
            // itp
            Ksiazka biblia = new Ksiazka("Bogu", "Biblia", "666", 9, 2);

            Wypozyczenie pierwsze = new Wypozyczenie(koran, jas);
            Wypozyczenie drugie = new Wypozyczenie(biblia, ktos);

            czytelnicy.add(jas);
            czytelnicy.add(ktos);
            ksiazki.add(koran);
            ksiazki.add(biblia);
            wypozyczenia.add(pierwsze);
            wypozyczenia.add(drugie);

            boolean powtorz;
            powtorz = true;

            do {

                switch (wyborMenu()) {

                    case 1:

                        dodawanieCzytelnika();
                        break;

                    case 2:

                        usuwanieCzytelnika();
                        break;

                    case 3:
                        wyswietlenieCzytelnikow();
                        break;

                    case 4:

                        dodawanieKsiazki();
                        break;

                    case 5:

                        UsuwanieKsiazki();
                        break;

                    case 6:
                        wyswietlenieKsiazki();
                        break;

                    case 7:
                        dodanieWypozyczenia();
                        break;

                    case 8:

                        usuwanieWypozyczenia();
                        break;

                    case 9:
                        wyswietlenieWypozyczenia();
                        break;

                    case 10:
                        kontoCzytelnika();
                        break;

                    case 0:
                        System.out.println("koniec / see ya");
                        powtorz = false;
                        break;

                    default:
                        System.out.println("wybrales zla opcje: ");
                        break;

                }
            } while (powtorz == true); // w moim standardowym mysleniu to jest
            // rowna sie "=" / tzn. porownanie
        }

        catch (NumberFormatException e) { // automatycznie dodana obsluga
            // bledow / catch

            System.out.println("blue screen");

            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {

            System.out.println("blue screen");

            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
