package loops;

public class Loops {

    public static void main(String[] args) {
        int a = 134;
        showDigitsToX(a);
        showDigitsToY(a);
        printReversedNumber(a);
    }

    private static void printReversedNumber(int z) {
        String zValueString = String.valueOf(z);
        char[] zValueArray = new char[zValueString.length()];
        for (int i = 0; i < zValueString.length(); i++) {
            zValueArray[i] = zValueString.charAt(i);
        }
        for (int j = zValueArray.length - 1; j >= 0; j--) {
            System.out.println(zValueArray[j]);
        }
        System.out.println("---------------");
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
        System.out.println("---------------");
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
