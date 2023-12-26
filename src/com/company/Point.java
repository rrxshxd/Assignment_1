package com.company;

public class Point {
    private double x;
    private double y;
    //Creating a constructor to initialize th x and y coordinates of the point
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    //Creating and returning the distance between current point and destination point
    public double distanceTo(Point dest) {
        double deltaX = dest.x - this.x;
        double deltaY = dest.y - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }
    //Representing point in string format
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
