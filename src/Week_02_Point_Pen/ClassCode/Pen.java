package Week_02_Point_Pen.ClassCode;

public class Pen {

    private Point2D position;
    private boolean isVisible;      // Indicates whether the pen is visible or not
    private double size;           // Thickness of the pen
    private String color;
    private String type;          // Type of pen (e.g., "ballpoint", "gel")

    // Constructor to initialize all pen attributes
    public Pen(Point2D pos, double size, String color, String type, boolean visible) {
        this.position = pos;
        this.size = size;
        this.color = color;
        this.type = type;
        this.isVisible = visible;
    }

    // Getter for position
    public Point2D getPosition() {
        return position;
    }

    // Setter for position (updates pen location)
    public void setPosition(Point2D position) {
        this.position = position;
    }

    // Getter to check if pen is visible
    public boolean isVisible() {
        return isVisible;
    }

    // Setter to change pen visibility
    public void setVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }

    @Override
    public String toString() {
        return "Position at " + position +
                "\nColor: " + color +
                "\nSize: " + size +
                "\nType: " + type +
                "\nisVisible: " + isVisible;
    }

}
