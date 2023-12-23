package com.company;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;

    public Shape() {
        this.points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public double calculatePerimeter() {
        double perimeter = 0;
        int size = points.size();

        for (int i = 0; i < size - 1; i++) {
            perimeter += points.get(i).distanceTo(points.get(i + 1));
        }

        perimeter += points.get(size - 1).distanceTo(points.get(0));
        return perimeter;
    }

    public double getAverageSide() {
        double totalLength = 0;
        int size = points.size();

        for (int i = 0; i < size - 1; i++) {
            totalLength += points.get(i).distanceTo(points.get(i + 1));
        }

        totalLength += points.get(size - 1).distanceTo(points.get(0));
        return totalLength / size;
    }

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