//W pliku `Main2.java` umieść metodę o sygnaturze `static String shorten(String str, int length)`.
//Uzupełnij ciało metody tak, by dla otrzymanego napisu zwracała jego skrót o ilości znaków podanym w parametrze `length`.
//Przykład dla napisu `Naucz się programować od podstaw` oraz ilości znaków 2 otrzymamy `Na`.

package exam.ex2;

public class Main2 {

    public static void main(String[] args) {
        Zad2 zad2 = new Zad2();
        System.out.println(zad2.shorten("Testowy string", 2));
    }
}
