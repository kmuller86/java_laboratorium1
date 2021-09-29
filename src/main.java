import java.util.Scanner;

public class main
{

    public static void main(String[] args)
    {

        /* Operatory logiczne */
        boolean a = true;
        boolean b = false;
        boolean c = true;

        /* Operatory porównania */
        int x = 5;
        int y = 7;
        int z = 5;

        /* zad.1 proszę dodać kilka złożonych operacji uzywając kilku operatorów */
        System.out.println("((y >= x) || (b && c)) : " + ((y >= x) || (b && c))); // true
        System.out.println("((true || c) || (false && c)) : " + ((true || c) || (c && false))); // true
        System.out.println("!((a || c) || !(c && a) || (x >= z)) : " + !((a || c) || !(c && a) || (x >= z))); //true
        System.out.println("((y < x + z) && (a && c) && (z * x > x + y / 2)) : " + ((y < x + z) && (a && c) && (z * x > x + y / 2))); // true

    }
}