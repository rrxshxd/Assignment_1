package com.company;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;
        //Constructor that initialize a shape with an array of points
    public Shape() {
        this.points = new ArrayList<>();
    }
    //Adding a point to the container
    public void addPoint(Point point) {
        points.add(point);
    }
    //Calculating and returning the perimeter of the shape
    public double calculatePerimeter() {
        double perimeter = 0;
        int size = points.size();

        for (int i = 0; i < size - 1; i++) {
            perimeter += points.get(i).distanceTo(points.get(i + 1));
        }

        perimeter += points.get(size - 1).distanceTo(points.get(0));
        return perimeter;
    }
    //Calculating and returning the average side of the shape
    public double getAverageSide() {
        double totalLength = 0;
        int size = points.size();

        for (int i = 0; i < size - 1; i++) {
            totalLength += points.get(i).distanceTo(points.get(i + 1));
        }

        totalLength += points.get(size - 1).distanceTo(points.get(0));
        return totalLength / size;
    }
    //Finding and returning the longest side of the shape
    public double getLongestSide() {
        double maxLength = 0;
        int size = points.size();

        for (int i = 0; i < size - 1; i++) {
            double currentLength = points.get(i).distanceTo(points.get(i + 1));
            maxLength = Math.max(maxLength, currentLength);
        }

        maxLength = Math.max(maxLength, points.get(size - 1).distanceTo(points.get(0)));
        return maxLength;
    }
}
