<img alt="Logo" src="http://coderslab.pl/svg/logo-coderslab.svg" width="400">


# Podstawy programowania w Java - egzamin
> Kilka ważnych informacji

Przed przystąpieniem do rozwiązywania zadań przeczytaj poniższe wskazówki

## Jak zacząć?

1. Stwórz [*fork*][forking] repozytorium z zadaniami.
2. [*Sklonuj*][ref-clone] repozytorium na swój komputer.
3. Rozwiąż zadania i [*skomituj*][ref-commit] zmiany do swojego repozytorium.
4. [*Wypchnij*][ref-push] zmiany do swojego repozytorium na GitHubie.
5. Stwórz [*pull request*][pull-request] do oryginalnego repozytorium, gdy skończysz wszystkie zadania.

#### Pamiętaj, że pull request musi być stworzony, aby wykładowca dostał Twoje odpowiedzi.

* podczas egzaminu **możesz** korzystać z notatek, kodu napisanego wcześniej, internetu i prezentacji,
* zabroniona jest jakakolwiek komunikacja z innymi kursantami oraz osobami na zewnątrz.


##### Odpowiedzi na pytania programistyczne umieszczaj w przygotowanych do tego plikach, nie zmieniaj nazw plików ani pakietów.

**Powodzenia!**

----------------------------------------------------------------------------------------


#### Zadanie 1 (1pkt)

W pliku `Main1.java` umieść metodę o sygnaturze `static int rectangle(int a, int b)`.

1. Uzupełnij ciało metody tak, by obliczyła i zwróciła pole prostokąta.


#### Zadanie 2. (2pkt)

W pliku `Main2.java` umieść metodę o sygnaturze `static String shorten(String str, int length)`.

1. Uzupełnij ciało metody tak, by dla otrzymanego napisu zwracała jego skrót o ilości znaków podanym w parametrze `length`.

Przykład dla napisu `Naucz się programować od podstaw` oraz ilości znaków 2 otrzymamy `Na`. 


#### Zadanie 3. (3pkt)

W pliku `Main3.java` umieść metodę o sygnaturze `static int[] div(int size, int interval)`.

1. Uzupełnij ciało metody tak by zwracała tablicę losowych liczb z zakresu `[1 - interval]`.
2. Elementy tablicy mają być jednocześnie podzielne przez 2 i niepodzielne przez 3.
3. Ilość elementów w tablicy ma być równa parametrowi `size`.
4. Tablica nie może zawierać pustych elementów. (pamiętaj że domyślna wartość w tablicy dla typu `int` to 0)

Przykład dla size = 4  oraz interval = 20 
```
[8,4,20,16]
```

#### Zadanie 4. (2pkt)

W pliku `Main4.java` umieść metodę o sygnaturze `static int[] returnTab()`.

1. Uzupełnij ciało metody tab by pobierała z konsoli parametr `n`, tworzyła tablicę o ilości elementów `n`.
2. Elementy tablicy mają być kolejnymi liczbami naturalnymi zaczynając od 1.

#### Zadanie 5. (3pkt)

W pliku `Main5.java` umieść metodę o sygnaturze `static double ball()`.

1. Uzupełnij ciało metody tab by pobierała z konsoli promień `r`.
2. Zwracała obliczoną objętość kuli.

#### Zadanie 6 (2pkt)

W pliku `Main6.java` umieść metodę o sygnaturze `static String replaceStr(String str, String forReplace, String replacement)`.
1. Uzupełnij ciało metody tak aby zwracała napis powstały z zamiany w napisie `str`
 wszystkich wystąpień napisu `forReplace` przez napis `replacement`.
 
#### Zadanie 7 (2pkt)

W pliku `Main7.java` umieść metoda o sygnaturze `static int countNumbers(String str) `.

1. Uzupełnij ciało metody tak aby zwracała sumę **cyfr** umieszczonych w napisie
Przykład: dla napisu `Wynik dodawania 1 i 2 to 3` zwróci `6`. 

Aby zamienić napis na wartość liczbową typu int możesz skorzystać z poniższego przykładu:
```java
int num = Integer.parseInt("3");
```
Dodaj obsługę możliwego wyjątku.

#### Zadanie 8. (5pkt)

W pliku `Main8.java` umieść metodę o sygnaturze `static void create(int max)`.

1. Uzupełnij ciało metody tak aby pobrała z konsoli parametr `n` - oznaczający ilość osób w grupie.
2. Następnie dla podanej ilości osób pobierze z konsoli loginy github oraz ilość punktów z egzaminu 
,zapisze je do pliku `exam.txt`, każde imię razem z oceną w nowej lini oddzielone znakiem spacji.

    Przykład pobierania dla 2 osób:
    
 ```
 Podaj login:
 arek-jozwiak-coderslab
 Podaj ilość punktów:
 11
 Podaj login:
 pawel321a
 Podaj ilość punktów:
 20
 ```
    
 Przykład wynikowego pliku:
 ```
 arek-jozwiak-coderslab 11
 pawel321a 20
 ```

3. Następnie wczytamy dane z pliku `exam.txt` i na ich podstawie utworzymy nowy plik `exam_passed.txt` ,
w którym znajdą się tylko te osoby, których ilość punktów przekracza 60% z maksymalnej ilości punktów określonych w parametrze `max`.

##### Możemy utworzyć dodatkowe metody pomocnicze natomiast całość programu ma się wykonać po wywołaniu metody create()
##### Pliki `exam.txt` oraz `exam_passed.txt` nie powinny być dodane do repozytorium.


<!-- Links -->
[forking]: https://guides.github.com/activities/forking/
[ref-clone]: http://gitref.org/creating/#clone
[ref-commit]: http://gitref.org/basic/#commit
[ref-push]: http://gitref.org/remotes/#push
[pull-request]: https://help.github.com/articles/creating-a-pull-request
