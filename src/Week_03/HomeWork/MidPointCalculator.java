package Week_03.HomeWork;

import Week_03.ClassCode.Point;

public class MidPointCalculator {

    private Point p1;
    private Point p2;

    public MidPointCalculator(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // Method to calculate the midpoint between two points
    public Point calculateMidPoint()
    {
        // Using midpoint formula:
        double midX = (p1.getX() + p2.getX()) / 2;
        double midY = (p1.getY() + p2.getY()) / 2;

        // Create and return a new Point object representing the midpoint
        return new Point(midX, midY);
    }

    // Overridden toString() method to display both points and their calculated midpoint
    public String toString() {
        return "The mid point of " + p1 + " and " + p2 + " is: " + calculateMidPoint();
    }

}
