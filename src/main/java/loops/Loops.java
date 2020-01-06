package loops;

public class Loops {

    public static void main(String[] args) {
        int a = 34;
        showDigitsToX(a);
        showDigitsToY(a);
    }

    //2. Jeśli w zadaniu 1. użyłeś pętli for przerób tę metodę na while (lub odwrotnie).
    private static void showDigitsToY(int y) {
        int i = 0;
        System.out.print("{ ");
        while (i < y) {
            System.out.print(i + ", ");
            i++;
        }
        System.out.println(y + " }");
    }

    //1 .Utwórz metodę pobierającą dodatnią liczbę całkowitą X, która wyświetli na ekranie liczby od zera do X.
    private static void showDigitsToX(int x) {
        System.out.print("{ ");
        for (int i = 0; i < x; i++) {
            System.out.print(i + ", ");
        }
        System.out.println(x + " }");
        System.out.println("---------------");
    }
}
