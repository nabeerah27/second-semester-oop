package Week_02.ClassCode;

public class Main {

    public static void main(String[] args) {

        Point2D point = new Point2D(3, 5);
        Pen myPen = new Pen(point, 2.36, "Green", "Ball pen", true);
        System.out.println(myPen);

        Point3D point3D = new Point3D(4, 5, 7);
        System.out.println(point3D);

    }

}
