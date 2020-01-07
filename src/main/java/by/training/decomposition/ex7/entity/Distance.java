package by.training.decomposition.ex7.entity;

import by.training.decomposition.ex7.entity.Point;

public class Distance {
    double distance;

    public Distance(int distance) {
        this.distance = distance;
    }
    public Distance(Point A, Point B){
        this.distance = Math.sqrt(Math.pow(B.getX() - A.getX(), 2) + Math.pow(B.getY() - A.getY(), 2));
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Distance{" +
                "distance=" + distance +
                '}';
    }
}
