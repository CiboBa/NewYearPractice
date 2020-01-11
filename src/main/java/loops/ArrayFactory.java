package loops;

import java.util.Arrays;

//3. Napisz klasę ArrayFactory, która w konstruktorze pobierze liczbę całkowitą X. Klasa powinna mieć 2 metody:
public class ArrayFactory {

    public static void main(String[] args) {
        int i = 3;
        ArrayFactory arrayFactory = new ArrayFactory(i);
        int[] oneDimensionArray = oneDimension(i);
        printOneDimensionArray(oneDimensionArray);
        int[][] twoDimensionArray = twoDimension(i);
        printTwoDimensionArray(twoDimensionArray);
        int[][] filledArray= fillUnitMatrix(twoDimensionArray);
        printTwoDimensionArray(filledArray);
    }


    public ArrayFactory(int i) {
    }

    //3a. int[] oneDimension – zwróci instancję tablicy jednowymiarowej o długości X,
    public static int[] oneDimension(int i) {
        return new int[i];
    }

    //3b. int[][] twoDimension – zwróci instację tablicy dwuwymiarowej gdzie liczba wierszy i liczba kolumn równa się X,
    public static int[][] twoDimension(int i) {
        return new int[i][i];
    }

    private static void printOneDimensionArray(int[] oneDimensionArray) {
        System.out.println(Arrays.toString(oneDimensionArray));
    }

    private static void printTwoDimensionArray(int[][] twoDimensionArray) {
        for (int j = 0; j < twoDimensionArray.length; j++) {
            for (int k = 0; k < twoDimensionArray[j].length; k++) {
                System.out.print(twoDimensionArray[j][k]);
            }
            System.out.println();
        }
        System.out.println("----------");
    }

    //8. Do klasy ArrayFactory dodaj metodę zwracającą macierz jednostkową (jedynki “na przekątnej”),
    public static int[][] fillUnitMatrix(int[][] twoDimension) {
        for (int i = 0; i < twoDimension.length; i++) {
            for (int j = 0; j < twoDimension[i].length; j++) {
                if (i == j) {
                    twoDimension[i][j] = 1;
                } else twoDimension[i][j] = 0;
            }
        }
        return twoDimension;
    }
}
