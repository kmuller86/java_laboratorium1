import java.util.Scanner;

public class main
{
    /* ćw.3 */

    /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
     *   a) Imię, nazwisko, wiek, nr indeksu,
     *   dane mają być wprowadzane z klawiatury w konsoli
     *   b) wyświetlić dane za pomocą println i printf
     */


    /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
     *   wynik wyświetlić w konsoli programu
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Podaj swoje imie: ");
        String imie = scan.next();
        System.out.print("Podaj swoje nazwisko: ");
        String nazwisko = scan.next();
        System.out.print("Podaj swoj wiek: ");
        int wiek = scan.nextInt();
        System.out.print("Podaj swoj numer indeksu: ");
        int indeks = scan.nextInt();

        System.out.print("Podaj liczbe nr 1: ");
        int liczba1 = scan.nextInt();
        System.out.print("Podaj liczbe nr 2: ");
        int liczba2 = scan.nextInt();

        System.out.printf("Twoje imie to %s a nazwisko to %s \n", imie, nazwisko);
        System.out.println("Twój wiek to " + wiek + " i numer indeksu to " + (indeks));
        System.out.println("Dodawanie: " + (liczba1 + liczba2));
        System.out.println("Dodawanie: " + (liczba1 - liczba2));
        System.out.println("Dodawanie: " + (liczba1 * liczba2));
        System.out.println("Dodawanie: " + (liczba1 / liczba2));
        System.out.println("Dodawanie: " + (liczba1 % liczba2));

    }
}