package methods;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodsPracticeTest {

    @BeforeAll
    static void printBeforeAll() {
        System.out.println("Tests starting");
    }

    @BeforeEach
    void setUp() {
        MethodsPractice methodsPractice = new MethodsPractice();
        System.out.println("Before each");
    }

    @Test
    public void shouldReturn10IfYearIs2010() {
        Integer addResult = MethodsPractice.myAge(2010);
        Integer result = 10;
        assertEquals(result, addResult);
    }

    @Test
    public void shouldReturnAIfWrittenA() {
        String addResult = MethodsPractice.myName("A");
        String result = "A";
        assertEquals(result, addResult);
    }

    @Test
    public void shouldReturn20WhenAdding10And10() {
        Integer addResult = MethodsPractice.sumDigits(10, 10);
        Integer result = 20;
        assertEquals(result, addResult);
    }

    @Test
    public void shouldReturn0WhenSubtracting10And10() {
        Integer addResult = MethodsPractice.subtractDigits(10, 10);
        Integer result = 0;
        assertEquals(result, addResult);
    }

    @Test
    public void shouldReturn100WhenMultiplying10And10() {
        Integer addResult = MethodsPractice.multiplyDigits(10, 10);
        Integer result = 100;
        assertEquals(result, addResult);
    }

    @Test
    public void shouldReturnTrueForNumber34() {
        boolean addResult = MethodsPractice.isEven(34);
        boolean result = true;
        assertEquals(result, addResult);
    }

    @Test
    public void shouldReturnTrueForNumber60() {
        boolean addResult = MethodsPractice.isDivisibleBy3and5(60);
        boolean result = true;
        assertEquals(result, addResult);
    }

    @Test
    public void shouldReturn1000ForNumber10() {
        Integer addResult = MethodsPractice.powerDigit(10);
        Integer result = 1000;
        assertEquals(result, addResult);
    }

    @Test
    public void shouldReturn10ForNumber100() {
        Integer addResult = MethodsPractice.squareRootOfNumber(100);
        Integer result = 10;
        assertEquals(result, addResult);
    }

    @Test
    public void shouldReturnTrueForNumbers3and4and5() {
        boolean addResult = MethodsPractice.canBuildATriangle(3, 4, 5);
        boolean result = true;
        assertEquals(result, addResult);
    }

    @AfterEach
    void printAfterEach() {
        System.out.println("After each.");
    }

    @AfterAll
    static void printAfterAll() {
        System.out.println("All tests finished");
    }
}
