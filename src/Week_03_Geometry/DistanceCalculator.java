package Week_03_Geometry;

import Week_02_Point_Pen.Point2D;

public class DistanceCalculator {

    private Point2D p1;
    private Point2D p2;

    public DistanceCalculator(Point2D p1, Point2D p2) {
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
