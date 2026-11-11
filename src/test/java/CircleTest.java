

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {

    @Test
    void areaOfRadiusOne() {
        assertEquals(Math.PI, circle.area(1), 0.0001);
    }

    @Test
    void areaOfRadiusFive() {
        assertEquals(78.5398, circle.area(5), 0.0001);
    }

    @Test
    void areaOfZeroRadiusIsZero() {
        assertEquals(0.0, circle.area(0), 0.0001);
    }

    @Test
    void areaOfDecimalRadius() {
        assertEquals(19.6349, circle.area(2.5), 0.0001);
    }

    @Test
    void negativeRadiusThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> circle.area(-1));
    }
}