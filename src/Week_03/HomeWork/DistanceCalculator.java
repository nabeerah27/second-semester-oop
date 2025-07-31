package Week_03.HomeWork;

import Week_03.ClassCode.Point;

public class DistanceCalculator {

    private Point p1;
    private Point p2;

    public DistanceCalculator(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // Method to calculate the Euclidean distance between the two points
    public double calculateDistance()
    {
        // Extracting x and y coordinates of both points
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();

        // Using distance formula: √((x2 - x1)² + (y2 - y1)²)
        double value = Math.pow((y2 - y1), 2) + Math.pow((x2 - x1), 2);
        return Math.sqrt(value);
    }

    // Overridden toString() method to display both points and their calculated distance
    @Override
    public String toString() {
        return "Distance between " + p1 + " and " + p2 + " is: " + calculateDistance();
    }

}
