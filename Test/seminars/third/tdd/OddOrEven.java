package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OddOrEven {

    @Test
    void OddNumber(){
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        Integer n = 2;
        assertTrue(EvenOddNumber.analyze(n));
    }
    @Test
    void EvenNumber(){
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        Integer n = 3;
        assertTrue(EvenOddNumber.analyze(n));
    }
}
