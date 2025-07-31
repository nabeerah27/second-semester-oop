package Week_03.HomeWork;

import Week_03.ClassCode.Point;

public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(8, -2);
        Point p2 = new Point(-1, 8);

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
