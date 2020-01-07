package by.training.decomposition.ex7.dal;

import by.training.decomposition.ex7.entity.Point;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PointReader {
    public void read(ArrayList<Point> list) throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X: ");
        int X = scanner.nextInt();
        System.out.println("Enter Y: ");
        int Y = scanner.nextInt();

        list.add(new Point(X, Y));
    }
}
