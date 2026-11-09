package mortgage_calculator;

import java.text.NumberFormat;

public class mortgage_report {

    private final NumberFormat currency;
    private mortgage_calculations calculator;


    public mortgage_report(mortgage_calculations calculator) {
        this.calculator = calculator;
        currency = NumberFormat.getCurrencyInstance();
    }

    // 🖨 Print mortgage
    public  void printMortgage() {
        double mortgage = calculator.calculateMortgage();
        String formatted = currency.format(mortgage);

        System.out.println("\nMORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payment: " + formatted);
    }

    // 📅 Print schedule
    public  void printPaymentSchedule() {

        System.out.println("\nPAYMENT SCHEDULE");
        System.out.println("----------------");
        for (double balance : calculator.getRemainingBalance())
            System.out.println(currency.format(balance));


    }
}
