public class Calculator {
    int num1;
    int num2;
    int result;

    public void setNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;

    }
    public int add(){
        result = num1 + num2;
        return result;
    }
    public int subtract(){
        result = num1 - num2;
        return result;
    }
    public int multiply(){
        result = 0;
        for(int i = 0; i < num2; i++)
            result = result + num1;
        return result;
    }
    public int divide(){
        int quotient = 0;
        int currentNum1 = num1;
        while (currentNum1 >= num2) {
                currentNum1 -= num2; quotient++;
        }
        result = quotient;
        return result;
    }
    public void displayResult(String operator) {
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);

    }
}
