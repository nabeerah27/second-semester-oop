package Week_02_Point_Pen.ClassCode;

// Represents a point in 2D space with x and y coordinates
public class Point2D {

    // Private fields to store the x and y coordinates
    private int x;
    private int y;

    // Parameterized constructor to initialize the point with given x and y values
    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getters to access x and y coordinates
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    // Setters to update x and y coordinates
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "Point (" + getX() + "," + getY() + ")";
    }

}
