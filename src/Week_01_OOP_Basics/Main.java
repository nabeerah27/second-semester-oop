package Week_01_OOP_Basics;

public class Main {

    public static void main(String[] args) {

        Student s = new Student("Nabeerah Yaqoot", 20, 11);
        s.printInfo();

        System.out.println("-------------------------------");

        Movie movie = new Movie("Interstellar", "Science Fiction");
        movie.getMovieInfo();

        System.out.println("-------------------------------");

        MobilePhone mobile = new MobilePhone("Xiaomi", 47000);
        mobile.showSpecs();

        System.out.println("-------------------------------");

        String[] features = {"Air conditioning", "LED", "Lights", "Air bags", "Parking sensors"};
        Vehicle myCar = new Vehicle("Brown", "BMW", 2022, features);
        myCar.printDetails();

    }

}
