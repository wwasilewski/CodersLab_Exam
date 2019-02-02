//W pliku `Main5.java` umieść metodę o sygnaturze `static double ball()`.
//1. Uzupełnij ciało metody tak by pobierała z konsoli promień `r`.
//2. Zwracała obliczoną objętość kuli.

package exam.ex5;

import java.util.Locale;
import java.util.Scanner;

public class Zad5 {
    public double ball() {
        double result;
        double radius;
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("podaj promien kuli do obliczenia jej objetosci(wartosci ulamkowe oddzielaj kropka, np 4.5): ");

        radius = sc.nextDouble();
        result = Math.PI * Math.pow(radius, 3) * 4 / 3;

        sc.close();
        return result;
    }
}
