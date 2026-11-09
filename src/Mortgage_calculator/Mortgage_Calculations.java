package mortgage_calculator;

import java.text.NumberFormat;

public class mortgage_calculations {
    private static final int PERCENT = 100;
    private static final int MONTHS_IN_YEAR = 12;
    private int principal;
    private float annualInterest;
    private int years;

    public mortgage_calculations(int principal, float annualInterest, int years) {
        this.principal = principal;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    // 🧠 Mortgage calculation
    public double calculateMortgage() {

        float monthlyInterest = getMonthlyInterest();
        int numberOfPayments = getNumberOfPayments();

        if (monthlyInterest == 0) {
            return principal / (double) numberOfPayments;
        }

        return principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }


    // 💰 Remaining balance
    public double calculateBalance(int paymentsMade) {

        float monthlyInterest = getMonthlyInterest();
        int numberOfPayments = getNumberOfPayments();

        if (monthlyInterest == 0) {
            return principal - (principal * paymentsMade / (double) numberOfPayments);
        }

        return principal *
                (Math.pow(1 + monthlyInterest, numberOfPayments) -
                        Math.pow(1 + monthlyInterest, paymentsMade)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }
    public double [] getRemainingBalance(){
        int numberOfPayments =getNumberOfPayments();
        var balances = new double [getNumberOfPayments()];

        for (int month = 1; month <= numberOfPayments; month++) {
            balances[month-1]= calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(calculateBalance(month)));
        }
        return balances;
    }

    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }

    private int getNumberOfPayments() {
        return years * MONTHS_IN_YEAR;
    }


}
