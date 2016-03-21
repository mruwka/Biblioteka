package Biblioteka;

import java.util.ArrayList;
import java.io.*;

public class Main {

    static ArrayList<Czytelnik> czytelnicy = new ArrayList<Czytelnik>();
    static ArrayList<Ksiazka> ksiazki = new ArrayList<Ksiazka>();
    static ArrayList<Wypozyczenie> wypozyczenia = new ArrayList<Wypozyczenie>();

    public static int ChosenMenu() throws NumberFormatException, IOException {

        System.out
                .println("\n1 Dodaj czytelnika\n2 Usun czytelnika\n3 Wyswietl czytelnikow\n4 Dodaj ksiazke\n5 Usun ksiazke\n"
                        + "6 Wyswietl ksiazki\n7 Dodaj wypozyczenia\n8 Usun wypozyczenia\n9 Wyswietl wypozyczenia\n10 Konto Czytelnika\n0 Koniec\n\n");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int choice = 0;

        choice = Integer.parseInt(in.readLine());

        return choice;
    }

    public static void addingUser() throws IOException {

        System.out.println("wybrales opcje: 1 \n");
        System.out.println("podaj imie ");

        BufferedReader enterTheName = new BufferedReader(new InputStreamReader(
                System.in));
        // imienia
        String loadingTheName;
        loadingTheName = (enterTheName.readLine());

        System.out.println("podaj nazwisko ");

        BufferedReader enterTheSurname = new BufferedReader(
                new InputStreamReader(System.in));
        // nazwiska
        String loadingTheSurname;
        loadingTheSurname = (enterTheSurname.readLine());

        int lodingCardNumber;

        lodingCardNumber = (czytelnicy.size());

        System.out.println("wczytales imie " + loadingTheName
                + " wczytales nazwisko " + loadingTheSurname
                + " podales numer karty " + lodingCardNumber);

        Czytelnik addingTheUser = new Czytelnik(loadingTheName,
                loadingTheSurname, lodingCardNumber); //
        czytelnicy.add(addingTheUser);

    }

    public static void removeTheUser() throws NumberFormatException,
            IOException {

        System.out.println("wybrales opcje: 2 \n");

        if (czytelnicy.size() < 1) {
            System.out.println("pusta lista");

        } else {

            System.out.println("wybierz czytelnika o numerze (index): ");

            BufferedReader removeCardNumber = new BufferedReader(
                    new InputStreamReader(System.in));
            int removeTheCardNumber;
            removeTheCardNumber = Integer
                    .parseInt(removeCardNumber.readLine());

            if (removeTheCardNumber < 0) {
                System.out.println("za mala liczba");

            }

            if (czytelnicy.size() < 1) {
                System.out.println("pusta lista");
            }

            else if (removeTheCardNumber <= czytelnicy.size()) {
                czytelnicy.remove(removeTheCardNumber);

            } else {
                System.out.println("podales za duzy numer");
            }
        }

    }

    public static void displayUsers() {

        System.out.println("wybrales opcje: 3 \n");
        System.out.println("lista czytelnikow: \n");

        for (int i = 0; i < czytelnicy.size(); i++) {
            System.out.println(czytelnicy.get(i) + "\nma on ID: " + i);

        }
    }

    public static void addingBooks() throws IOException {

        System.out.println("wybrales opcje: 4 \n");
        System.out.println("podaj autora ");

        BufferedReader enterTheAuthor = new BufferedReader(new InputStreamReader(
                System.in)); // wczytywanie
        // autora
        String loadingTheAuthor;
        loadingTheAuthor = (enterTheAuthor.readLine());

        System.out.println("podaj tytul ");

        BufferedReader enterTheTitle = new BufferedReader(new InputStreamReader(
                System.in)); // wczytywanie
        // tytulu
        String loadingTheTitle;
        loadingTheTitle = (enterTheTitle.readLine());

        System.out.println("podaj isbn ");

        BufferedReader enterIsbn = new BufferedReader(new InputStreamReader(
                System.in)); // wczytywanie
        // isbn
        String loadingIsbn;

        loadingIsbn = (enterIsbn.readLine());

        System.out.println("podaj liczbe egzemplarzy ");

        BufferedReader enterNumberOfCopies = new BufferedReader(
                new InputStreamReader(System.in)); // wczytywanie
        // listy
        // egzemplarzy
        int loadingNumberOfCopies;

        loadingNumberOfCopies = Integer
                .parseInt(enterNumberOfCopies.readLine());

        System.out.println("podaj liczbe wypozyczonych egzemplarzy ");

        System.out.println("wczytales autora " + loadingTheAuthor
                + " podales tytul: " + loadingTheTitle + " podales isbn "
                + loadingIsbn + " podales liczbe egzemplarzy : "
                + loadingNumberOfCopies);

        Ksiazka addingTheBook = new Ksiazka(loadingTheAuthor,
                loadingTheTitle, loadingIsbn, loadingNumberOfCopies,
                0); // zero - stan
        // poczatkowy
        ksiazki.add(addingTheBook);

    }

    public static void removeBooks() throws NumberFormatException,
            IOException {

        System.out.println("wybrales opcje: 5 \n");

        if (ksiazki.size() < 1) {
            System.out.println("pusta lista");

        } else {

            System.out.println("wybierz ksiazke o numerze (index): ");

            BufferedReader removeCardNumber = new BufferedReader(
                    new InputStreamReader(System.in));
            int removeTheCardNumber;
            removeTheCardNumber = Integer
                    .parseInt(removeCardNumber.readLine());

            if (removeTheCardNumber < 0) {
                System.out.println("za mala liczba");

            }

            if (czytelnicy.size() < 1) {
                System.out.println("pusta lista");
            }

            else if (removeTheCardNumber <= ksiazki.size()) {
                ksiazki.remove(removeTheCardNumber);

            } else {
                System.out.println("podales za duzy numer");
            }
        }

    }

    public static void displayBook() {

        System.out.println("wybrales opcje: 6 \n");
        int sizeOfTableBooks = ksiazki.size();
        if (sizeOfTableBooks > 0) {

            System.out.println("lista ksiazek: ");

            for (int i = 0; i < ksiazki.size(); i++) {
                System.out
                        .println(ksiazki.get(i) + "\n ksiazka o numerze " + i);
            }
        } else {
            System.out.println("lista ksiazek jest pusta!");
        }
    }

    public static void addingBorrow() throws NumberFormatException,
            IOException {
        System.out.println("wybrales opcje: 7 \n");
        System.out.println("podaj pozycje (na liscie) ksiazki ");

        BufferedReader chosenBook = new BufferedReader(
                new InputStreamReader(System.in)); // wczytywanie
        // ksiazke
        int checkTheListOfBooks = ksiazki.size();
        int checkTheListOfUsers = czytelnicy.size();

        int loadedBook;
        loadedBook = Integer.parseInt(chosenBook.readLine());

        if (loadedBook < 0) {
            System.out.println("za maly numer ksiazki!");
        }

        else {

            if (loadedBook > (checkTheListOfBooks - 1)) {
                System.out.println("za duzy numer ksiazki");
            } else {

                System.out.println("podaj pozycje (na liscie) czytelnika");

                BufferedReader enterTheUser = new BufferedReader(
                        new InputStreamReader(System.in)); // wczytywanie
                // czytelnika

                int loadedTheUser;
                loadedTheUser = Integer.parseInt(enterTheUser
                        .readLine());

                if (loadedTheUser < 0) {
                    System.out.println("za maly numer czytelnika!");
                } else {

                    if (loadedTheUser > (checkTheListOfUsers - 1)) {
                        System.out.println("za duzy numer czytelnika");
                    } else {

                        Ksiazka primaryBook = ksiazki
                                .get(loadedBook);

                        int obecnaLiczbawypozyczonychEgzemplarzy = primaryBook
                                .getLiczna_wypozyczonych_egzemplarzy();
                        int obecnaLiczbaEgzemplarzy = primaryBook
                                .getLiczba_egzemplarzy();

                        if (obecnaLiczbaEgzemplarzy > obecnaLiczbawypozyczonychEgzemplarzy) {
                            primaryBook
                                    .setLiczna_wypozyczonych_egzemplarzy(obecnaLiczbawypozyczonychEgzemplarzy + 1);

                            Wypozyczenie addingTheBorrowing = new Wypozyczenie(
                                    ksiazki.get(loadedBook),
                                    czytelnicy.get(loadedTheUser));
                            wypozyczenia.add(addingTheBorrowing);

                            System.out.println("Dodales: "
                                    + ksiazki.get(loadedBook)
                                    + czytelnicy.get(loadedTheUser));
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

    public static void removeTheBorrowing() throws NumberFormatException,
            IOException {

        System.out.println("wybrales opcje: 8 \n");

        if (wypozyczenia.size() < 1) {
            System.out.println("pusta lista");
        }

        else {

            int listSize;
            listSize = wypozyczenia.size();

            if (listSize != 0) {

                for (int i = 0; i < wypozyczenia.size(); i++) {
                    System.out.println(" " + i + wypozyczenia.get(i));

                }
            } else {
                System.out.println("brak wypozyczen");
            }

            System.out.println("wybierz wypozyczenie o numerze (index): ");

            BufferedReader numberOfBorrowing = new BufferedReader(
                    new InputStreamReader(System.in));

            int chosenBorrowingToRemove;
            int sizeOfRemoveList;
            sizeOfRemoveList = wypozyczenia.size();

            chosenBorrowingToRemove = Integer
                    .parseInt(numberOfBorrowing.readLine());

            if (chosenBorrowingToRemove < 0) {
                System.out.println("za maly numer, bo "
                        + chosenBorrowingToRemove + "<"
                        + sizeOfRemoveList);
            }

            else {

                if (chosenBorrowingToRemove > (sizeOfRemoveList - 1)) {
                    System.out.println("za duza liczba.");
                }

                else {
                    if (chosenBorrowingToRemove < wypozyczenia.size()) {
                        System.out.println("usuwasz wypozyczenie: \n"
                                + chosenBorrowingToRemove);

                        wypozyczenia.remove(chosenBorrowingToRemove);

                    } else {
                        System.out.println("podales zly numer wypozyczenia");
                    }
                }
            }
        }

    }

    public static void displayBorrowing() {
        System.out.println("wybrales opcje: 9 \n");
        System.out.println("lista wypozyczen: ");
        int listSize;
        listSize = wypozyczenia.size();

        if (listSize != 0) {

            for (int i = 0; i < wypozyczenia.size(); i++) {
                System.out.println("\nwypozyczenie numer " + i
                        + wypozyczenia.get(i));

            }
        } else {
            System.out.println("brak wypozyczen");
        }

    }

    public static void userAccount() throws NumberFormatException,
            IOException {
        System.out.println("wybrales opcje: 10 \n");
        int listOfusers = czytelnicy.size();
        if (listOfusers == 0) {
            System.out.println("Lista jest pusta");
        } else {

            System.out.println("Podaj numer karty do wyswietlenia");
            BufferedReader enterUserToDisplay = new BufferedReader(
                    new InputStreamReader(System.in));

            int loadingUserToDisplay;
            loadingUserToDisplay = Integer
                    .parseInt(enterUserToDisplay.readLine());

            if (loadingUserToDisplay > (listOfusers - 1)) {
                System.out.println("za duzy numer czytlnika");

            } else {
                if (loadingUserToDisplay < 0) {
                    System.out.println("za mały numer czytelnika!");
                } else {

                    System.out.println("wybrales czytelnika o danych: \n"
                            + czytelnicy.get(loadingUserToDisplay)
                            + "\nOto jego wypozyczenia:");

                    if (wypozyczenia.size() > 0) {

                        for (int i = 0; i < wypozyczenia.size(); i++) {

                            // uzupelnic wiekszosc kodu

                            Wypozyczenie objectBorrowUser = wypozyczenia
                                    .get(i);
                            Czytelnik objectUserBorrow = objectBorrowUser
                                    .getCzytelnik();
                            int numberTheUserCard = objectUserBorrow
                                    .getNumer_karty();

                            if (numberTheUserCard == loadingUserToDisplay) { // druga
                                // czesc
                                // jest
                                // wpisywana
                                // z
                                // klawiatury
                                System.out.println(i + " "
                                        + objectBorrowUser
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

            boolean repaet;
            repaet = true;

            do {

                switch (ChosenMenu()) {

                    case 1:

                        addingUser();
                        break;

                    case 2:

                        removeTheUser();
                        break;

                    case 3:
                        displayUsers();
                        break;

                    case 4:

                        addingBooks();
                        break;

                    case 5:

                        removeBooks();
                        break;

                    case 6:
                        displayBook();
                        break;

                    case 7:
                        addingBorrow();
                        break;

                    case 8:

                        removeTheBorrowing();
                        break;

                    case 9:
                        displayBorrowing();
                        break;

                    case 10:
                        userAccount();
                        break;

                    case 0:
                        System.out.println("koniec / see ya");
                        repaet = false;
                        break;

                    default:
                        System.out.println("wybrales zla opcje: ");
                        break;

                }
            } while (repaet == true); // w moim standardowym mysleniu to jest
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
