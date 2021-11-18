import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    BMICalculator TestValue;
    BMICalculator TestValue2;
    BMICalculator TestValue3;

    @BeforeEach
    void setUp() {
        TestValue = new BMICalculator("Martina","Sallmann",'w',174,52);
        TestValue2 = new BMICalculator("Tim","Musterfrau", 'm', 180, 80);
        TestValue3 = new BMICalculator("MAx","Mustermann",'m', 202, 114);
    }

    @Test
    void calculateBMI() {
        assertEquals(17.18, TestValue.calculateBMI());
        assertEquals(24.69, TestValue2.calculateBMI());
        assertEquals(27.94, TestValue3.calculateBMI());
    }

    @Test
    void calculateBMICategory() {
        assertEquals(-1, TestValue.calculateBMICategory());
        assertEquals(0, TestValue2.calculateBMICategory());
        assertEquals(1, TestValue3.calculateBMICategory());
    }

    @Test
    void getBMICategoryName() {
        assertEquals("Untergewicht", TestValue.getBMICategoryName());
        assertEquals("Normalgewicht", TestValue2.getBMICategoryName());
        assertEquals("Übergewicht", TestValue3.getBMICategoryName());
    }
}