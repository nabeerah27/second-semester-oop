package Week_04.ClassCode;

public class Pen {

    // CP = Current Position of the pen (represented as a Point)
    private Point CP;

    // Constructor to initialize the pen's starting position
    public Pen(Point point) {
        this.CP = point;
    }

    // Moves the pen to a new position using a Point object
    // Creates a new Point to avoid referencing the same object
    public void moveTo(Point A) {
        CP = new Point(A.getX(), A.getY());
    }

    // Draws a line from the current position to the new (x, y) coordinates
    // and updates the pen's current position
    public void lineTo(double x, double y) {
        this.CP = new Point(x, y); // Update current position
    }

    // Returns the current position of the pen
    public Point getPosition() {
        return this.CP;
    }

}
