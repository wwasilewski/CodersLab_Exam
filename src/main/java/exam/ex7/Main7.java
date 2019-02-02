//W pliku `Main7.java` umieść metoda o sygnaturze `static int countNumbers(String str) `.
//Uzupełnij ciało metody tak aby zwracała sumę **cyfr** umieszczonych w napisie
//Przykład: dla napisu `Wynik dodawania 1 i 2 to 3` zwróci `6`.
//Aby zamienić napis na wartość liczbową typu int możesz skorzystać z poniższego przykładu:
//int num = Integer.parseInt("3");
//Dodaj obsługę możliwego wyjątku.

package exam.ex7;

public class Main7 {
    public static void main(String[] args) {

        Zad7 zad7 = new Zad7();
        System.out.println("1 + 2 + 3 + 4 dodac 5 to: "
                + zad7.countNumbers("1 + 2 + 3 + 4 dodac 5"));
    }
}
