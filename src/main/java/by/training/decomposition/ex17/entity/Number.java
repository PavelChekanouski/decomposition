package by.training.decomposition.ex17.entity;

import java.util.Arrays;

public class Number {
    int[] digits;
    int length;

    public int getLength() {
        return length;
    }

    public int[] getDigits() {
        return digits;
    }

    public Number(int number) {
        int[] digits = new int[9];
        int length  = 0;
        while(number > 0){
            digits[length] = number % 10;
            length++;
            number/=10;
        }
        this.digits = digits;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Number{" +
                "digits=" + Arrays.toString(digits) +
                ", length=" + length +
                '}';
    }
}
