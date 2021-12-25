import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.4 */

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów arytmetycznych i logicznych */
        int p = 10, q = 20, r = 10;
        System.out.println("Gdy p = 10, q = 20, a r = 10 operacja p*q==r*q daje rozwiązanie: "+(p*q==r*q)+".");
        System.out.println("Natomiast operacja p+q!=q+r daje rozwiązanie: "+(p+q!=q+r)+".\n");

        boolean a = true, b = false, c = true, d = false;
        System.out.println("Gdy a = true, b = false, c = true, d = false operacja !(a && c)||(d||b) daje rozwiązanie: "+(!(a && c)||(d||b))+".");
        System.out.println("Natomiast operacja a||(d||b) daje rozwiązanie: "+(a||(d||b))+".");
    }
}