package com.pluralsight;
import java.sql.SQLOutput;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Moni calculator");
        double monthlypayment = 0;
        double monthlyinterestrate = 0;


        System.out.print("Enter the loan principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Annual interest rte: ");
        double interestrate = scanner.nextDouble();

        System.out.print("Loan length : ");
        double years = scanner.nextDouble();

        monthlypayment = years * 12;
        monthlyinterestrate = interestrate / 12;

        //M=P×(i*(1+i)^n / ((1+i)^n)-1)


        double monthPayment = principal * (monthlyinterestrate * Math.pow(1 + monthlyinterestrate, monthlypayment)) /
                (Math.pow(1 + monthlyinterestrate, monthlypayment)-1);

        System.out.printf("Monthly Payment: %.2f", monthlypayment);
        System.out.printf("Total Interest paid: %2f", interestrate);













    }
}
