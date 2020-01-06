package loops;

//3. Napisz klasę ArrayFactory, która w konstruktorze pobierze liczbę całkowitą X. Klasa powinna mieć 2 metody:
public class ArrayFactory {

    public ArrayFactory arrayFactory(int i) {
        return new ArrayFactory();
    }

    //3a. int[] oneDimension – zwróci instancję tablicy jednowymiarowej o długości X,
    public int[] oneDimension(int i) {
        return new int[i];
    }

    //3b. int[][] twoDimension – zwróci instację tablicy dwuwymiarowej gdzie liczba wierszy i liczba kolumn równa się X,
    public int[][] twoDimension(int i){
        return new int[i][i];
    }
}
