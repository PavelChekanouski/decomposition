package by.training.decomposition.ex7.controller;

import by.training.decomposition.ex7.dal.PointReader;
import by.training.decomposition.ex7.entity.Point;
import by.training.decomposition.ex7.entity.Distance;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                ArrayList<Point> points = new ArrayList<>();
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter number(more than 1) of points: \nOr 0 to exit.");
                int n = scanner.nextInt();

                if(n == 0){
                    break;
                }

                for(int i = 0; i < n; i++){
                    new PointReader().read(points);
                }

                ArrayList<Distance> distances = new ArrayList<>(n);

                for(int i = 0; i < n - 1 ; i++){
                    distances.add(new Distance(points.get(i), points.get(i+1)));
                }

                double maxDistance = distances.get(1).getDistance();
                int maxDistanceIndex = 0;

                for(int i = 0; i < n - 2; i++){
                    if(distances.get(i).getDistance() > maxDistance){
                        maxDistance = distances.get(i).getDistance();
                        maxDistanceIndex = i;
                    }
                }

                System.out.println("The longest distance: " + maxDistance + " between: " + points.get(maxDistanceIndex) + " and " + points.get(maxDistanceIndex + 1));
            } catch (InputMismatchException e) {
                System.out.println("Invalid data.");
                break;
            }
        }
    }
}
