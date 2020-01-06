package objects;

//Utwórz klasę reprezentującą prostokąt, musi posiadać atrybuty długość i szerokość.
//Klasa powinna posiadać metody obliczające pole, obwód i długość przekątnej.
class Rectangle {

    private int length;
    private int width;

    public static int rectangleArea(int length, int width) {
        return Math.multiplyExact(length, width);
    }

    public static int rectangleCircuit(int length, int width) {
        return 2 * length + 2 * width;
    }

    public static int rectangleDiagonalLength(int length, int width) {
        int lengthPower = (int) Math.pow(length, 2);
        int widthPower = (int) Math.pow(width, 2);
        return (int) Math.sqrt(lengthPower + widthPower);
    }
}
