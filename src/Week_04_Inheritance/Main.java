package Week_04_Inheritance;

public class Main {

    // Main method provided by the teacher in the class
    public static void main(String[] args) {

        Point P = new Point(1, 2);
        Point Q = new Point(2, 2);

        System.out.println(P);
        P.set(10, 10);
        Q.set(5, 5);
        P.add(Q);

        System.out.println(P);
        Point R = P.subtract(Q);
        System.out.println(P);
        System.out.println(R);

        Pen picasso = new Pen(R);
        picasso.moveTo(P);

        System.out.println("_______________________________________________");
        P = R;
        System.out.println(P);

    }

}
