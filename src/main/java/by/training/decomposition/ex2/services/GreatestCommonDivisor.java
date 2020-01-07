package by.training.decomposition.ex2.services;

public class GreatestCommonDivisor {

    public double findGCD(double A, double B){
        int gcd = 1;
        for(int i = 1; i <= A && i <= B; i++)
        {
            if(A % i==0 && B % i==0)
                gcd = i;
        }
        return gcd;
    }
}
