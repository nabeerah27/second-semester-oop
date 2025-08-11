package Week_02_Point_Pen;

// Represents a point in 3D space by extending the 2D point (Point2D)
public class Point3D extends Point2D {

    // Additional coordinate for the third dimension (z-axis)
    private double z;

    // Constructor to initialize x, y (from Point2D) and z
    public Point3D(double x, double y, double z) {
        super(x, y);  // Call parent constructor to set x and y
        this.z = z;
    }

    // Getter method to access z-coordinate
    public double getZ() {
        return z;
    }

    // Setter method to update z-coordinate
    public void setZ(double z) {
        this.z = z;
    }

    public String toString() {
        return "Point (" + getX() + "," + getY() + "," + getZ() + ")";
    }

}
