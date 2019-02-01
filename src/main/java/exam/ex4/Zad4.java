//W pliku `Main4.java` umieść metodę o sygnaturze `static int[] returnTab()`.
//1. Uzupełnij ciało metody tab by pobierała z konsoli parametr `n`, tworzyła tablicę o ilości elementów `n`.
//2. Elementy tablicy mają być kolejnymi liczbami naturalnymi zaczynając od 1.

package exam.ex4;

import java.util.Arrays;
import java.util.Scanner;

public class Zad4 {
    public int[] returnTab() {
        int[] result;
        Scanner sc = new Scanner(System.in);
        System.out.print("ile liczb naturalnych dodac do tablicy?: ");

        result = new int[sc.nextInt()];
        for (int i = 0; i < result.length; i++) {
            result[i] = i + 1;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
