package arrays;

public class Arrays {

    public static void main(String[] args) {
        char[] charArray = new char[5];
        getFirstLetters(charArray);
        reverseArray(charArray, charArray.length);
    }

    //2. Napisz metodę pobierającą trójelementową tablicę liczb, która zwróci tablicę zawierającą te same elementy w odwróconej kolejności
    private static void reverseArray(char[] charArray, int arrayLength) {
        char[] charArrayReversed = new char[arrayLength];
        for (int i = 0, j = arrayLength - 1; i < arrayLength; i++, j--) {
            charArrayReversed[j] = charArray[i];
        }
        for (char c : charArrayReversed) {
            System.out.print("{ " + c + " }");
        }
    }

    //1. Napisz metodę, która zwróci tablicę char[] zawierającą pierwsze 5 liter alfabetu,
    private static void getFirstLetters(char[] charArray) {

        for (char i = 'a', j = 0; i <= 'z' && j < charArray.length; i++, j++) {
            charArray[j] = i;
            System.out.print("{ " + charArray[j] + " }");
        }
        System.out.println("\n--------------");
    }
}
