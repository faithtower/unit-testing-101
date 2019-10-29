package test;

import io.turntabl.maths.Numbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
    int res = 3;

    @Test
    void sumTwonumbers() {
        assertEquals(res, Numbers.sumTwonumbers(1, 2));
    }

    @Test
    void isPositive() {
        assertTrue(Numbers.isPositive(1));
    }

    @Test
    void isNegative() {
        assertFalse(Numbers.isNegative(3));
    }
}
