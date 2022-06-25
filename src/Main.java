
import java.text.NumberFormat;
import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            long principal;
            float annualInterest;
            byte years;
            byte numberOfCompoundingPeriod;

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your Principal: ");
            principal = (long) scanner.nextLong();
            System.out.println("Enter annual interest: ");
            annualInterest = (float) scanner.nextFloat();
            System.out.println("Enter number of years: ");
            years = (byte) scanner.nextByte();
            System.out.println("Enter number of compound period: ");
            numberOfCompoundingPeriod = (byte) scanner.nextByte();

            CompoundInterest calculate = new CompoundInterest(principal,annualInterest, numberOfCompoundingPeriod,years);
            var result = calculate.calculateCompoundInterest();
            String currencyFormatedResult = NumberFormat.getCurrencyInstance().format(result);
            System.out.print("Your principal is: " + principal + ", ");
            System.out.print("your annual interest is: " + annualInterest + ", ");
            System.out.print("your number of years is: " + years + ", ");
            System.out.println("your number of compound period is: " + numberOfCompoundingPeriod + ". ");
            System.out.println("Your compound interest is: " + currencyFormatedResult);
        }
    }


