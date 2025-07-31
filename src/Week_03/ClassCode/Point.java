package Week_03.ClassCode;

public class Point {

    // x and y coordinates of the point
    private double x;
    private double y;

    // Default constructor - creates a point with default values (0.0, 0.0)
    public Point() {

    }

    // Parameterized constructor - allows creating a point with specific x and y values
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x-coordinate
    public double getX() {
        return x;
    }

    // Setter for x-coordinate
    public void setX(double x) {
        this.x = x;
    }

    // Getter for y-coordinate
    public double getY() {
        return y;
    }

    // Setter for y-coordinate
    public void setY(double y) {
        this.y = y;
    }

    // Overridden toString() method to display point in a readable format
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}
