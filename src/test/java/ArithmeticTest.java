import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticTest {

    // Unit Test on Addition

    @Test
    void toGetSevenWhenAddingFiveAndTwo() {
        Arithmetic arithmetic = new Arithmetic(5, 2);
        int exceptedValue = 7;
        int actualValue = arithmetic.addition();
        assertEquals(exceptedValue, actualValue);
    }

    @Test
    void toGetMinusTwoWhenAddingMinusFiveAndThree() {
        Arithmetic arithmetic = new Arithmetic(-5, 3);
        int exceptedValue = -2;
        int actualValue = arithmetic.addition();
        assertEquals(exceptedValue, actualValue);
    }

    @Test
    void toGetThreeWhenAddingEightAndMinusFive() {
        Arithmetic arithmetic = new Arithmetic(8, -5);
        int exceptedValue = 3;
        int actualValue = arithmetic.addition();
        assertEquals(exceptedValue, actualValue);
    }

    @Test
    void toGetMinusEightWhenAddingMinusSixAndMinusTwo() {
        Arithmetic arithmetic = new Arithmetic(-6, -2);
        int exceptedValue = -8;
        int actualValue = arithmetic.addition();
        assertEquals(exceptedValue, actualValue);
    }

    // Unit Test on Subtraction

    @Test
    void toGetTwoWhenSubtractionFourAndTwo() {
        Arithmetic arithmetic = new Arithmetic(4, 2);
        int exceptedValue = 2;
        int actualValue = arithmetic.subtraction();
        assertEquals(exceptedValue, actualValue);
    }

    @Test
    void toGetMinusTwoWhenSubtractionMinusFourAndMinusTwo() {
        Arithmetic arithmetic = new Arithmetic(-4, -2);
        int exceptedValue = -2;
        int actualValue = arithmetic.subtraction();
        assertEquals(exceptedValue, actualValue);
    }

    @Test
    void toGetMinusSixWhenSubtractionMinusFourAndTwo() {
        Arithmetic arithmetic = new Arithmetic(-4, 2);
        int exceptedValue = -6;
        int actualValue = arithmetic.subtraction();
        assertEquals(exceptedValue, actualValue);
    }

    @Test
    void toGetSixWhenSubtractionFourAndMinusTwo() {
        Arithmetic arithmetic = new Arithmetic(4, -2);
        int exceptedValue = 6;
        int actualValue = arithmetic.subtraction();
        assertEquals(exceptedValue, actualValue);
    }

    // Unit Test on Multiplication

    @Test
    void toGetEightWhenMultiplicationFourAndTwo() {
        Arithmetic arithmetic = new Arithmetic(4, 2);
        int exceptedValue = 8;
        int actualValue = arithmetic.multiplication();
        assertEquals(exceptedValue, actualValue);
    }

    @Test
    void toGetEightWhenMultiplicationMinusFourAndMinusTwo() {
        Arithmetic arithmetic = new Arithmetic(-4, -2);
        int exceptedValue = 8;
        int actualValue = arithmetic.multiplication();
        assertEquals(exceptedValue, actualValue);
    }

    @Test
    void toGetMinusEightWhenMultiplicationMinusFourAndTwo() {
        Arithmetic arithmetic = new Arithmetic(-4, 2);
        int exceptedValue = -8;
        int actualValue = arithmetic.multiplication();
        assertEquals(exceptedValue, actualValue);
    }

    @Test
    void toGetMinusEightWhenMultiplicationFourAndMinusTwo() {
        Arithmetic arithmetic = new Arithmetic(4, -2);
        int exceptedValue = -8;
        int actualValue = arithmetic.multiplication();
        assertEquals(exceptedValue, actualValue);
    }

    // Unit Test on Division

    @Test
    void toGetZeroDivisionErrorWhenDivisionFiveAndZero() {
        try {
            Arithmetic arithmetic = new Arithmetic(5, 0);
            int exceptedValue = 5;
            int actualValue = arithmetic.division();
            assertEquals(exceptedValue, actualValue);
        }catch(ArithmeticException exception){
            String exceptedValue = "class java.lang.ArithmeticException";
            assertEquals(exceptedValue, exception.getClass().toString());
        }
    }

    @Test
    void toGetMinusFiveWhenDivisionMinusTenAndTwo() {
        Arithmetic arithmetic = new Arithmetic(-10, 2);
        int exceptedValue = -5;
        int actualValue = arithmetic.division();
        assertEquals(exceptedValue, actualValue);
    }

    @Test
    void toGetMinusFiveWhenDivisionTenAndMinusTwo() {
        Arithmetic arithmetic = new Arithmetic(10, -2);
        int exceptedValue = -5;
        int actualValue = arithmetic.division();
        assertEquals(exceptedValue, actualValue);
    }

    @Test
    void toGetFiveWhenDivisionTenAndTwo() {
        Arithmetic arithmetic = new Arithmetic(10, 2);
        int exceptedValue = 5;
        int actualValue = arithmetic.division();
        assertEquals(exceptedValue, actualValue);
    }

    @Test
    void toGetFiveWhenDivisionMinusTenAndMinusTwo() {
        Arithmetic arithmetic = new Arithmetic(-10, -2);
        int exceptedValue = 5;
        int actualValue = arithmetic.division();
        assertEquals(exceptedValue, actualValue);
    }

}
