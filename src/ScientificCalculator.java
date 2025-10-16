public class ScientificCalculator extends AdvancedCalculator{
    // 계산기 V3.0 개발
    //  이슈;https://github.com/doeun28/java-Calculator/issues/7

    //나머지 연산자로 나머지 구하기 완료
    //https://github.com/doeun28/java-Calculator/issues/8

    @Override
    public int mod() {
        result = num1 % num2;
        return result;
    }
}

