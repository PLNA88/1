import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */

        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */
        System.out.println("zad. 1");
        byte zmiennaByteUjemna = -128;
        byte zmiennaByteDodatnia = 127;
        System.out.println("Najmniejsza zmienna byte ujemna: "+zmiennaByteUjemna+".");
        System.out.println("Największa zmienna byte dodatnia: "+zmiennaByteDodatnia+".");
        short zmiennaShortUjemna = -32768;
        short zmiennaShortDodatnia = 127;
        System.out.println("Najmniejsza zmienna short ujemna: "+zmiennaShortUjemna+".");
        System.out.println("Największa zmienna short dodatnia: "+zmiennaShortDodatnia+".");
        int zmiennaIntUjemna = -2147483648;
        int zmiennaIntDodatnia = 32767;
        System.out.println("Najmniejsza zmienna int ujemna: "+zmiennaIntUjemna+".");
        System.out.println("Największa zmienna int dodatnia: "+zmiennaIntDodatnia+".");
        long zmiennaLongUjemna = -9223372036854775808L;
        long zmiennaLongDodatnia = 9223372036854775807L;
        System.out.println("Najmniejsza zmienna long ujemna: "+zmiennaLongUjemna+", którą w kodzie kończymy literą L.");
        System.out.println("Największa zmimenna long dodatnia: "+zmiennaLongDodatnia+", którą w kodzie kończymy literą L.");
        float zmiennaFloat = 88.88f;
        System.out.println("Przykładowa zmienna float: "+zmiennaFloat+" czyli liczba ułamkowa, którą w kodzie kończymy literą f.");
        double zmiennaDouble = 888.888;
        System.out.println("Przykładowa zmienna double: "+zmiennaDouble+" czyli liczba ułamkowa.");
        boolean zmiennaBooleanTak = true;
        boolean zmiennaBooleanNie = false;
        System.out.println("Zmienna boolean to "+zmiennaBooleanTak+" oraz "+zmiennaBooleanNie+".");
        char zmiennaChar = 'P';
        System.out.println("Przykładowa zmienna typu char: "+zmiennaChar+", czyli pojedynczy znak w górnym apostrofie.");
        String zmiennaString = "Paulina Gigowska";
        System.out.println("Przykładowa zmienna typu string: "+zmiennaString+", czyli łańcuch znaków w cydzysłowie.\n");

        System.out.println("zad. 2a");
        int LiczbaA = 88, LiczbaB = 5;
        System.out.println("Wynik dodawania: "+(LiczbaA+LiczbaB)+".");
        System.out.println("Wynik odejmowania: "+(LiczbaA-LiczbaB)+".");
        System.out.println("Wynik mnożenia: "+(LiczbaA*LiczbaB)+".");
        System.out.println("Wynik dzielenia całkowitego: "+(LiczbaA/LiczbaB)+".");
        System.out.println("Reszta z dzielenia: "+(LiczbaA%LiczbaB)+".\n");

        System.out.println("zad. 2b");

        double LiczbaX = 88.88, LiczbaY = 5.5;
        System.out.println("Wynik dodawania: "+(LiczbaX+LiczbaY)+".");
        System.out.println("Wynik odejmowania: "+(LiczbaX-LiczbaY)+".");
        System.out.println("Wynik mnożenia: "+(LiczbaX*LiczbaY)+".");
        System.out.println("Wynik dzielenia całkowitego: "+(LiczbaX/LiczbaY)+".");
        System.out.println("Reszta z dzielenia: "+(LiczbaX%LiczbaY)+".");
    }
}