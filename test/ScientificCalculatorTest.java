import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//나머지 연산자로 나머지 구하기 단위테스트 완료
//https://github.com/doeun28/java-Calculator/issues/9

class ScientificCalculatorTest {
    ScientificCalculator advancedScientificCalc;

    @BeforeEach
    void setUp() {
        advancedScientificCalc = new ScientificCalculator(); // 객체 생성
        advancedScientificCalc.setNumbers(7,3);

    }

    @Test
    void mod() {
        assertEquals(1, advancedScientificCalc.mod());
    }
}