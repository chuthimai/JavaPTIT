//J04003 PHÂN SỐ

import java.util.Scanner;

public class J04003 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Fraction0 fraction = new Fraction0(scanner.nextLong(), scanner.nextLong());
        System.out.println(fraction);
    }
}


class Fraction {
    private long numerator;
    private long denominator;
    public Fraction(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.compact();
    }
    public static long gcd(long a,long b){
        while (a*b != 0){
            if (a > b) a %= b;
            else b %= a;
        }
        return a + b;
    }
    private void compact(){
        if (numerator == 0 || denominator == 0) return;
        else {
            long ucln = gcd(numerator, denominator);
            numerator = numerator/ucln;
            denominator = denominator/ucln;
        }
    }
    @Override
    public String toString(){
        if (numerator == 0) return "0";
        else if(denominator == 0) return "INVALID";
        else return numerator+"/"+denominator;
    }
}

