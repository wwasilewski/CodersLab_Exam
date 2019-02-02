//W pliku `Main7.java` umieść metoda o sygnaturze `static int countNumbers(String str) `.
//Uzupełnij ciało metody tak aby zwracała sumę **cyfr** umieszczonych w napisie
//Przykład: dla napisu `Wynik dodawania 1 i 2 to 3` zwróci `6`.
//Aby zamienić napis na wartość liczbową typu int możesz skorzystać z poniższego przykładu:
//int num = Integer.parseInt("3");
//Dodaj obsługę możliwego wyjątku.


package exam.ex7;

public class Zad7 {

    public int countNumbers(String str) {

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            try {
                sum = sum + Integer.parseInt(str.charAt(i) + "");
            } catch (Exception e) {
                e.getMessage();
            }
        }
        return sum;

//        DRUGI SPOSOB:
//        int result = 0;
//        for (int i = 0; i < str.length(); i++) {
//            if (Character.isDigit(str.charAt(i))) {
//                result = result + Character.getNumericValue(str.charAt(i));
//            }
//        }
//        return result;
    }
}
