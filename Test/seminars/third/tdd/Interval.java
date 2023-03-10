package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Interval {
    @Test
    void testGoodNumberInInterval(){
        NumberInInterval numberInInterval = new NumberInInterval();
        Integer n = 57;
        assertTrue(NumberInInterval.analyze(n));
    }
    @Test
    void testBadNumberInInterval(){
        NumberInInterval numberInInterval = new NumberInInterval();
        Integer n = 25;
        assertFalse(NumberInInterval.analyze(n));
    }

}
