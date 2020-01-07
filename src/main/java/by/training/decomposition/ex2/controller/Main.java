package by.training.decomposition.ex2.controller;

import by.training.decomposition.ex2.services.GreatestCommonDivisor;
import by.training.decomposition.ex2.services.LeastCommonMultiple;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter number A: \nOr 0 to exit");
                int A = scanner.nextInt();
                System.out.println("Enter number B: \nOr 0 to exit");
                int B = scanner.nextInt();

                if(A == 0 || B ==0) break;

                GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();

                LeastCommonMultiple leastCommonMultiple = new LeastCommonMultiple();

                System.out.println("Greatest Common Divisor: " + greatestCommonDivisor.findGCD(A, B) + "\n"
                        + "Least Common Multiple: " + leastCommonMultiple.findLCM(A, B));
            } catch (InputMismatchException e) {
                System.out.println("Enter valid data.");
            }
        }
    }
}
