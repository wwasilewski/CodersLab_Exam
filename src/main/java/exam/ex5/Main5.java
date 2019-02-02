//W pliku `Main5.java` umieść metodę o sygnaturze `static double ball()`.
//1. Uzupełnij ciało metody tak by pobierała z konsoli promień `r`.
//2. Zwracała obliczoną objętość kuli.

package exam.ex5;

public class Main5 {
    public static void main(String[] args) {

        Zad5 zad5 = new Zad5();
        String liczbaJakoString = String.format("%,.2f", zad5.ball());
        System.out.println("objetosc kuli po zaokragleniu: " + liczbaJakoString);
    }
}
