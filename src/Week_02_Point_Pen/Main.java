package Week_02_Point_Pen;

public class Main {

    public static void main(String[] args) {

        Point2D point = new Point2D(3, 5);
        System.out.println(point);

        System.out.println("--------------------------------");

        Point3D point3D = new Point3D(4, 5, 7);
        System.out.println(point3D);

        System.out.println("--------------------------------");

        Pen picasso = new Pen(point, 5.7, "Green", "Ball point", true);
        System.out.println(picasso);


    }

}
