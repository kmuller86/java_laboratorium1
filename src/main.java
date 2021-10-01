import java.util.Scanner;
import java.util.Locale;

public class main {

    public static void main(String[] args) {

        /* ćw.5 */

        int nrIndeksu = 567088;
        int wiek = 21;
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */

        if (wiek % 3 == 0) {
            System.out.println("Wiek podzielny przez 3");
        } else {
            System.out.println("Wiek niepodzielny przez 3");
        }

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */

        String podzielny = (nrIndeksu % 2 == 0) ? "Indeks parzysty" : "Indeks nieparzysty";
        System.out.println("Wynik: " + podzielny);

        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        System.out.print("Wpisz liczbe zmiennoprzecinkowa: ");
        double liczba = scan.nextDouble();

        if (liczba > 5.0) {
            System.out.println("Wpisana liczba jest wieksza od 5");
        } else if (liczba < 5.0) {
            System.out.println("Wpisana liczba jest wieksza od 5");
        } else {
            System.out.println("Wpisana liczba jest rowna 5");
        }

    }
}
