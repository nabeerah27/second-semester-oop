package Week_03.HomeWork;

import Week_03.ClassCode.Point;

public class QuadrantFinder {

    // Point object to check its quadrant
    private Point p;

    public QuadrantFinder(Point p) {
        this.p = p;
    }

    // Method to find and return the quadrant of the point
    public String findQuadrant() {

        // Get x and y coordinates of the point
        double x = p.getX();
        double y = p.getY();

        // Check each condition to determine the quadrant
        if(x > 0 && y > 0)
            return "in First quadrant";

        else if(x < 0 && y > 0)
            return "in Second quadrant";

        else if(x < 0 && y < 0)
            return "in Third quadrant";

        else if(x > 0 && y < 0)
            return "in Fourth quadrant";

        // If x or y is zero, the point lies on an axis (not in any quadrant)
        else
            return "on axis (not in any quadrant)";

    }

    // Overridden toString() method to display point and its quadrant
    @Override
    public String toString() {
        return "Point " + p + " lies " + findQuadrant();
    }

}
