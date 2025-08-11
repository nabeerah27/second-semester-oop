package Week_03_Geometry;

import Week_02_Point_Pen.Point2D;

public class Main {

    public static void main(String[] args) {

        Point2D p1 = new Point2D (8, -2);
        Point2D p2 = new Point2D (-1, 8);

        SlopeCalculator slope = new SlopeCalculator(p1, p2);
        System.out.println(slope);

        DistanceCalculator distance = new DistanceCalculator(p1, p2);
        System.out.println(distance);

        MidPointCalculator midPoint = new MidPointCalculator(p1, p2);
        System.out.println(midPoint);

        QuadrantFinder point1 = new QuadrantFinder(p1);
        System.out.println(point1);

        QuadrantFinder point2 = new QuadrantFinder(p2);
        System.out.println(point2);

    }

}
