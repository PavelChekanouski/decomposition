package by.training.decomposition.ex17;

import by.training.decomposition.ex17.entity.Number;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Number number;

            int[] digits;
            try {
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                if (n == 0) break;
                for (int i = 1; i <= n; i++) {
                    number = new Number(i);
                    int sum = 0;
                    for (int j = 0; j < number.getLength(); j++) {
                        digits = number.getDigits();
                        sum += Math.pow(digits[j], number.getLength());
                    }
                    if (sum == i) {
                        System.out.println("Armstrong numbers: " + i);
                    }

                }
            } catch (InputMismatchException e) {
                System.out.println("Enter valid data.");
            }
        }
    }
}
