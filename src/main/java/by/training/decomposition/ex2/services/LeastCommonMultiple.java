package by.training.decomposition.ex2.services;

import by.training.decomposition.ex2.services.GreatestCommonDivisor;

public class LeastCommonMultiple {
    public double findLCM(double A, double B){
        GreatestCommonDivisor GCD = new GreatestCommonDivisor();
        return  ((A*B) / GCD.findGCD(A, B));
    }
}
