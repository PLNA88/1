import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
        System.out.println("zad. 1");
        int age = 23;
        if (age%3 == 0) {
            System.out.println("Podzielny przez 3");
        } else {
            System.out.println("Niepodzielny przez 3");
        }

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */
        System.out.println("zad. 2");
        int id = 40801;
        String spr = (id%2) == 0 ? "Numer indeksu jest parzysty." : "Numer indeksu jest nieparzysty.";
        System.out.println(spr);

        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */
        System.out.println("zad. 3");
        Scanner scan = new Scanner(System.in);
        System.out.print("Wprowadź liczbę zmiennoprzecinkową: ");
        float x = scan.nextFloat();
        if (x >= 50) {
            System.out.println("Wprowadzona liczba jest większa od 50.");
        } else {
            System.out.println("Wprowadzona liczba jest mniejsza od 50.");
        }
    }
}