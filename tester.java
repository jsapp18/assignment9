import java.math.BigInteger;
import java.util.Scanner;
public class tester{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first rational number: ");
        BigInteger numerator = scanner.nextBigInteger();
        BigInteger denominator = scanner.nextBigInteger();
        Rational number1 = new Rational(numerator, denominator);
        System.out.print("Enter the second rational number: ");
        numerator = scanner.nextBigInteger();
        denominator = scanner.nextBigInteger();
        Rational number2 = new Rational(numerator, denominator);
        System.out.println(number1 + " + " + number2 + " = " + (number1.add(number2)));
        System.out.println(number1 + " - " + number2 + " = " + (number1.subtract(number2)));
        System.out.println(number1 + " * " + number2 + " = " + (number1.multiply(number2)));
        System.out.println(number1 + " / " + number2 + " = " + (number1.divide(number2)));
        System.out.println(number2 + " is " + number2.doubleValue());
    }
}