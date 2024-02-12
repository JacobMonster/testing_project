package calculator;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeClass
    public static void init() {
        calculator = new Calculator();
    }

    @Test
    public void testPowerTwoNumbers() {
        Assert.assertEquals(25, calculator.powerTwoNumbers(5, 2), 0);
    }

    @Test
    public void testSqrt() {
        Assert.assertEquals(5, calculator.sqrt(25), 0);
    }

    @Test
    public void testCalculateSquareArea() {
        Assert.assertEquals(25, calculator.CalculateSquareArea(5), 0);
    }

    @Test
    public void testCalculateRectArea() {
        Assert.assertEquals(10, calculator.CalculateRectArea(2, 5), 0);
    }

    @Test
    public void testCalculateSquareCirc() {
        Assert.assertEquals(16, calculator.CalculateSquareCirc(4));
    }

    @Test
    public void testCalculateRectCirc() {
        Assert.assertEquals(12, calculator.CalculateRectCirc(2, 4));
    }

    @Test
    public void testCalculateTriangleArea() {
        Assert.assertEquals(10, calculator.CalculateTriangleArea(5, 4), 0);
    }

    @Test
    public void testCalculateTriangleCirc() {
        Assert.assertEquals(12, calculator.CalculateTriangleCirc(4, 4, 4), 0);
    }

    @Test
    public void testConvertCelsiusToFarenheit() {
        Assert.assertEquals(50, calculator.convertCelsiusToFarenheit(10), 0);
    }

    @Test
    public void testConvertFarenheitToCelsius() {
        Assert.assertEquals(10, calculator.convertFarenheitToCelsius(50), 0);
    }

    @Test
    public void testConvertFromMphToKph() {
        Assert.assertEquals(16.1, calculator.convertFromMphToKph(10), 0);
    }

    @Test
    public void testFactorial() {
        Assert.assertEquals(120, calculator.factorial(5));
    }

    @Test
    public void testFibbonacci() {
        Assert.assertEquals(5, calculator.fibbonacci(5));
    }

    @Test
    public void testFindGCD() {
        Assert.assertEquals(3, calculator.findGCD(9, 6));
    }

    @Test
    public void testFindLCM() {
        Assert.assertEquals(12, calculator.findLCM(3, 4));
    }

    @Test
    public void testIsPrime() {
        // Test pierwszej liczby pierwszej
        Assert.assertTrue(calculator.isPrime(2));

        // Test kolejnych liczb pierwszych
        Assert.assertTrue(calculator.isPrime(3));
        Assert.assertTrue(calculator.isPrime(5));
        Assert.assertTrue(calculator.isPrime(7));
        Assert.assertTrue(calculator.isPrime(11));

        // Test liczb niebędących pierwszymi
        Assert.assertFalse(calculator.isPrime(4));
        Assert.assertFalse(calculator.isPrime(6));
        Assert.assertFalse(calculator.isPrime(8));
        Assert.assertFalse(calculator.isPrime(9));
        Assert.assertFalse(calculator.isPrime(10));
        Assert.assertFalse(calculator.isPrime(12));

        // Test dla liczby mniejszej lub równiej 1
        Assert.assertFalse(calculator.isPrime(1));
        Assert.assertFalse(calculator.isPrime(0));
        Assert.assertFalse(calculator.isPrime(-1));
    }
}
