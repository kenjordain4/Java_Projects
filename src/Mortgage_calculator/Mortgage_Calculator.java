package mortgage_calculator;


public class Mortgage_Calculator {

    public static void main(String[] args) {

        int principal = (int) mortgage_console.readNumber("Principal: ", 1000, 1_000_000);
        float annualInterest = (float) mortgage_console.readNumber("Annual Interest Rate: ", 0, 30);
        int years = (int) mortgage_console.readNumber("Years: ", 1, 30);
        var calculator =new mortgage_calculations(principal,annualInterest,years);
        var report = new mortgage_report(calculator);


        report.printMortgage();
        report.printPaymentSchedule();
    }

}