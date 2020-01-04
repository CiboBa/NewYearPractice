package objectsAndPackages;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class RectangleTest {

    @BeforeEach
    void setup() {
        Rectangle rectangle = new Rectangle();
    }

    @Test
    public void return50IfLength5AndWidth10() {
        Integer addResult = Rectangle.rectangleArea(5, 10);
        Integer result = 50;
        Assertions.assertEquals(result, addResult);
    }
    @Test
    public void return30IfLength5AndWidth10() {
        Integer addResult = Rectangle.rectangleCircuit(5, 10);
        Integer result = 30;
        Assertions.assertEquals(result, addResult);
    }
    @Test
    public void return5IfLength3AndWidth4() {
        Integer addResult = Rectangle.rectangleDiagonalLength(3,4);
        Integer result = 5;
        Assertions.assertEquals(result, addResult);
    }
}
