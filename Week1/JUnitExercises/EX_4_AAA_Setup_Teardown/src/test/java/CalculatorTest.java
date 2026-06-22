import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {

        System.out.println("Setting up test...");

        calculator = new Calculator();
    }

    @After
    public void tearDown() {

        System.out.println("Cleaning up...");

        calculator = null;
    }

    @Test
    public void testAdd() {

        // Arrange
        int a = 2;
        int b = 3;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(5, result);
    }
}