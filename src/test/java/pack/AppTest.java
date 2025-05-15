package pack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void testAddition() {
        calculator c = new calculator();
        c.a = 5;
        c.b = 10;
        assertEquals(15, c.addition(), "Addition should return the sum of a and b");
    }

    @Test
    public void testSubtraction() {
        calculator c = new calculator();
        c.a = 20;
        c.b = 5;
        assertEquals(15, c.subtraction(), "Subtraction should return the difference of a and b");
    }

    @Test
    public void testMultiplication() {
        calculator c = new calculator();
        c.a = 4;
        c.b = 3;
        assertEquals(12, c.multiplication(), "Multiplication should return the product of a and b");
    }

    @Test
    public void testDivision() {
        calculator c = new calculator();
        c.a = 20;
        c.b = 4;
        assertEquals(5, c.division(), "Division should return the quotient of a divided by b");
    }

    @Test
    public void testDivisionByZero() {
        calculator c = new calculator();
        c.a = 10;
        c.b = 0;
        try {
            c.division();
        } catch (ArithmeticException e) {
            assertEquals("Cannot divide by zero", e.getMessage());
        }
    }

    @Test
    public void testsquare() {
        calculator c = new calculator();
        c.a = 5;
        assertEquals(25, c.square(), "Square should return the squred value of a");
    }

    @Test
    public void testmodulus() {
        calculator c = new calculator();
        c.a = 6;
        c.b = 5;
        assertEquals(1, c.modulus(), "modulus should return the remainder when we divide a with b");
    }

    @Test
    public void testmodulusbyzero() {
        calculator c = new calculator();
        c.a = 6;
        c.b = 0;
        try{
            c.modulus();
        } catch(ArithmeticException e) {
            assertEquals("Cannot divide by zero", e.getMessage());
        }
    }
}
