import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */


        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */
        System.out.println("zad. 1a");
        System.out.print("Podaj swoje imię: ");
        Scanner tekstImie = new Scanner(System.in);
        String imie = tekstImie.next();
        System.out.print("Podaj swoje nazwisko: ");
        Scanner tekstNazwisko = new Scanner(System.in);
        String nazwisko = tekstNazwisko.next();
        System.out.print("Podaj swój wiek: ");
        Scanner liczbaWiek = new Scanner(System.in);
        int wiek = liczbaWiek.nextInt();
        System.out.print("Podaj swój indeks: ");
        Scanner liczbaIndeks = new Scanner(System.in);
        int indeks = liczbaIndeks.nextInt();
        System.out.print("\n");

        System.out.println("zad. 1b");
        System.out.println("imię: "+imie+", nazwisko: "+nazwisko+", wiek: "+wiek+", indeks: "+indeks);
        System.out.printf("imię: %s, nazwisko: %s, wiek: %d, indeks: %d", imie, nazwisko, wiek, indeks);
        System.out.print("\n");
        System.out.print("\n");

        System.out.println("zad. 2");
        System.out.print("Podaj pierwszą liczbę: ");
        Scanner intPierwszy = new Scanner(System.in);
        int liczbaPierwsza = intPierwszy.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        Scanner intDrugi = new Scanner(System.in);
        int liczbaDruga = intDrugi.nextInt();
        System.out.print("\n");
        System.out.println("Wynik z dodawania: "+(liczbaPierwsza+liczbaDruga)+".");
        System.out.println("Wynik z odejmowania: "+(liczbaPierwsza-liczbaDruga)+".");
        System.out.println("Wynik z mnożenia: "+(liczbaPierwsza*liczbaDruga)+".");
        System.out.println("Wynik z dzielenia całkowitego: "+(liczbaPierwsza/liczbaDruga)+".");
        System.out.println("Reszta z dzielenia: "+(liczbaPierwsza%liczbaDruga)+".");
    }
}