package by.training.decomposition.ex12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter X: ");
                double X = scanner.nextDouble();
                System.out.println("Enter Y: ");
                double Y = scanner.nextDouble();
                System.out.println("Enter Z: ");
                double Z = scanner.nextDouble();
                System.out.println("Enter T: ");
                double T = scanner.nextDouble();
                if (X == 0 || Y == 0 || Z == 0 || T == 0) break;
                double XY = Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2));

                double perimeter = XY + Z + T;

                double square = Math.sqrt(perimeter * (perimeter - XY) * (perimeter - Z) * (perimeter - T));

                System.out.println("Result square: " + (0.5 * X * Y + square));

            }catch(InputMismatchException e){
                System.out.println("Enter valid data.");
            }
        }
    }
}
