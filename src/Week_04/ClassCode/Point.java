package Week_04.ClassCode;

public class Point {

    // Attributes of Point (x and y coordinates)
    private double x;
    private double y;

    // Parameterized constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters to access x and y coordinates separately
    public double getX() { return x; }
    public double getY() { return y; }

    // Setter method to update both x and y coordinates at once
    public void set(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Adds another Point's coordinates from the current point
    public Point add(Point A) {

        // Returns a new Point object (does NOT modify the current one)
        return  new Point(this.x + A.x, this.y + A.y);
    }

    // Subtracts another Point's coordinates from the current point
    public Point subtract(Point A) {

        // Returns a new Point object (does NOT modify the current one)
        return new Point(this.x - A.x, this.y - A.y);
    }

    // Converts the point's data into a readable string format
    @Override
    public String toString() {
        return "Point: (" + x + ", " + y + ")";
    }


}
