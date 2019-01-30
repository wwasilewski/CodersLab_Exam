//W pliku `Main3.java` umieść metodę o sygnaturze `static int[] div(int size, int interval)`.
//1. Uzupełnij ciało metody tak by zwracała tablicę losowych liczb z zakresu `[1 - interval]`.
//2. Elementy tablicy mają być jednocześnie podzielne przez 2 i niepodzielne przez 3.
//3. Ilość elementów w tablicy ma być równa parametrowi `size`.
//4. Tablica nie może zawierać pustych elementów. (pamiętaj że domyślna wartość w tablicy dla typu `int` to 0)
//Przykład dla size = 4 oraz interval = 20 - [8,4,20,16]

package exam.ex3;

import java.util.Random;

public class Zad3 {

    public int[] div(int size, int interval) {

        int array[] = new int[size];
        int tempInt;
        Random generator = new Random();

        for (int i = 0; i < array.length; i++)
        {
            tempInt = generator.nextInt(interval) + 1;
            if (tempInt%2 == 0 && tempInt%3 != 0)
            {
                array[i] = tempInt;
            }
            //System.out.print(array[i] + " ");
        }
        return array;
    }
}
