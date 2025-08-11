package Week_02_Point_Pen;

// Represents a point in 2D space with x and y coordinates
public class Point2D {

    // Private fields to store the x and y coordinates
    private double x;
    private double y;

    // Parameterized constructor to initialize the point with given x and y values
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters to access x and y coordinates
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    // Setters to update x and y coordinates
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }

}
