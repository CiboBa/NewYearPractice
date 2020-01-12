package primitiveTypes;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PrimitiveTypesApp {

    public static void main(String[] args) {
//        Integer inputNumber = getInputNumber();
//        System.out.println(inputNumber + "\n-----------------");
//        System.out.println(binaryForm(inputNumber) + "\n-----------------");

        int[] inputNumber2 = createArray();
    }

    //1. Napisz program, który pobierze od użytkownika liczbę całkowitą, a następnie wyświetli jej binarną reprezentację na ekranie,
    private static int getInputNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static String binaryForm(Integer decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }

    //2. Napisz program, który pobierze od użytkownika liczbę całkowitą N reprezentującą długość tablicy,
    // a następnie poprosi o N kolejnych liczb uzupełniając nimi wcześniej stworzoną tablicę.
    // Wyświetl na konsoli tablicę posortowaną w kolejności od najmniejszej do największej liczby,
    private static int[] createArray() {
        System.out.println("Podaj rozmiar tablicy: ");
        int scanner = getInputNumber();
        int[] newArray = new int[scanner];
        System.out.println("Uzupełnij " + scanner + " wartości w tablicy:");
        for (int i = 0; i < newArray.length; i++) {
            int scanInt = new Scanner(System.in).nextInt();
            newArray[i] = scanInt;
        }
        System.out.println("Twoja tablica to: ");
        printArrayValues(newArray);
        sortArrayValues(newArray);
        System.out.println("\nTwoja tablica posortowana wygląda tak: ");
        printArrayValues(newArray);
        return newArray;
    }

    private static void sortArrayValues(int[] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    private static void printArrayValues(int[] newArray) {
        for (int i : newArray) {
            System.out.print(i + " ");
        }
    }
}