package Mortgage_calculator;


public class Mortgage_Calculator {

    public static void main(String[] args) {

        int principal = (int) Mortgage_Console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) Mortgage_Console.readNumber("Annual Interest Rate: ", 0, 30);
        int years = (int) Mortgage_Console.readNumber("Years: ", 1, 30);
        var calculator =new Mortgage_Calculations(principal,annualInterest,years);
        var report = new Mortgage_Report(calculator);


        report.printMortgage();
        report.printPaymentSchedule();
    }

}