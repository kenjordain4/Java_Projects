package Mortgage_calculator;

import java.text.NumberFormat;

public class Mortgage_Report {

    private final NumberFormat currency;
    private Mortgage_Calculations calculator;


    public Mortgage_Report(Mortgage_Calculations calculator) {
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
