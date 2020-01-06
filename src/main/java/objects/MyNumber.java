package objects;

//Utwórz klasę o nazwie MyNumber, której jedyny konstruktor przyjmuje liczbę. Klasa powinna mieć następujące metody
//MyNumber isOdd() – true jeśli atrybut jest nieparzysty,
//MyNumber isEven() – true jeśli atrybut jest parzysty,
//MyNumber sqrt() – pierwiastek z atrybutu,
//MyNumber pow(MyNumber x) – atrybut podniesiony do potęgi x (przydatnej metody poszukaj w javadoc do klasy Math),
//MyNumber add(MyNumber x) – zwraca sumę atrybutu i x opakowaną w klasę MyNumber,
//MyNumber subtract(MyNumber x) – zwraca różnicę atrybutu i x opakowaną w klasę MyNumber.
public class MyNumber {

    private double number;

    public MyNumber(double number) {
        this.number = number;
    }

    public boolean isOdd() {
        return number % 2 == 1;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }

    public double sqrt() {
        return Math.sqrt(number);
    }

    public MyNumber pow(MyNumber x) {
        return new MyNumber(Math.pow(number, x.number));
    }

    public MyNumber add(MyNumber x) {
        return new MyNumber(number + x.number);
    }

    public MyNumber subtract(MyNumber x) {
        return new MyNumber(number - x.number);
    }
}
