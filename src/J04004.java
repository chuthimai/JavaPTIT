//J04004 TỔNG PHÂN SỐ

import java.util.Scanner;

public class J04004 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Fraction0 f1 = new Fraction0(scanner.nextLong(), scanner.nextLong());
        Fraction0 f2 = new Fraction0(scanner.nextLong(), scanner.nextLong());
        System.out.println(Fraction0.sum(f1, f2));
    }
}


class Fraction0 {
    private long numerator;
    private long denominator;
    public Fraction0(long numerator, long denominator) {
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
    private void convert(long n){
        numerator = numerator*n;
        denominator = denominator*n;
    }
    public static Fraction0 sum(Fraction0 f1, Fraction0 f2){
        long ucln = gcd(f1.denominator, f2.denominator);
        f1.convert(f2.denominator/ucln);
        f2.convert(f1.denominator/f2.denominator);
        return new Fraction0(f1.numerator+f2.numerator, f1.denominator);
    }
    @Override
    public String toString(){
        if (numerator == 0) return "0";
        else if(denominator == 0) return "INVALID";
        else return numerator+"/"+denominator;
    }
}

