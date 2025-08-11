package Week_03_Geometry;

import Week_02_Point_Pen.Point2D;

public class MidPointCalculator {

    private Point2D p1;
    private Point2D p2;

    public MidPointCalculator(Point2D p1, Point2D p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // Method to calculate the midpoint between two points
    public Point2D calculateMidPoint()
    {
        // Using midpoint formula:
        double midX = (p1.getX() + p2.getX()) / 2;
        double midY = (p1.getY() + p2.getY()) / 2;

        // Create and return a new Point object representing the midpoint
        return new Point2D (midX, midY);
    }

    // Overridden toString() method to display both points and their calculated midpoint
    public String toString() {
        return "The mid point of " + p1 + " and " + p2 + " is: " + calculateMidPoint();
    }

}
