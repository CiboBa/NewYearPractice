package loops;

public class Loops {

    public static void main(String[] args) {
        int a = 123;
        showDigitsToX(a);
        showDigitsToY(a);
        printReversedNumber(a);

        String word = "pies";
        reverseWord(word);

        Integer b = 5;
        binaryForm(b);

        String wordToCheck = "kajak";
        System.out.println(isPalindrom(wordToCheck));
    }

    // 7. Utwórz metodę, pobierającą łańcuch znaków, która sprawdzi czy jest on palindromem.
    // Np. “kajak” jest palindromem (to samo czytane “od przodu i od tyłu”) jednak “kotek” już nie. Może przydać Ci się metoda String#toCharArray
    private static boolean isPalindrom(String wordToCheck) {
        StringBuffer stringBuffer=new StringBuffer(wordToCheck);
        stringBuffer.reverse();
        if (String.valueOf(stringBuffer).equalsIgnoreCase(wordToCheck)){
            return true;
        }
        return false;
    }

    //6. Utwórz metodę, która pobierze liczbę oraz zwróci ją w formie binarnej (2 => “10”, 4 => “100”, 5 => “101”, itd.). System binarny opisałem w osobnym artykule,
    private static void binaryForm(Integer b) {
        System.out.println(Integer.toBinaryString(b));
        System.out.println("---------------");
    }

    //5. Utwórz metodę, która jako argument pobierze obiekt klasy String i zwróci “odwrócony” argument. Na przykład “pies” przekształci w “seip”,
    private static void reverseWord(String word) {
        StringBuffer stringBuffer = new StringBuffer(word);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        System.out.println("---------------");
    }

    //4. Utwórz metodę, która pobierze liczbę i wypisze każdy znak w osobnej linii zaczynając od ostatniej cyfry (np. dla liczby 123 będą to trzy linie z 3, 2 i 1),
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
