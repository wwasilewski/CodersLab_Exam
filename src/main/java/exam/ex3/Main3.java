//W pliku `Main3.java` umieść metodę o sygnaturze `static int[] div(int size, int interval)`.
//1. Uzupełnij ciało metody tak by zwracała tablicę losowych liczb z zakresu `[1 - interval]`.
//2. Elementy tablicy mają być jednocześnie podzielne przez 2 i niepodzielne przez 3.
//3. Ilość elementów w tablicy ma być równa parametrowi `size`.
//4. Tablica nie może zawierać pustych elementów. (pamiętaj że domyślna wartość w tablicy dla typu `int` to 0)
//Przykład dla size = 4 oraz interval = 20 - [8,4,20,16]


package exam.ex3;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {

        Zad3 zad3 = new Zad3();
        System.out.println(Arrays.toString(zad3.div(33,20)));
    }
}
