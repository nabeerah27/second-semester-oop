package Week_03.HomeWork;

import Week_03.ClassCode.Point;

public class SlopeCalculator {

    // Two Point objects representing the line endpoints
    private Point p1;
    private Point p2;

    public SlopeCalculator(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    // Method to calculate the slope using the formula:
    // Slope = (y2 - y1) / (x2 - x1)

    public double calculateSlope()
    {
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();

        // If x1 == x2, the line is vertical, hence slope is undefined
        if(x1 == x2)
        {
            System.out.println("Slope is undefined. ");
            return Double.POSITIVE_INFINITY;
        }

        // Calculate and return the slope
        return ((y2 - y1) / (x2 - x1));
    }

    // Overridden toString() method to provide a formatted output for slope calculation
    @Override
    public String toString() {
        double slope = calculateSlope();

        // Handle vertical line case
        if(slope == Double.POSITIVE_INFINITY)
        {
            return "Slope between " + p1 + " and " + p2 + " is undefined (vertical line).";
        }
        else
        {
            return "Slope between " + p1 + " and " + p2 + " is: " + slope;
        }
    }

}
