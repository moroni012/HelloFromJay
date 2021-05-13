package cavalcanti;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalc {
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENT = 100;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Principal: ");
    int principal = scanner.nextInt();

    System.out.print("Annual Interest Rate: ");
    float annualInterest = scanner.nextFloat();
    float monthlyInterest = annualInterest / MONTHS_IN_YEAR / PERCENT;

    System.out.print("Period (Year): ");
    float period = scanner.nextInt();
    float numberOfPayements = period * MONTHS_IN_YEAR;

    double mortgage = principal *
            (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayements) - 1)
            / (Math.pow(1 + monthlyInterest, numberOfPayements) - 1);

    String mortgageFormatted = toString(NumberFormat.getCurrencyInstance(mortgage));
    System.out.print("Mortgage: " + )

    }

