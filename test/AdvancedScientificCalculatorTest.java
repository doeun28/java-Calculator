import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//팩토리얼단위테스트 완료
//https://github.com/doeun28/java-Calculator/issues/15#issue-3568604366

class AdvancedScientificCalculatorTest {
        AdvancedScientificCalculator fac_calc;

        @BeforeEach
        void setUp() {
            AdvancedScientificCalculator fac_calc = new AdvancedScientificCalculator(); // 객체 생성
            fac_calc .setNumber(4);

        }

        @Test
        void fac() {
            assertEquals(24, fac_calc.factorial());
        }
    }