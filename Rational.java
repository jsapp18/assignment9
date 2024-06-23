import java.math.BigInteger;

public class Rational extends Number implements Comparable<Rational>{
    private BigInteger[] tester = new BigInteger[2];
    private static int numerator = 0;
    private static int denominator = 1;
 
    //makes a rational
    public Rational(){
        this(BigInteger.ZERO, BigInteger.ONE);
    }

    //makes a rational with a num and den
    public Rational(BigInteger numerator1, BigInteger denominator1){
        tester[numerator] = numerator1;
        tester[denominator] = denominator1;
    }


    //make a big int 
    private BigInteger gcd(BigInteger first, BigInteger second){
        BigInteger try1 = first.abs();
        BigInteger try2 = second.abs();
        BigInteger remainder = try1.remainder(try2);
        while (!remainder.equals(BigInteger.ZERO)){
            try1 = try2;
            try2 = remainder;
            remainder = try1.remainder(try2);
        }
        return try2;
    }

    //gets num
    public BigInteger getNumerator(){
        return tester[numerator];
    }

   
    //gets den
    public BigInteger getDenominator(){
        return tester[denominator];
    }

    // addition
    public Rational add(Rational secondRational){
        BigInteger thing1 = tester[numerator].multiply(secondRational.getDenominator()).add(tester[denominator].multiply(secondRational.getNumerator()));
        BigInteger thing2 = tester[denominator].multiply(secondRational.getDenominator());
        return new Rational(thing1, thing2);
    }

    //subtraction
    public Rational subtract(Rational secondRational){
        BigInteger thing1 = tester[numerator].multiply(secondRational.getDenominator()).subtract(tester[denominator].multiply(secondRational.getNumerator()));
        BigInteger thing2 = tester[denominator].multiply(secondRational.getDenominator());
        return new Rational(thing1, thing2);
    }

    //multiply
    public Rational multiply(Rational secondRational){
        BigInteger thing1 = tester[numerator].multiply(secondRational.getNumerator());
        BigInteger thing2 = tester[denominator].multiply(secondRational.getDenominator());
        return new Rational(thing1, thing2);
    }

   //divide
    public Rational divide(Rational secondRational){
        BigInteger thing1 = tester[numerator].multiply(secondRational.getDenominator());
        BigInteger thing2 = tester[denominator].multiply(secondRational.tester[numerator]);
        return new Rational(thing1, thing2);
    }

    //displays the thing
    @Override
    public String toString(){
        return tester[numerator] +"/"+ tester[denominator];
    }

    //equals??? 
    public boolean equals(Object parm1){
        return(this.subtract((Rational) (parm1))).getNumerator().equals(BigInteger.ZERO);
    }


    //converts to hashcode
    public int hashCode(){
        return 0;
    }

    //converts to int
    public int intValue(){
        return (int) doubleValue();
    }

    //converts to long
    @Override
    public long longValue(){
        return 0;
    }

    //converts to float
    public float floatValue(){
        return (float) doubleValue();
    }

    //gets double
    @Override
    public double doubleValue(){
        double r1 = Double.parseDouble(tester[0].toString());
        double r2 = Double.parseDouble(tester[1].toString());

        return r1 / r2;
    }

    //compares
    @Override
    public int compareTo(Rational o){
        return (int) subtract(o).doubleValue();
    }
}
    

