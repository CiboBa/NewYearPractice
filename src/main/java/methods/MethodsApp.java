package methods;

import java.time.ZonedDateTime;

public class MethodsApp {

    public static void main(String[] args) {
        /*1*/
        int birthDate = 1984;
        System.out.println("My actual age is: " + MethodsPractice.myAge(birthDate));
        /*2*/
        String name = null;
        System.out.println("My name is: " + MethodsPractice.myName(name));
        /*3*/
        int a = 5;
        int b = 4;
        System.out.println("The sum of digits " + a + " and " + b + " is: " + MethodsPractice.sumDigits(a, b));
        System.out.println("The subtraction of digits " + a + " and " + b + "is: " + MethodsPractice.subtractDigits(a, b));
        System.out.println("The product of digits " + a + " and " + b + "is: " + MethodsPractice.multiplyDigits(a, b));
        /*4*/
        int c = 34;
        System.out.println("The number " + c + " is even: " + MethodsPractice.isEven(c));
        /*5*/
        int d = 33;
        int e = 60;
        System.out.println("The number " + d + " is divisible by 3 and 5: " + MethodsPractice.isDivisibleBy3and5(d));
        System.out.println("The number " + e + " divisible by 3 and 5: " + MethodsPractice.isDivisibleBy3and5(e));
        /*6*/
        int f = 3;
        System.out.println("The number " + f + " to power 3 is: " + MethodsPractice.powerDigit(f));
        /*7*/
        int g = 25;
        System.out.println("The square root of " + g + " is: " + MethodsPractice.squareRootOfNumber(g));
        /*8*/
        int h = 3;
        int i = 4;
        int j = 5;
        System.out.println("Of stretches " + h + ", " + i + ", " + j + " you do can build a triangle: " + MethodsPractice.canBuildATriangle(h, i, j));
    }
}

class MethodsPractice {

    //9. Napisz testy do wszystkich metod

    //8. Napisz metodę, która jako argument przyjmie trzy liczby. Metoda powinna zwrócić true jeśli z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny.
    public static boolean canBuildATriangle(int a, int b, int c) {
        if (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
            return true;
        }
        return false;
    }

    //7. Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy (użyj Math).
    public static int squareRootOfNumber(int a) {
        return (int) Math.sqrt(a);
    }

    //6. Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi.
    public static int powerDigit(int a) {
        return (int) Math.pow(a, 3);
    }

    //5. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest podzielna przez 3 i przez 5.
    public static boolean isDivisibleBy3and5(int a) {
        if (a % 3 == 0 && a % 5 == 0) {
            return true;
        }
        return false;
    }

    //4. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta.
    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }

    //3. Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę i iloczyn.
    public static int sumDigits(int a, int b) {
        return a + b;
    }

    public static int subtractDigits(int a, int b) {
        return a - b;
    }

    public static int multiplyDigits(int a, int b) {
        return a * b;
    }

    //2. Napisz metodę, która zwróci Twoje imię.
    public static String myName(String name) {
        return name;
    }

    //1. Napisz metodę, która zwróci Twój aktualny wiek.
    public static int myAge(int myBirthDate) {
        int currentDate = ZonedDateTime.now().getYear();
        return currentDate - myBirthDate;
    }
}
