public class Main {
    public static void main(String[] args) {
        Calculator calc_add = new Calculator();
        calc_add.setNumbers(5, 3);
        calc_add.add();
        calc_add.displayResult("+");
        AdvancedCalculator calc_mul = new AdvancedCalculator();
        calc_mul.setNumbers(10,2);
        calc_mul.multiply();
        calc_mul.displayResult("*");
        AdvancedCalculator calc_div = new AdvancedCalculator();
        calc_div.setNumbers(20,2);
        calc_div.divide();
        calc_div.displayResult("/");
        AdvancedCalculator calc_mod = new AdvancedCalculator();
        calc_mod.setNumbers(20,2);
        calc_mod.mod();
        calc_mod.displayResult("%");

    }
}