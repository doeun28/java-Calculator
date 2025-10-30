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
        ScientificCalculator calc_mod = new ScientificCalculator();
        calc_mod.setNumbers(7,3);
        calc_mod.mod();
        calc_mod.displayResult("%");

        AdvancedScientificCalculator calc_fac = new AdvancedScientificCalculator();
        calc_fac.setNumber(4);
        calc_fac.factorial();
        calc_fac.displayResult("!");

    }
}