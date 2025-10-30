public class AdvancedScientificCalculator extends ScientificCalculator{
//    계산기 v4.0 개발
//    이슈 : https://github.com/doeun28/java-Calculator/issues/13#issue-3568596544

    public void setNumber(int num1) {
        this.num1 = num1;
    }

//    반복문을 사용해 n! (팩토리) 구하기
//    이슈 : https://github.com/doeun28/java-Calculator/issues/14#issue-3568602379

    public int factorial() {
        result = num1;
        for (int i = num1 - 1; i >= 2; i--) {
            result *= i;
        }
        return result;
    }

    @Override
    public void displayResult(String operator) {
        System.out.println(num1 + operator + " = " + result);
    }
}
