import org.example.Ints;
import org.example.IntsCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculator {
    @Test
    public void testCalculator() {
        Ints intsCalc = new IntsCalculator();
        int resultSum = intsCalc.sum(66, 4);
        int expectedSum = 70;
        Assertions.assertEquals(resultSum, expectedSum);

        int resultPow = intsCalc.pow(5, 3);
        int expectedPow = 125;
        Assertions.assertEquals(resultPow, expectedPow);

        int resultMult = intsCalc.mult(3, 4);
        int expectedMult = 12;
        Assertions.assertEquals(resultMult, expectedMult);

    }
}
