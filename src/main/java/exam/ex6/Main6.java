//W pliku `Main6.java` umieść metodę o sygnaturze `static String replaceStr(String str, String forReplace, String replacement)`.
//1. Uzupełnij ciało metody tak aby zwracała napis powstały z zamiany w napisie `str`
// wszystkich wystąpień napisu `forReplace` przez napis `replacement`.

package exam.ex6;

public class Main6 {
    public static void main(String[] args) {

        Zad6 zad6 = new Zad6();
        System.out.println("poczatkowy napis: \"string bedzie zamieniony\"");
        System.out.println("po zamianie \"bedzie\" na \"jest\": "
                + zad6.replaceStr("string bedzie zamieniony", "bedzie", "jest"));
    }
}
